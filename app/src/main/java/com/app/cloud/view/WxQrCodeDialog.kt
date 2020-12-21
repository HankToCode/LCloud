package com.app.cloud.view

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import com.app.basics.utils.Util
import com.app.cloud.R
import com.app.cloud.ex.loadImage
import kotlinx.android.synthetic.main.dialog_wx_qr_code.*

/**
 * @Date 2020/11/12
 * @name
 * desc:微信二维码绑定弹窗
 *
 */
class WxQrCodeDialog(
    context: Context,
    var codeUrl: String,
    var callback: ((view: View) -> Unit)? = null
) :
    Dialog(context) {

    private val timeLong = 240 * 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_wx_qr_code)
        window?.apply {
            this.attributes.width = WindowManager.LayoutParams.MATCH_PARENT
            this.attributes.height = WindowManager.LayoutParams.WRAP_CONTENT
            this.setGravity(Gravity.CENTER)
            this.setBackgroundDrawable(ColorDrawable())
            this.setWindowAnimations(android.R.style.Animation_InputMethod)
        }

        ivQrCode.loadImage(codeUrl)

        val countDownTimer = object : CountDownTimer(timeLong.toLong(), 1000) {
            override fun onTick(millisUntilFinished: Long) {
                tvCountdown.text = "${millisUntilFinished / 1000}秒过期"
            }

            override fun onFinish() {
                tvCountdown.text = "已过期"
                //倒计时结束更新列表
            }
        }
        countDownTimer.start()

        tvConfirm.setOnClickListener {
            callback?.invoke(ivQrCode)
        }
    }


}