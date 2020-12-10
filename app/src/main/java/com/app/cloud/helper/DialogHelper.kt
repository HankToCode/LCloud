package com.app.cloud.helper

import android.content.Context
import com.app.basics.utils.Util
import com.app.cloud.view.CommonTipsDialog

/**
 * @author HankGreen.
 * @Date 2020/12/10
 * @name
 * desc:
 *
 */
class DialogHelper {

    companion object {


        /**
         * 展示通用的弹窗
         * @param titleStr title
         * @param errorMsg 错误信息
         * @param noStr 左边按钮信息
         * @param yesStr 右边按钮信息
         * @param noCallback 左边按钮点击回调
         * @param yesCallBack 右边按钮点击回调
         */
        fun showCommonTipsDialog(context: Context, titleStr: String, errorMsg: String, noStr: String?,
                             yesStr: String, noCallback: (() -> Unit)?, yesCallBack: (() -> Unit)) {
            //不是前台不展示
            if (!Util.isForeground(context)) {
                return
            }

            val marketPlaceTips2Dialog = CommonTipsDialog(context)
            marketPlaceTips2Dialog.title = titleStr
            marketPlaceTips2Dialog.message = errorMsg
            marketPlaceTips2Dialog.confirmStr = yesStr
            marketPlaceTips2Dialog.cancelStr = noStr
            marketPlaceTips2Dialog.cancelCallback = noCallback
            marketPlaceTips2Dialog.confirmCallback = yesCallBack
            marketPlaceTips2Dialog.show()
        }


    }
}