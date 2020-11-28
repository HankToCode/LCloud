package com.app.basics.bus;

import java.lang.System;

/**
 * 管理 CompositeSubscription
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u000e\"\u00020\u000b\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0011\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/app/basics/bus/RxSubscriptions;", "", "()V", "isDisposed", "", "()Z", "mSubscriptions", "Lio/reactivex/disposables/CompositeDisposable;", "add", "", "s", "Lio/reactivex/disposables/Disposable;", "addSubscription", "disposable", "", "([Lio/reactivex/disposables/Disposable;)V", "disSubscription", "dispose", "remove", "basics_debug"})
public final class RxSubscriptions {
    
    /**
     * RX订阅处理
     */
    private final io.reactivex.disposables.CompositeDisposable mSubscriptions = null;
    
    private final boolean isDisposed() {
        return false;
    }
    
    public final void add(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.Disposable s) {
    }
    
    public final void remove(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.Disposable s) {
    }
    
    public final void dispose() {
    }
    
    /**
     * 取消当前活动的所有订阅
     */
    public final void disSubscription() {
    }
    
    /**
     * 为当前活动添加订阅，方便管理
     */
    public final void addSubscription(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable... disposable) {
    }
    
    public RxSubscriptions() {
        super();
    }
}