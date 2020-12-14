package com.app.cloud.ui.send.activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import com.app.basics.base.BaseActivity
import com.app.cloud.R
import com.app.cloud.mvp.model.bean.MainTabBean
import com.app.cloud.mvp.presenter.TradingCenterPresenter
import com.app.cloud.ui.main.adapter.MainFragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by HankGreen on 2020/3/20.
 * desc: 首页
 * Tips:onDestroy() 记得mPresenter.detachView()
 */
class SendingActivity : BaseActivity() {
    override fun layoutId(): Int = R.layout.activity_main

    private val mPresenter by lazy { TradingCenterPresenter() }

    var currentPosition = MainTabBean.TAB_HOME

    override fun initData() {

    }

    @SuppressLint("SetTextI18n")
    override fun initView() {

        mViewPager.isLocked = true
        mViewPager.offscreenPageLimit = 1
        mViewPager.adapter = MainFragmentAdapter(supportFragmentManager)
        llHome.setOnClickListener { setTabSelection(MainTabBean.TAB_HOME) }
        llMe.setOnClickListener { setTabSelection(MainTabBean.TAB_ME) }

        setTabSelection(currentPosition)

    }

    private fun setTabSelection(position: Int) {
        mViewPager.setCurrentItem(position, false)
        currentPosition = position
        //更改底部导航栏按钮状态
        changeButtonState(currentPosition)
    }


    /**
     * 更改按钮状态
     */
    private fun changeButtonState(position: Int) {
        when (position) {
            MainTabBean.TAB_HOME -> {
                llHome.isSelected = true
                llMe.isSelected = false
            }
            MainTabBean.TAB_ME -> {
                llHome.isSelected = false
                llMe.isSelected = true
            }
        }
    }

    override fun start() {

    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }

    companion object {
        fun startActivity(context: Context) {
            context.startActivity(Intent(context, SendingActivity::class.java))
        }
    }
}
