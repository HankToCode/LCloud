package com.app.cloud.helper

import android.content.Context
import android.view.View
import com.app.basics.utils.Util
import com.app.cloud.view.CommonTipsDialog
import com.app.cloud.view.WxQrCodeDialog

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
        fun showCommonTipsDialog(
            context: Context, titleStr: String, msg: String, noStr: String?,
            yesStr: String, noCallback: (() -> Unit)?, yesCallBack: (() -> Unit)
        ) {
            //不是前台不展示
            if (!Util.isForeground(context)) {
                return
            }

            val marketPlaceTips2Dialog = CommonTipsDialog(context)
            marketPlaceTips2Dialog.title = titleStr
            marketPlaceTips2Dialog.message = msg
            marketPlaceTips2Dialog.confirmStr = yesStr
            marketPlaceTips2Dialog.cancelStr = noStr
            marketPlaceTips2Dialog.cancelCallback = noCallback
            marketPlaceTips2Dialog.confirmCallback = yesCallBack
            marketPlaceTips2Dialog.show()
        }

        fun showQrCodeDialog(
            context: Context, codeUrl: String, callback: ((view: View) -> Unit)
        ) {
            //不是前台不展示
            if (!Util.isForeground(context)) {
                return
            }

            val marketPlaceTips2Dialog = WxQrCodeDialog(context, codeUrl, callback)
            marketPlaceTips2Dialog.show()
        }


    }
}