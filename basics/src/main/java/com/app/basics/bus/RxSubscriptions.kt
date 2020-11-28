package com.app.basics.bus

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * 管理 CompositeSubscription
 */
class RxSubscriptions {
    /**
     * RX订阅处理
     */
    private val mSubscriptions = CompositeDisposable()
    private val isDisposed: Boolean
        get() = mSubscriptions.isDisposed

    fun add(s: Disposable?) {
        if (s != null) {
            mSubscriptions.add(s)
        }
    }

    fun remove(s: Disposable?) {
        if (s != null) {
            mSubscriptions.remove(s)
        }
    }

    fun dispose() {
        mSubscriptions.dispose()
    }


    /**
     * 取消当前活动的所有订阅
     */
    fun disSubscription() {
        //保证activity结束时取消所有正在执行的订阅
        if (!isDisposed) {
            mSubscriptions.clear()
        }
    }

    /**
     * 为当前活动添加订阅，方便管理
     */
    fun addSubscription(vararg disposable: Disposable) {
        mSubscriptions.addAll(*disposable)
    }
}