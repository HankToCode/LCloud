package com.app.cloud.ex

import android.view.View
import com.chad.library.adapter.base.BaseQuickAdapter

/**
 * @author HankGreen.
 * @Date 2020/12/16
 * @name
 * desc:
 *
 */


/**
 *   @author Gubr <a href="mailto:Gubr@foxmail.com">Gubr</a>
 **/
fun <T> BaseQuickAdapter<T, *>.loadmore(items: List<T>, pageSize: Int) {
    if (items.size < pageSize) {
        this.addData(items)
        this.loadMoreEnd()
    } else {
        this.addData(items)
        this.loadMoreComplete()
    }
}

fun <T> BaseQuickAdapter<T, *>.handleDatas(
    items: List<T>,
    page: Int,
    pageSize: Int,
    isNewData: Boolean = false
) {
    if (page == 1) {
        this.loadMoreComplete()

        if (!isNewData) {
            this.replaceData(items)
        } else {
            this.setNewData(items)
        }
        if (items.size >= pageSize) {
            this.setEnableLoadMore(true)
        } else {
            this.loadMoreEnd()
        }
    } else {
        loadmore(items, pageSize)
    }

}


fun <T : BaseQuickAdapter<*, *>> T.setMyOnItemClickListener(back: (adapter: T, view: View, position: Int) -> Unit) {
    this.setOnItemClickListener { adapter, view, position ->
        back.invoke(adapter as T, view, position)
    }
}