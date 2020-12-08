package com.app.cloud.ui.login.activity

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import com.app.basics.base.BaseActivity
import com.app.cloud.R
import com.app.cloud.ex.initToolbar
import com.app.cloud.mvp.presenter.TradingCenterPresenter
import com.jakewharton.rxbinding2.view.RxView
import com.trello.rxlifecycle3.android.ActivityEvent

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
        val views = mutableListOf<View>()

        val sss = ImageView(this)
        sss.setImageResource(R.mipmap.common_icon_back)
        RxView.clicks(sss).compose(this.bindUntilEvent(ActivityEvent.DESTROY)).subscribe()
        views.add(sss)

        initToolbar("登录",views)

    }

    override fun start() {

    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}
