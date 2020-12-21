package com.app.cloud.ui.wx.activity

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.basics.base.BaseRefreshActivity
import com.app.cloud.R
import com.app.cloud.ex.handleDatas
import com.app.cloud.ex.initToolbar
import com.app.cloud.helper.DialogHelper
import com.app.cloud.mvp.contract.WxManagerContract
import com.app.cloud.mvp.model.bean.WxRobotListBean
import com.app.cloud.mvp.presenter.WxManagerPresenter
import com.app.cloud.ui.wx.adapter.WxManagerAdapter
import com.hjq.toast.ToastUtils
import kotlinx.android.synthetic.main.activity_wx_manager.*

/**
 * Created by HankGreen on 2020/3/20.
 * desc: 微信管理界面
 * Tips:onDestroy() 记得mPresenter.detachView()
 */
class WxManagerActivity : BaseRefreshActivity(), WxManagerContract.View {

    override fun getData(isShowDialog: Boolean) {
        mPresenter.wxRobotList()
    }

    override fun layoutId(): Int = R.layout.activity_wx_manager

    private var adapter: WxManagerAdapter? = null
    private val mPresenter by lazy { WxManagerPresenter() }

    override fun initData() {

    }

    override fun initView() {

        initToolbar("微信号管理")

        mPresenter.attachView(this)

        adapter = WxManagerAdapter()
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = adapter

        adapter?.setOnItemClickListener { adapter, view, position ->
            val item = adapter.getItem(position) as WxRobotListBean

            if (item.isAddWeChatRobot) {
                DialogHelper.showCommonTipsDialog(
                    this@WxManagerActivity,
                    "绑定微信号",
                    "微信号一经绑定就不能更改，请绑定前确认\n使用的是常用微信。",
                    "",
                    "我知道了",
                    {},
                    {
                        mPresenter.wxCreateDevice()
                    })
            }

        }

        adapter?.setOnItemChildClickListener { adapter, view, position ->
            when (view.id) {
                R.id.tvChange -> {
                    ToastUtils.show("推广期间功能免费使用")
                }
            }
        }

        refreshLayout = mSmartRefreshLayout
        setSwipeLayout()
        refreshLayout?.setEnableLoadMore(false)

    }


    override fun start() {
        getData(false)
    }

    private val maxBinds = 3

    override fun responseWxRobotList(list: MutableList<WxRobotListBean>) {
        tvAccountNum.text = "绑定账号：${list.size} / ${maxBinds}"

        //当绑定微信为空 或者 绑定微信未满 则 显示增加按钮
        if (list.isEmpty() || list.size < maxBinds) {
            val addBean = WxRobotListBean()
            addBean.isAddWeChatRobot = true
            list.add(addBean)
        }

        adapter?.handleDatas(list, 1, 20)

    }

    override fun finishRefresh() {
        super.finishRefresh()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }


    companion object {
        fun startActivity(context: Context) {
            context.startActivity(Intent(context, WxManagerActivity::class.java))
        }
    }
}
