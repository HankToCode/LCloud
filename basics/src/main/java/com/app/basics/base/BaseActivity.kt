package com.app.basics.base

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.widget.ContentFrameLayout
import com.app.basics.MyApplication
import com.app.basics.R
import com.app.basics.bus.RxSubscriptions
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
import com.trello.rxlifecycle3.components.support.RxAppCompatActivity
import io.reactivex.annotations.NonNull
import io.reactivex.disposables.Disposable
import pub.devrel.easypermissions.AppSettingsDialog
import pub.devrel.easypermissions.EasyPermissions


/**
 * @author HankGreen
 * created: 2017/10/25
 * desc:BaseActivity基类
 */
abstract class BaseActivity : RxAppCompatActivity(), EasyPermissions.PermissionCallbacks {

    /**
     * RX订阅者处理类
     */
    private var rxSubscriptions: RxSubscriptions? = null

    private var contentLayout: ContentFrameLayout? = null

    private var loadingBar: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        QMUIStatusBarHelper.translucent(this)
        QMUIStatusBarHelper.setStatusBarLightMode(this)

        AppManager.appManager?.addActivity(this)
        rxSubscriptions = RxSubscriptions()

        this.setContentView(layoutId())

        initData()
        initView()
        start()
    }

    override fun setContentView(layoutResID: Int) {
        contentLayout = findViewById(R.id.content)
        val view = LayoutInflater.from(this).inflate(R.layout.common_activity_layout, contentLayout, true)

        val contentView = LayoutInflater.from(this)
            .inflate(layoutResID, contentLayout, false)
        val ll: FrameLayout = view.findViewById(R.id.layout_content)
        ll.addView(contentView)
        loadingBar = View.inflate(this, R.layout.layout_loading_bar, null)
        val params = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        params.gravity = Gravity.CENTER
        loadingBar?.layoutParams = params
        loadingBar?.visibility = View.GONE
        ll.addView(loadingBar)

        super.setContentView(view)


    }

    /*override fun setContentView(customContentView: View?) {
        contentLayout!!.removeAllViews()
        contentLayout!!.addView(customContentView)
    }*/

    /**
     *  加载布局
     */
    abstract fun layoutId(): Int

    /**
     * 初始化数据
     */
    abstract fun initData()

    /**
     * 初始化 View
     */
    abstract fun initView()

    /**
     * 开始请求
     */
    abstract fun start()


    /**
     * 为当前活动添加订阅，方便管理
     */
    fun addSubscription(vararg disposable: Disposable) {
        rxSubscriptions?.addSubscription(*disposable)
    }

    override fun onDestroy() {
        super.onDestroy()
        MyApplication.getRefWatcher(this)?.watch(this)
        AppManager.appManager?.removeActivity(this)
        rxSubscriptions?.disSubscription()
    }

    /**
     * 重写要申请权限的Activity或者Fragment的onRequestPermissionsResult()方法，
     * 在里面调用EasyPermissions.onRequestPermissionsResult()，实现回调。
     *
     * @param requestCode  权限请求的识别码
     * @param permissions  申请的权限
     * @param grantResults 授权结果
     */
    override fun onRequestPermissionsResult(requestCode: Int, @NonNull permissions: Array<String>, @NonNull grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
    }

    /**
     * 当权限被成功申请的时候执行回调
     *
     * @param requestCode 权限请求的识别码
     * @param perms       申请的权限的名字
     */
    override fun onPermissionsGranted(requestCode: Int, perms: List<String>) {
        Log.i("EasyPermissions", "获取成功的权限$perms")
    }

    /**
     * 当权限申请失败的时候执行的回调
     *
     * @param requestCode 权限请求的识别码
     * @param perms       申请的权限的名字
     */
    override fun onPermissionsDenied(requestCode: Int, perms: List<String>) {
        //处理权限名字字符串
        val sb = StringBuffer()
        for (str in perms) {
            sb.append(str)
            sb.append("\n")
        }
        sb.replace(sb.length - 2, sb.length, "")
        //用户点击拒绝并不在询问时候调用
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            Toast.makeText(this, "已拒绝权限" + sb + "并不再询问", Toast.LENGTH_SHORT).show()
            AppSettingsDialog.Builder(this)
                .setRationale("此功能需要" + sb + "权限，否则无法正常使用，是否打开设置")
                .setPositiveButton("好")
                .setNegativeButton("不行")
                .build()
                .show()
        }
    }

    fun getActivity(): Activity {
        return this
    }

    fun showLoading() {
        loadingBar?.apply {
            visibility = View.VISIBLE
        }
    }

    fun dismissLoading() {
        loadingBar?.apply {
            visibility = View.GONE
        }
    }


}


