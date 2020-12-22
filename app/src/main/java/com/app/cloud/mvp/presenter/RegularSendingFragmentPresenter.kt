package com.app.cloud.mvp.presenter

import com.app.basics.base.BaseBean
import com.app.basics.base.BasePresenter
import com.app.basics.net.CodeHandledSubscriber
import com.app.basics.net.exception.ApiException
import com.app.cloud.mvp.contract.RegularSendingContract
import com.app.cloud.mvp.contract.RegularSendingFragmentContract
import com.app.cloud.mvp.model.bean.WxMessageListBean
import com.app.cloud.mvp.model.send.WxMessageListSend
import com.app.cloud.net.RetrofitManager
import com.hjq.toast.ToastUtils

/**
 * Created by HankGreen on 2017/11/25.
 * desc:
 */
class RegularSendingFragmentPresenter : BasePresenter<RegularSendingFragmentContract.View>(),
    RegularSendingFragmentContract.Presenter {


    fun wxMessageList(send: WxMessageListSend) {
        RetrofitManager.service.wxMessageList(send)
            .compose(RetrofitManager.CommonOptions())
            .compose(RetrofitManager.bindToLifecycle(mRootView!!))
            .subscribe(object : CodeHandledSubscriber<BaseBean<List<WxMessageListBean>>>() {
                override fun onServerError(apiException: ApiException?) {
                    ToastUtils.show(apiException?.errorMsg)
                    mRootView?.responseWxMessageList(listOf())

                }

                override fun onBusinessNext(data: BaseBean<List<WxMessageListBean>>) {

                    mRootView?.responseWxMessageList(data.data)

                }
            })
    }


}