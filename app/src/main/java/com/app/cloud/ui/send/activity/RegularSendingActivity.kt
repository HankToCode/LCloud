package com.app.cloud.ui.send.activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.app.basics.base.BaseActivity
import com.app.basics.base.CommonPagerAdapter
import com.app.cloud.R
import com.app.cloud.ex.initToolbar
import com.app.cloud.mvp.presenter.TradingCenterPresenter
import com.app.cloud.ui.send.fragment.RegularSendingFragment
import kotlinx.android.synthetic.main.activity_regular_sending.*

/**
 * Created by HankGreen on 2020/3/20.
 * desc: 发送界面
 * Tips:onDestroy() 记得mPresenter.detachView()
 */
class RegularSendingActivity : BaseActivity() {


    private var mFragments: MutableList<Fragment>? = null

    override fun layoutId(): Int = R.layout.activity_regular_sending

    private val mPresenter by lazy { TradingCenterPresenter() }


    override fun initData() {

    }

    @SuppressLint("SetTextI18n")
    override fun initView() {

        initToolbar("定时群发")


        mFragments = mutableListOf()

        mFragments?.add(RegularSendingFragment.newInstance(0))
        mFragments?.add(RegularSendingFragment.newInstance(1))
        mFragments?.add(RegularSendingFragment.newInstance(2))

        mViewPager.offscreenPageLimit = 3
        mViewPager.adapter = CommonPagerAdapter(this.supportFragmentManager, mFragments)
        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                changeCircle(position)
            }

        })

        mViewPager.currentItem = 1
        changeCircle(1)

    }

    private fun changeCircle(position: Int) {
        circle1.isSelected = position == 0
        circle2.isSelected = position == 1
        circle3.isSelected = position == 2
    }

    override fun start() {

    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }

    companion object {
        fun startActivity(context: Context) {
            context.startActivity(Intent(context, RegularSendingActivity::class.java))
        }
    }
}
