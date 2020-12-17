package com.app.cloud.ui.send.activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.util.TypedValue
import com.app.basics.base.BaseActivity
import com.app.cloud.R
import com.app.cloud.ex.initToolbar
import com.app.cloud.ex.setVisibleOrGone
import com.app.cloud.mvp.model.bean.SendingTabBean
import com.app.cloud.mvp.presenter.TradingCenterPresenter
import kotlinx.android.synthetic.main.activity_sending.*

/**
 * Created by HankGreen on 2020/3/20.
 * desc: 发送界面
 * Tips:onDestroy() 记得mPresenter.detachView()
 */
class SendingActivity : BaseActivity() {
    override fun layoutId(): Int = R.layout.activity_sending

    private val mPresenter by lazy { TradingCenterPresenter() }

    private var currentPosition = SendingTabBean.TAB_IMAGE

    override fun initData() {

    }

    @SuppressLint("SetTextI18n")
    override fun initView() {

        initToolbar("编辑朋友圈")

        tvPhoto.setOnClickListener { setTabSelection(SendingTabBean.TAB_IMAGE) }
        tvVideo.setOnClickListener { setTabSelection(SendingTabBean.TAB_VIDEO) }

        setTabSelection(currentPosition)

    }

    private fun setTabSelection(position: Int) {

        currentPosition = position
        //更改头部导航栏按钮状态
        changeButtonState(currentPosition)
    }


    /**
     * 更改按钮状态
     */
    private fun changeButtonState(position: Int) {
        when (position) {
            SendingTabBean.TAB_IMAGE -> {
                tvPhoto.isSelected = true
                tvVideo.isSelected = false

                tvPhoto.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f)
                tvVideo.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
            }
            SendingTabBean.TAB_VIDEO -> {
                tvPhoto.isSelected = false
                tvVideo.isSelected = true

                tvPhoto.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
                tvVideo.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f)
            }
        }

        tvPhotoLine.setVisibleOrGone(tvPhoto.isSelected)
        tvVideoLine.setVisibleOrGone(tvVideo.isSelected)
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
