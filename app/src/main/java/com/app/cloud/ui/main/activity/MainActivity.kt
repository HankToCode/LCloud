package com.app.cloud.ui.main.activity

import android.annotation.SuppressLint
import com.app.basics.base.BaseActivity
import com.app.cloud.R
import com.app.cloud.mvp.presenter.TradingCenterPresenter

/**
 * Created by HankGreen on 2020/3/20.
 * desc: 首页
 * Tips:onDestroy() 记得mPresenter.detachView()
 */
class MainActivity : BaseActivity() {
    override fun layoutId(): Int = R.layout.activity_main

    private val mPresenter by lazy { TradingCenterPresenter() }

    override fun initData() {
    }

    @SuppressLint("SetTextI18n")
    override fun initView() {


    }

    override fun start() {

    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}
