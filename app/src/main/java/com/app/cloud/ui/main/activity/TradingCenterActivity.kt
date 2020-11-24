package com.app.cloud.ui.main.activity

import android.annotation.SuppressLint
import android.view.View
import com.app.basics.base.BaseActivity
import com.app.basics.utils.StatusBarUtil
import com.app.cloud.R
import com.app.cloud.mvp.presenter.TradingCenterPresenter
import com.app.cloud.utils.ColorUtil
import kotlinx.android.synthetic.main.layout_title.*
import kotlinx.android.synthetic.main.layout_toolbar.*

/**
 * Created by HankGreen on 2020/3/20.
 * desc: 交易中心
 * Tips:onDestroy() 记得mPresenter.detachView()
 */
class TradingCenterActivity : BaseActivity() {
    override fun layoutId(): Int = R.layout.activity_trading_center

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
        StatusBarUtil.setPaddingSmart(this, toolbar)

        toolbar.setBackgroundColor(ColorUtil.getColorId(this, R.color.white))
        layoutInflater.inflate(R.layout.layout_title, toolbar)
        setSupportActionBar(toolbar)

        ivToolbarBack.visibility = View.GONE
        tvToolbarTitle.text = "交易中心"

        //发布需求
        val layoutReleaseDemand = layoutInflater.inflate(R.layout.layout_release_demand, null)
        layoutReleaseDemand.setOnClickListener {

        }

        llToolbarIcons.addView(layoutReleaseDemand)

    }

    override fun start() {

    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}
