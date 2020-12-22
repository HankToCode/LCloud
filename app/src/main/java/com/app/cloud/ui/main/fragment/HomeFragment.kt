package com.app.cloud.ui.main.fragment

import com.app.basics.base.BaseFragment
import com.app.cloud.R
import com.app.cloud.ex.clicksJustSeconds
import com.app.cloud.ex.initToolbar
import com.app.cloud.mvp.model.send.WxMessageListSend
import com.app.cloud.ui.send.activity.RegularSendingActivity
import com.hjq.toast.ToastUtils
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

        clicksJustSeconds(llChat) {
            RegularSendingActivity.startActivity(
                this@HomeFragment.requireContext(),
                WxMessageListSend.TARGET_CHAT
            )
        }
        clicksJustSeconds(llMoments) {
            RegularSendingActivity.startActivity(
                this@HomeFragment.requireContext(),
                WxMessageListSend.TARGET_WECHAT_MOMENTS
            )
        }
        clicksJustSeconds(llCloudBilling) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView1) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView2) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView3) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView4) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView5) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView6) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView7) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView8) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView9) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView10) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView11) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView12) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView13) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView14) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView15) {
            ToastUtils.show("开发中，敬请期待")
        }
        clicksJustSeconds(tvView16) {
            ToastUtils.show("开发中，敬请期待")
        }


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