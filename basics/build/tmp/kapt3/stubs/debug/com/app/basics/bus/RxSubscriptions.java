package com.app.basics.bus;

import java.lang.System;

/**
 * 管理 CompositeSubscription
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\tJ\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/app/basics/bus/RxSubscriptions;", "", "()V", "isDisposed", "", "()Z", "mSubscriptions", "Lio/reactivex/disposables/CompositeDisposable;", "add", "", "s", "Lio/reactivex/disposables/Disposable;", "clear", "dispose", "remove", "basics_debug"})
public final class RxSubscriptions {
    private static final io.reactivex.disposables.CompositeDisposable mSubscriptions = null;
    public static final com.app.basics.bus.RxSubscriptions INSTANCE = null;
    
    public final boolean isDisposed() {
        return false;
    }
    
    public static final void add(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.Disposable s) {
    }
    
    public static final void remove(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.Disposable s) {
    }
    
    public final void clear() {
    }
    
    public final void dispose() {
    }
    
    private RxSubscriptions() {
        super();
    }
}