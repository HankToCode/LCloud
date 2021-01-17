package com.app.basics.base

import com.hjq.toast.ToastUtils
import com.scwang.smartrefresh.layout.SmartRefreshLayout
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener

abstract class BaseRefreshActivity : BaseActivity() {
    //刷新控件
    protected var refreshLayout: SmartRefreshLayout? = null

    //页码
    protected var pageNum = 1

    //分页大小
    protected var pageSize = 10

    //是否刷新
    protected var isRefresh = true

    //是否最后一页
    protected var isLastPage = false

    /**
     * 设置swipeView 并设置刷新方向
     */
    protected fun setSwipeLayout() {
        refreshLayout?.setOnRefreshListener {
            isRefresh = true
            pageNum = 1
            getData(false)
        }
        refreshLayout?.setOnLoadMoreListener(OnLoadMoreListener { refreshLayout ->
            if (isLastPage) {
                ToastUtils.show("已经是最后一页")
                refreshLayout.finishLoadMore()
                return@OnLoadMoreListener
            }
            pageNum++
            isRefresh = false
            getData(false)
        })
    }

    /**
     * stop refresh
     */
    protected open fun finishRefresh() {
        refreshLayout?.finishLoadMore()
        refreshLayout?.finishRefresh()
    }

    /**
     * 获取数据
     *
     * @param isShowDialog
     */
    protected abstract fun getData(isShowDialog: Boolean)

}