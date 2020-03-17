package com.lt.ltotc.mvp.presenter

import com.lt.basics.base.BasePresenter
import com.lt.ltotc.mvp.contract.HotTabContract
import com.lt.ltotc.mvp.model.HotTabModel
import com.lt.basics.net.exception.ExceptionHandle

/**
 * Created by HankGreen on 2017/11/30.
 * desc: 获取 TabInfo Presenter
 */
class HotTabPresenter: BasePresenter<HotTabContract.View>(),HotTabContract.Presenter {

    private val hotTabModel by lazy { HotTabModel() }


    override fun getTabInfo() {
        checkViewAttached()
        mRootView?.showLoading()
        val disposable = hotTabModel.getTabInfo()
                .subscribe({
                    tabInfo->
                    mRootView?.setTabInfo(tabInfo)
                },{
                    throwable->
                    //处理异常
                    mRootView?.showError(ExceptionHandle.handleException(throwable), ExceptionHandle.errorCode)
                })
        addSubscription(disposable)
    }
}