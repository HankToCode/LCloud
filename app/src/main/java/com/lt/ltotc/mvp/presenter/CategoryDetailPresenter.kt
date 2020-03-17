package com.lt.ltotc.mvp.presenter

import com.lt.ltotc.base.BasePresenter
import com.lt.ltotc.mvp.contract.CategoryDetailContract
import com.lt.ltotc.mvp.model.CategoryDetailModel

/**
 * Created by HankGreen on 2017/11/30.
 * desc:
 */
class CategoryDetailPresenter:BasePresenter<CategoryDetailContract.View>(),CategoryDetailContract.Presenter{

   private val categoryDetailModel by lazy {
       CategoryDetailModel()
   }

    private var nextPageUrl:String?=null

    /**
     * 获取分类详情的列表信息
     */
    override fun getCategoryDetailList(id: Long) {
        checkViewAttached()
        val disposable= categoryDetailModel.getCategoryDetailList(id)
                .subscribe({
                    issue ->
                    mRootView?.apply {
                        nextPageUrl = issue.nextPageUrl
                        setCateDetailList(issue.itemList)
                    }
                },{
                    throwable ->
                    mRootView?.apply {
                        showError(throwable.toString())
                    }
                })

        addSubscription(disposable)
    }

    /**
     * 加载更多数据
     */
    override fun loadMoreData() {
        val disposable = nextPageUrl?.let {
            categoryDetailModel.loadMoreData(it)
                    .subscribe({ issue ->
                        mRootView?.apply {
                            nextPageUrl = issue.nextPageUrl
                            setCateDetailList(issue.itemList)
                        }
                    }, { throwable ->
                        mRootView?.apply {
                            showError(throwable.toString())
                        }
                    })
        }

        disposable?.let { addSubscription(it) }
    }
}