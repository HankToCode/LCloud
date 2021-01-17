package com.app.cloud.mvp.presenter

import com.app.basics.base.BaseBean
import com.app.basics.base.BasePresenter
import com.app.basics.net.CodeHandledSubscriber
import com.app.basics.net.exception.ApiException
import com.app.cloud.helper.UserManager
import com.app.cloud.mvp.contract.LoginContract
import com.app.cloud.mvp.model.send.LoginSend
import com.app.cloud.net.RetrofitManager
import com.app.cloud.ui.main.activity.MainActivity
import com.hjq.toast.ToastUtils

/**
 * Created by HankGreen on 2017/11/25.
 * desc:
 */
class LoginPresenter : BasePresenter<LoginContract.View>(), LoginContract.Presenter {

    fun login(send: LoginSend) {
        mRootView?.showLoading()
        RetrofitManager.service.login(send)
            .compose(RetrofitManager.CommonOptions())
            .compose(RetrofitManager.bindToLifecycle(mRootView!!))
            .subscribe(object : CodeHandledSubscriber<BaseBean<String>>() {
                override fun onServerError(apiException: ApiException?) {
                    mRootView?.dismissLoading()
                    ToastUtils.show(apiException?.errorMsg)
                }

                override fun onBusinessNext(data: BaseBean<String>) {
                    mRootView?.dismissLoading()
                    UserManager.saveFakeToken(data.data)
                    MainActivity.startActivity(mRootView!!.getAppActivity())
                }
            })
    }


}