package com.app.basics.net.interceptor.download;

import java.lang.System;

/**
 * Created by HankGreen on 2017/5/11.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/app/basics/net/interceptor/download/DownLoadSubscriber;", "T", "Lio/reactivex/observers/DisposableObserver;", "fileCallBack", "Lcom/app/basics/net/interceptor/download/ProgressCallBack;", "(Lcom/app/basics/net/interceptor/download/ProgressCallBack;)V", "onComplete", "", "onError", "e", "", "onNext", "t", "(Ljava/lang/Object;)V", "onStart", "basics_debug"})
public final class DownLoadSubscriber<T extends java.lang.Object> extends io.reactivex.observers.DisposableObserver<T> {
    private final com.app.basics.net.interceptor.download.ProgressCallBack<T> fileCallBack = null;
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    @java.lang.Override()
    public void onNext(T t) {
    }
    
    public DownLoadSubscriber(@org.jetbrains.annotations.Nullable()
    com.app.basics.net.interceptor.download.ProgressCallBack<T> fileCallBack) {
        super();
    }
}