package com.app.cloud.ui.send.fragment

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.basics.base.BaseRefreshFragment
import com.app.cloud.R
import com.app.cloud.ex.handleDatas
import com.app.cloud.helper.DialogHelper
import com.app.cloud.mvp.contract.RegularSendingFragmentContract
import com.app.cloud.mvp.model.bean.WxMessageListBean
import com.app.cloud.mvp.model.send.WxMessageListSend
import com.app.cloud.mvp.presenter.RegularSendingFragmentPresenter
import com.app.cloud.ui.send.activity.SendingActivity
import com.app.cloud.ui.send.adapter.RegularSendingAdapter
import kotlinx.android.synthetic.main.fragment_regular_sending.*

/**
 * @author HankGreen.
 * @Date 2020/12/9
 * @name
 * desc:
 *
 */
class RegularSendingFragment : BaseRefreshFragment(), RegularSendingFragmentContract.View {


    private val titles = listOf("待执行", "所有任务", "已执行")
    private val position by lazy { arguments?.getInt(PAGE_POSITION) }
    private val target by lazy { arguments?.getString(PAGE_TARGET) }
    private var adapter: RegularSendingAdapter? = null

    private val presenter by lazy { RegularSendingFragmentPresenter() }

    override fun getData(isShowDialog: Boolean) {
        val send =
            WxMessageListSend(pageNum, pageSize, WxMessageListSend.getStateName(position), target!!)
        presenter.wxMessageList(send)
    }

    override fun getLayoutId(): Int = R.layout.fragment_regular_sending

    override fun initView() {

        presenter.attachView(this)

        pageSize = 10
        position?.apply {
            tvTitle.text = titles[this]
        }

        adapter = RegularSendingAdapter()
        mRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        mRecyclerView.adapter = adapter

        adapter?.setOnItemChildClickListener { adapter, view, position ->
            val item = adapter.getItem(position) as WxMessageListBean
            when (view.id) {
                R.id.tvButton1 -> {

                    //TODO 后端这里少了两个接口 1、判断当前订单状态 2、暂停修改中的任务状态

                    //查看 或 修改任务
                    SendingActivity.startActivity(
                        this@RegularSendingFragment.requireContext(),
                        item,
                        target!!
                    )

                }
                R.id.tvButton2 -> {
                    //删除任务
                    DialogHelper.showCommonTipsDialog(
                        this@RegularSendingFragment.requireContext(),
                        "",
                        "确定要删除这条任务吗？",
                        "取消",
                        "确认",
                        {},
                        {})

                }
            }
        }

    }

    override fun lazyLoad() {
        getData(false)
    }

    override fun responseWxMessageList(list: List<WxMessageListBean>) {

        adapter?.handleDatas(list, pageNum, pageSize)
    }

    companion object {

        private const val PAGE_POSITION = "page_position"
        private const val PAGE_TARGET = "page_target"

        fun newInstance(position: Int, target: String): RegularSendingFragment {
            val fragment = RegularSendingFragment()
            fragment.arguments = Bundle().apply {
                putInt(PAGE_POSITION, position)
                putString(PAGE_TARGET, target)
            }
            return fragment
        }
    }

}