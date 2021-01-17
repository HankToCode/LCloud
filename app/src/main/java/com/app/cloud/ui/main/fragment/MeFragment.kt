package com.app.cloud.ui.main.fragment

import com.app.basics.base.AppManager
import com.app.basics.base.BaseFragment
import com.app.cloud.R
import com.app.cloud.ex.clicksJustSeconds
import com.app.cloud.helper.DialogHelper
import com.app.cloud.helper.UserManager
import com.app.cloud.ui.wx.activity.WxManagerActivity
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
import kotlinx.android.synthetic.main.fragment_me.*

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

        clicksJustSeconds(stSubmit) {
            DialogHelper.showCommonTipsDialog(
                requireContext(),
                "",
                "是否确认退出",
                "取消",
                "确认",
                {},
                { UserManager.logout() })
        }

        clicksJustSeconds(llBindWeChat) {
            WxManagerActivity.startActivity(requireActivity())
        }
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