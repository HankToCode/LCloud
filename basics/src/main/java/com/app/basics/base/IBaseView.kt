package com.app.basics.base

import android.app.Activity

/**
 * @author Jake.Ho
 * created: 2017/10/25
 * desc:
 */
interface IBaseView {

    fun getActivity(): Activity

    fun showLoading()

    fun dismissLoading()

}
