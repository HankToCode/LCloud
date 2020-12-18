package com.app.cloud.ex

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import androidx.annotation.NonNull
import com.app.basics.utils.StatusBarUtil
import com.app.basics.utils.constant.Constants
import com.app.cloud.R
import com.app.cloud.view.CommonTitleView
import com.jakewharton.rxbinding2.view.RxView
import com.trello.rxlifecycle3.android.ActivityEvent
import com.trello.rxlifecycle3.components.support.RxAppCompatActivity
import java.util.concurrent.TimeUnit

/**
 * @author HankGreen.
 * @Date 2020/12/3
 * @name
 * desc:
 *
 */

fun RxAppCompatActivity.initToolbar(
    title: String?,
    rightViews: MutableList<View>? = null,
    leftViews: MutableList<View>? = null,
    onclick: (() -> Unit)? = { finish() }
) {

    val llCommonTitle = this.findViewById<CommonTitleView>(R.id.llCommonTitle)
    val ivBack = llCommonTitle.findViewById<ImageView>(R.id.ivBack)

    StatusBarUtil.setPadding(this, llCommonTitle)

    ivBack.setOnClickListener { onclick?.invoke() }
    title?.apply {
        llCommonTitle.tvTitle.text = title
    }

    rightViews?.apply {
        llCommonTitle.addRightViews(this)
    }

    leftViews?.apply {
        llCommonTitle.addLeftViews(this)
    }

}


@SuppressLint("CheckResult")
fun RxAppCompatActivity.clicksJustSeconds(
    @NonNull view: View,
    callback: () -> Unit
) {
    RxView.clicks(view).throttleFirst(Constants.THROTTLE_SECONDS, TimeUnit.SECONDS)
        .compose(this.bindUntilEvent(ActivityEvent.DESTROY)).subscribe {
            callback.invoke()
        }
}