package com.app.basics.net.interceptor.download;

import java.lang.System;

/**
 * Created by HankGreen on 2017/9/26 0026.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H&J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\fJ\b\u0010\u001b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/app/basics/net/interceptor/download/ProgressCallBack;", "T", "", "destFileDir", "", "destFileName", "(Ljava/lang/String;Ljava/lang/String;)V", "mSubscription", "Lio/reactivex/disposables/Disposable;", "mSubscriptions", "Lio/reactivex/disposables/CompositeDisposable;", "onCompleted", "", "onError", "e", "", "onStart", "onSuccess", "t", "(Ljava/lang/Object;)V", "progress", "", "total", "saveFile", "body", "Lokhttp3/ResponseBody;", "subscribeLoadProgress", "unSubscribe", "basics_debug"})
public abstract class ProgressCallBack<T extends java.lang.Object> {
    private final io.reactivex.disposables.CompositeDisposable mSubscriptions = null;
    private io.reactivex.disposables.Disposable mSubscription;
    private final java.lang.String destFileDir = null;
    private final java.lang.String destFileName = null;
    
    public abstract void onSuccess(T t);
    
    public abstract void progress(long progress, long total);
    
    public void onStart() {
    }
    
    public void onCompleted() {
    }
    
    public abstract void onError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable e);
    
    public final void saveFile(@org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody body) {
    }
    
    /**
     * 订阅加载的进度条
     */
    public final void subscribeLoadProgress() {
    }
    
    /**
     * 取消订阅，防止内存泄漏
     */
    private final void unSubscribe() {
    }
    
    public ProgressCallBack(@org.jetbrains.annotations.NotNull()
    java.lang.String destFileDir, @org.jetbrains.annotations.NotNull()
    java.lang.String destFileName) {
        super();
    }
}