package com.app.cloud.ex

import android.view.View
import com.trello.rxlifecycle3.components.support.RxAppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.layout_title.*

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
    onclick: View.OnClickListener = View.OnClickListener { finish() }
) {

    ivBack.setOnClickListener { onclick }
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