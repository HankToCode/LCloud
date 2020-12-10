package com.app.cloud.view

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.WindowManager
import com.app.cloud.R
import com.app.cloud.ex.setVisibleOrGone
import kotlinx.android.synthetic.main.dialog_common_tips.*

/**
 * @Date 2020/11/12
 * @name
 * desc:
 *
 */
class CommonTipsDialog(context: Context) : Dialog(context) {


    var cancelStr: String? = null
    var confirmStr: String? = null
    var message: String? = null
    var title: String? = null

    var cancelCallback: (() -> Unit)? = null
    var confirmCallback: (() -> Unit)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_common_tips)
        window?.apply {
            this.attributes.width = WindowManager.LayoutParams.MATCH_PARENT
            this.setGravity(Gravity.CENTER)
            this.setBackgroundDrawable(ColorDrawable())
            this.setWindowAnimations(android.R.style.Animation_InputMethod)
        }

        if (title?.isNotEmpty() == true) {
            tvTitle.setVisibleOrGone(true)
            tvTitle.text = title
        }

        tvMessage.text = message

        if (cancelStr?.isNotEmpty() == true) {
            tvCancel.setVisibleOrGone(true)
            tvCancel.text = cancelStr
        }
        if (confirmStr?.isNotEmpty() == true) {
            tvConfirm.setVisibleOrGone(true)
            tvConfirm.text = confirmStr
        }

        if (cancelStr?.isNotEmpty() == true && confirmStr?.isNotEmpty() == true) {
            view1.setVisibleOrGone(true)
        }

        tvConfirm.setOnClickListener {
            confirmCallback?.invoke()
            dismiss()
        }

        tvCancel.setOnClickListener {
            cancelCallback?.invoke()
            dismiss()
        }


    }


}