package com.app.cloud.ex

import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.app.cloud.R
import com.app.cloud.view.CommonTitleView
import kotlinx.android.synthetic.main.layout_title.*

/**
 * @author HankGreen.
 * @Date 2020/12/10
 * @name
 * desc:
 *
 */

fun Fragment.initToolbar(
    title: String?,
    rightViews: MutableList<View>? = null,
    leftViews: MutableList<View>? = null,
    onclick: View.OnClickListener = View.OnClickListener { requireActivity().finish() }
) {

    val llCommonTitle = view?.findViewById<CommonTitleView>(R.id.llCommonTitle)
    val ivBack = llCommonTitle?.findViewById<ImageView>(R.id.ivBack)
    ivBack?.setOnClickListener { onclick }
    title?.apply {
        llCommonTitle?.tvTitle?.text = title
    }

    rightViews?.apply {
        llCommonTitle?.addRightViews(this)
    }

    leftViews?.apply {
        llCommonTitle?.addLeftViews(this)
    }

}
