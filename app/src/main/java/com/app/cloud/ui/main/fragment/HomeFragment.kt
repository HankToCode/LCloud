package com.app.cloud.ui.main.fragment

import com.app.basics.base.BaseFragment
import com.app.basics.utils.StatusBarUtil
import com.app.cloud.R
import com.app.cloud.ex.initToolbar
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
import kotlinx.android.synthetic.main.fragment_home.*

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

        initToolbar(getString(R.string.app_name))

        StatusBarUtil.setPadding(requireContext(), llCommonTitle)

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
        QMUIStatusBarHelper.setStatusBarLightMode(requireActivity())
    }

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }
}