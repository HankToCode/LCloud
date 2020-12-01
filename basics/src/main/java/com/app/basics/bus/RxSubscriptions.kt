package com.app.basics.bus

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * 管理 CompositeSubscription
 */
class RxSubscriptions {
    private val mSubscriptions = CompositeDisposable()
    val isDisposed: Boolean
        get() = mSubscriptions.isDisposed

    fun add(s: Disposable?) {
        if (s != null) {
            mSubscriptions.add(s)
        }
    }

    fun add(vararg s: Disposable?) {
        mSubscriptions.addAll(*s)
    }

    fun remove(s: Disposable?) {
        if (s != null) {
            mSubscriptions.remove(s)
        }
    }

    fun clear() {
        mSubscriptions.clear()
    }

    fun dispose() {
        mSubscriptions.dispose()
    }



}