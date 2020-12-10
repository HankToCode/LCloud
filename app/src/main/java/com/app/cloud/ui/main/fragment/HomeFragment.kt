package com.app.cloud.ui.main.fragment

import com.app.basics.base.BaseFragment
import com.app.cloud.R

/**
 * @author HankGreen.
 * @Date 2020/12/9
 * @name
 * desc:
 *
 */
class HomeFragment : BaseFragment() {

    override fun getLayoutId(): Int = R.layout.fragment_home

    override fun initView() {

    }

    override fun lazyLoad() {
    }

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }
}