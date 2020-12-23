package com.app.cloud.ui.send.activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.app.basics.base.BaseActivity
import com.app.basics.base.CommonPagerAdapter
import com.app.cloud.R
import com.app.cloud.ex.clicksJustSeconds
import com.app.cloud.ex.initToolbar
import com.app.cloud.mvp.model.bean.WxMessageListBean
import com.app.cloud.mvp.model.send.WxMessageListSend
import com.app.cloud.mvp.presenter.RegularSendingPresenter
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

    private val mPresenter by lazy { RegularSendingPresenter() }

    private val target by lazy { intent.getStringExtra(INTENT_TARGET) }

    @SuppressLint("SetTextI18n")
    override fun initView() {

        initToolbar(if (target == WxMessageListSend.TARGET_CHAT) "定时群发" else "定时朋友圈")


        mFragments = mutableListOf()

        mFragments?.add(RegularSendingFragment.newInstance(0, target))
        mFragments?.add(RegularSendingFragment.newInstance(1, target))
        mFragments?.add(RegularSendingFragment.newInstance(2, target))

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

        clicksJustSeconds(tvCreate) {
            SendingActivity.startActivity(this, WxMessageListBean(), target)
        }

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

        private const val INTENT_TARGET = "target"

        fun startActivity(context: Context, target: String) {
            val intent = Intent(context, RegularSendingActivity::class.java)
            intent.putExtra(INTENT_TARGET, target)
            context.startActivity(intent)
        }
    }
}
