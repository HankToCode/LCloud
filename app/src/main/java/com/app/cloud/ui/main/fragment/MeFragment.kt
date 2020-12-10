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
class MeFragment : BaseFragment() {

    override fun getLayoutId(): Int = R.layout.fragment_me

    override fun initView() {

    }

    override fun lazyLoad() {
    }

    companion object {
        fun newInstance(): MeFragment {
            return MeFragment()
        }
    }
}