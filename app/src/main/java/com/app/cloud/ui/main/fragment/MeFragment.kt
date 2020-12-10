package com.app.cloud.ui.main.fragment

import com.app.basics.base.BaseFragment
import com.app.cloud.R
import com.qmuiteam.qmui.util.QMUIStatusBarHelper

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
        setStatusBarDarkMode()

    }


    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if (isVisibleToUser && isViewPrepare) {
            setStatusBarDarkMode()
        }
    }

    private fun setStatusBarDarkMode() {
        QMUIStatusBarHelper.translucent(requireActivity())
        QMUIStatusBarHelper.setStatusBarDarkMode(requireActivity())
    }

    companion object {
        fun newInstance(): MeFragment {
            return MeFragment()
        }
    }
}