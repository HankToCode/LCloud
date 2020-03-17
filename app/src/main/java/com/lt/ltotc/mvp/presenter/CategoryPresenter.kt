package com.lt.ltotc.mvp.presenter

import com.lt.ltotc.base.BasePresenter
import com.lt.ltotc.mvp.contract.CategoryContract
import com.lt.ltotc.mvp.model.CategoryModel
import com.lt.ltotc.net.exception.ExceptionHandle

/**
 * Created by HankGreen on 2017/11/29.
 * desc:分类的 Presenter
 */
class CategoryPresenter : BasePresenter<CategoryContract.View>(), CategoryContract.Presenter {

    private val categoryModel: CategoryModel by lazy {
        CategoryModel()
    }

    /**
     * 获取分类
     */
    override fun getCategoryData() {
        checkViewAttached()
        mRootView?.showLoading()
        val disposable = categoryModel.getCategoryData()
                .subscribe({ categoryList ->
                    mRootView?.apply {
                        dismissLoading()
                        showCategory(categoryList)
                    }
                }, { t ->
                    mRootView?.apply {
                        //处理异常
                        showError(ExceptionHandle.handleException(t),ExceptionHandle.errorCode)
                    }

                })

        addSubscription(disposable)
    }
}