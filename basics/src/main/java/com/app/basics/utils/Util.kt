package com.app.basics.utils

import android.annotation.SuppressLint
import android.app.ActivityManager
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.media.MediaMetadataRetriever
import android.support.v4.content.FileProvider
import android.text.Editable
import android.text.TextUtils
import android.util.TypedValue
import com.blankj.utilcode.util.SPUtils
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.lcw.library.imagepicker.provider.ImagePickerProvider
import com.trading.basics.bus.RxBus
import com.trading.basics.constant.Constants
import com.trading.basics.event.FinishEvent
import com.trading.basics.event.MainSwitchEvent
import java.io.File
import java.util.*
import kotlin.collections.ArrayList


/**
 * Created by 无人认领 on 2020/5/14.
 * 常用工具类
 */
class Util private constructor() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        private var context: Context? = null

        /**
         * 初始化工具类
         *
         * @param context 上下文
         */
        fun init(context: Context) {
            Companion.context = context.applicationContext
        }

        /**
         * 获取ApplicationContext
         *
         * @return ApplicationContext
         */
        @JvmStatic
        fun getContext(): Context {
            if (context != null) {
                return context!!
            }
            throw NullPointerException("should be initialized in application")
        }

        fun dipDimensionInteger(context: Context?, value: Float): Int {
            return (dipDimensionFloat(context, value) + 0.5f).toInt()
        }

        fun dipDimensionFloat(context: Context?, value: Float): Float {
            return if (context == null) value else TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, value, context.resources
                    .displayMetrics)
        }

        //毫秒换成00:00:00
        fun getCountTimeByLong(finishTime: Long): String {
            var totalTime = (finishTime / 1000).toInt()//秒
            var hour = 0
            var minute = 0
            var second = 0

            if (3600 <= totalTime) {
                hour = totalTime / 3600
                totalTime -= 3600 * hour
            }
            if (60 <= totalTime) {
                minute = totalTime / 60
                totalTime -= 60 * minute
            }
            if (0 <= totalTime) {
                second = totalTime
            }
            val sb = StringBuilder()

            if (hour < 10) {
                sb.append("0").append(hour).append(":")
            } else {
                sb.append(hour).append(":")
            }
            if (minute < 10) {
                sb.append("0").append(minute).append(":")
            } else {
                sb.append(minute).append(":")
            }
            if (second < 10) {
                sb.append("0").append(second)
            } else {
                sb.append(second)
            }
            return sb.toString()
        }

        /**
         * 播放视频
         */
        fun playVideo(mContext: Context, videoPath: String) {
            //实现播放视频的跳转逻辑(调用原生视频播放器)
            val intent = Intent(Intent.ACTION_VIEW)
            val uri = FileProvider.getUriForFile(mContext, ImagePickerProvider.getFileProviderName(mContext), File(videoPath))
            intent.setDataAndType(uri, "video/*")
            //给所有符合跳转条件的应用授权
            //给所有符合跳转条件的应用授权
            val resInfoList = mContext.packageManager
                    .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)
            for (resolveInfo in resInfoList) {
                val packageName = resolveInfo.activityInfo.packageName
                mContext.grantUriPermission(packageName, uri, Intent.FLAG_GRANT_READ_URI_PERMISSION
                        or Intent.FLAG_GRANT_WRITE_URI_PERMISSION)
            }
            mContext.startActivity(intent)
        }


        /**
         * 重组String类型数据为数组
         * "['','','','']"==>[]
         */
        fun reorganizationString2Arraylist(originString: String): ArrayList<String> {
            var arrayList = ArrayList<String>()
            if (!TextUtils.isEmpty(originString)) {
                try {
                    val imageUrls: List<String> = Gson().fromJson(originString, object : TypeToken<List<String?>?>() {}.type)
                    for (imgUrl in imageUrls) {
                        arrayList.add(imgUrl)
                    }
                } catch (e: Exception) {
                    LogUtils.e("reorganizationString2Arraylist", e.message)
                }
            }
            return arrayList
        }

        /**
         * 当字符串中存在[]
         */
        fun getRealPath(originString: String): String {
            if (TextUtils.isEmpty(originString)) {
                return ""
            }
            if (originString.contains("[")) {
                var arrlist = reorganizationString2Arraylist(originString)
                if (arrlist.isNotEmpty()) {
                    return arrlist[0]
                }
            }
            return originString
        }

        /**
         * 重组数据，排序，从小到大
         */
        fun repleaseDataWithSort(originStr: String, splitSymbol: String): List<String>? {
            var list: List<String>? = null
            if (!TextUtils.isEmpty(originStr)) {
                if (originStr.contains(splitSymbol)) {
                    list = originStr.split(splitSymbol)
                    Collections.sort(list)
                }
            }
            return list
        }

        /**
         * 退出登录
         * @intent 将要启动的新activity
         */
        fun signOut(context: Context, intent: Intent?) {
            //清除用户信息,本地保存的用户设置信息
            SPUtils.getInstance().remove(Constants.SP_USER)
            SPUtils.getInstance().remove(Constants.FAKE_TOKEN)
            SPUtils.getInstance().remove(Constants.SP_LOCAL_NOTICE_SETTING)
            SPUtils.getInstance().remove(Constants.SP_LOCAL_OSS_INFO)
            //首页TAB切换为置换中心
            RxBus.default.post(MainSwitchEvent(MainSwitchEvent.POSITION_TRAd))
            RxBus.default.post(FinishEvent(FinishEvent.CODE_LOGIN_OUT))
            //intent。context不为空则启动intent
            intent?.apply {
                context.startActivity(intent)
            }
        }

        /**
         *输入校验
         * afterDot：小数点后位数
         * beforeDot：小数点前位数(-1不做限制)
         */
        fun judge(editable: Editable, afterDot: Int, beforeDot: Int) {
            val temp = editable.toString()
            val posDot = temp.indexOf(".")
            //直接输入小数点的情况
            if (posDot == 0) {
                editable.insert(0, "0")
                return
            }
            //连续输入0
            if (temp == "00") {
                editable.delete(1, 2)
                return
            }
            //输入"08" 等类似情况
            if (temp.startsWith("0") && temp.length > 1 && (posDot == -1 || posDot > 1)) {
                editable.delete(0, 1)
                return
            }
            //不包含小数点 不限制小数点前位数
            if (posDot < 0 && beforeDot == -1) {
                //do nothing 仅仅为了理解逻辑而已
                return
            } else if (posDot < 0 && beforeDot != -1) {
                //不包含小数点 限制小数点前位数
                if (temp.length <= beforeDot) {
                    //do nothing 仅仅为了理解逻辑而已
                } else {
                    editable.delete(beforeDot, beforeDot + 1)
                }
                return
            }
            //如果包含小数点 限制小数点后位数
            if (temp.length - posDot - 1 > afterDot && afterDot != 0) {
                editable.delete(posDot + afterDot + 1, posDot + afterDot + 2)//删除小数点后多余位数
            }
        }

        /**
         * 判断某个界面是否在前台
         *
         * @param mContext 要判断的Context
         * @return 是否在前台显示
         */
        fun isForeground(mContext: Context): Boolean {
            return isForeground(mContext, mContext.javaClass.name)
        }

        /**
         * 判断某个界面是否在前台
         *
         * @param context   Context
         * @param className 界面的类名
         * @return 是否在前台显示
         */
        fun isForeground(mContext: Context?, className: String): Boolean {
            if (mContext == null || TextUtils.isEmpty(className)) return false
            val am = mContext.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
            val list = am.getRunningTasks(1)
            if (list != null && list.size > 0) {
                val cpn = list[0].topActivity
                if (className == cpn.className) {
                    return true
                }
            }
            return false
        }

        //复制功能
        fun copy(mContext: Context, str: String) {
            var clipboardManager = mContext.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            clipboardManager.primaryClip = ClipData.newPlainText(null, str)
            if (clipboardManager.hasPrimaryClip()) {
                clipboardManager.primaryClip?.getItemAt(0)?.text
            }
            ToastUtil.show("复制成功")
        }


        /**
         * 获取网络视频第第一帧
         */
        fun getNetVideoBitmap(videoUrl: String): Bitmap? {
            var bitmap: Bitmap? = null
            var retriever = MediaMetadataRetriever()
            try {
                //根据url获取缩略图
                retriever.setDataSource(videoUrl, HashMap())
                //获得第一帧图片
                bitmap = retriever.frameAtTime
            } catch (e: IllegalArgumentException) {
                e.printStackTrace()
            } finally {
                retriever.release()
            }
            return bitmap
        }
    }

    init {
        throw UnsupportedOperationException("u can't instantiate me...")
    }
}