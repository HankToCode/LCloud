package com.app.cloud.ui.send.fragment

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.basics.base.BaseRefreshFragment
import com.app.cloud.R
import com.app.cloud.ex.handleDatas
import com.app.cloud.mvp.model.bean.SendingTabBean
import com.app.cloud.ui.send.adapter.RegularSendingAdapter
import kotlinx.android.synthetic.main.fragment_regular_sending.*

/**
 * @author HankGreen.
 * @Date 2020/12/9
 * @name
 * desc:
 *
 */
class RegularSendingFragment : BaseRefreshFragment() {


    private val titles = listOf("未完成", "所有任务", "已完成")
    private val position by lazy { arguments?.getInt(PAGE_POSITION) }
    private var adapter: RegularSendingAdapter? = null

    override fun getData(isShowDialog: Boolean) {

    }

    override fun getLayoutId(): Int = R.layout.fragment_regular_sending

    override fun initView() {

        position?.apply {
            tvTitle.text = titles[this]
        }


        adapter = RegularSendingAdapter()
        mRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        mRecyclerView.adapter = adapter


        var list = mutableListOf<SendingTabBean>()
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        list.add(SendingTabBean(1))
        adapter?.handleDatas(list, 1, 20)


    }


    override fun lazyLoad() {

    }

    companion object {

        private const val PAGE_POSITION = "page_position"

        fun newInstance(position: Int): RegularSendingFragment {
            val fragment = RegularSendingFragment()
            fragment.arguments = Bundle().apply {
                putInt(PAGE_POSITION, position)
            }
            return fragment
        }
    }
}