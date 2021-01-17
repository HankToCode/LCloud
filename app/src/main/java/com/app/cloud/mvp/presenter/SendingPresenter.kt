package com.app.cloud.mvp.presenter

import com.app.basics.base.BaseBean
import com.app.basics.base.BasePresenter
import com.app.basics.net.CodeHandledSubscriber
import com.app.basics.net.exception.ApiException
import com.app.cloud.mvp.contract.RegularSendingContract
import com.app.cloud.mvp.contract.SendingContract
import com.app.cloud.mvp.model.bean.WxMessageListBean
import com.app.cloud.mvp.model.send.WxMessageListSend
import com.app.cloud.mvp.model.send.WxSendSend
import com.app.cloud.net.RetrofitManager
import com.hjq.toast.ToastUtils

/**
 * Created by HankGreen on 2017/11/25.
 * desc:
 */
class SendingPresenter : BasePresenter<SendingContract.View>(), SendingContract.Presenter {


    fun wxSend(send: WxSendSend) {
        RetrofitManager.service.wxSend(send)
            .compose(RetrofitManager.CommonOptions())
            .compose(RetrofitManager.bindToLifecycle(mRootView!!))
            .subscribe(object : CodeHandledSubscriber<BaseBean<String?>>() {
                override fun onServerError(apiException: ApiException?) {
                    ToastUtils.show(apiException?.errorMsg)
                    mRootView?.dismissLoading()

                }

                override fun onBusinessNext(data: BaseBean<String?>) {
                    mRootView?.dismissLoading()


                }
            })
    }


}