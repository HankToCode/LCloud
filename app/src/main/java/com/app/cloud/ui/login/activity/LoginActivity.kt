package com.app.cloud.ui.login.activity

import android.annotation.SuppressLint
import com.app.basics.base.BaseActivity
import com.app.cloud.R
import com.app.cloud.mvp.presenter.TradingCenterPresenter

/**
 * Created by HankGreen on 2020/3/20.
 * desc: 交易中心
 * Tips:onDestroy() 记得mPresenter.detachView()
 */
class LoginActivity : BaseActivity() {
    override fun layoutId(): Int = R.layout.activity_login

    private val mPresenter by lazy { TradingCenterPresenter() }

    override fun initData() {
    }

    @SuppressLint("SetTextI18n")
    override fun initView() {
        initToolbar()

    }

    /**
     * 初始化标题栏
     */
    private fun initToolbar() {

    }

    override fun start() {

    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}
