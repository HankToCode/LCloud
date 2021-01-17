package com.app.basics.net

import com.app.basics.base.BaseBean
import com.app.basics.net.exception.ApiException
import com.app.basics.net.exception.ExceptionHandle
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

abstract class CodeHandledSubscriber<T> : Observer<T> {

    //错误处理
    override fun onError(e: Throwable) {
        //统一报错处理
        var exception = ExceptionHandle.handleException(e)
        onServerError(exception)
    }

    //服务器报错
    abstract fun onServerError(apiException: ApiException?)

    //下一步
    abstract fun onBusinessNext(data: T)

    //成功请求回调
    override fun onNext(t: T) {
        if (t is BaseBean<*>) {
            val (code, msg, data, token) = t as BaseBean<*>
            if (t.code == HttpCode.SUCCESS) {
                onBusinessNext(t)
            } else {
                //服务器报错处理
                if (t.code == HttpCode.B20025 || t.code == HttpCode.B20016) {
                    var apiException = ApiException(t.code, t.msg)
                    onError(apiException)
                } else if (t.code == HttpCode.B10020) {
                    var apiException = ApiException(t.code, t.msg)
                    onError(apiException)
                } else if (t.code == HttpCode.B20021 || t.code == HttpCode.B40009|| t.code == HttpCode.B40011) {
                    var apiException = ApiException(t.code, t.msg)
                    onError(apiException)
                } else {
                    onServerError(ApiException(t.code, t.msg));
                }
            }
        }
    }


    override fun onComplete() {
    }

    override fun onSubscribe(d: Disposable) {
    }
}