package com.app.cloud.mvp.presenter

import com.app.basics.base.BaseBean
import com.app.basics.base.BasePresenter
import com.app.basics.net.CodeHandledSubscriber
import com.app.basics.net.exception.ApiException
import com.app.basics.utils.FileUtils
import com.app.cloud.helper.DialogHelper
import com.app.cloud.mvp.contract.WxManagerContract
import com.app.cloud.mvp.model.bean.WxRobotListBean
import com.app.cloud.mvp.model.send.WxQrCodeSend
import com.app.cloud.net.RetrofitManager
import com.hjq.toast.ToastUtils

/**
 * Created by HankGreen on 2017/11/25.
 * desc:
 */
class WxManagerPresenter : BasePresenter<WxManagerContract.View>(), WxManagerContract.Presenter {


    fun wxRobotList() {
        RetrofitManager.service.wxRobotList()
            .compose(RetrofitManager.CommonOptions())
            .compose(RetrofitManager.bindToLifecycle(mRootView!!))
            .subscribe(object : CodeHandledSubscriber<BaseBean<MutableList<WxRobotListBean>>>() {
                override fun onServerError(apiException: ApiException?) {
                    ToastUtils.show(apiException?.errorMsg)
                    mRootView?.responseWxRobotList(mutableListOf())
                    mRootView?.finishRefresh()
                }

                override fun onBusinessNext(data: BaseBean<MutableList<WxRobotListBean>>) {
                    mRootView?.responseWxRobotList(data.data)
                    mRootView?.finishRefresh()
                }
            })
    }

    fun wxCreateDevice() {
        mRootView?.showLoading()
        RetrofitManager.service.wxCreateDevice()
            .compose(RetrofitManager.CommonOptions())
            .compose(RetrofitManager.bindToLifecycle(mRootView!!))
            .subscribe(object : CodeHandledSubscriber<BaseBean<String>>() {
                override fun onServerError(apiException: ApiException?) {
                    ToastUtils.show(apiException?.errorMsg)
                    mRootView?.dismissLoading()
                }

                override fun onBusinessNext(data: BaseBean<String>) {

                    val send = WxQrCodeSend(data.data)
                    wxQrCode(send)
                }
            })
    }

    fun wxQrCode(send: WxQrCodeSend) {
        RetrofitManager.service.wxQrCode(send)
            .compose(RetrofitManager.CommonOptions())
            .compose(RetrofitManager.bindToLifecycle(mRootView!!))
            .subscribe(object : CodeHandledSubscriber<BaseBean<String>>() {
                override fun onServerError(apiException: ApiException?) {
                    ToastUtils.show(apiException?.errorMsg)
                    mRootView?.dismissLoading()
                }

                override fun onBusinessNext(data: BaseBean<String>) {
                    mRootView?.dismissLoading()
                    DialogHelper.showQrCodeDialog(mRootView!!.getActivity(), data.data) {
                        FileUtils.saveImage(mRootView!!.getActivity(), it)
                        ToastUtils.show("二维码已保存至系统相册")
                    }
                }
            })
    }


}