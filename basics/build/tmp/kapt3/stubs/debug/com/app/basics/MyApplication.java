package com.app.basics;

import java.lang.System;

/**
 * Created by HankGreen on 2017/11/16.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/app/basics/MyApplication;", "Landroid/app/Application;", "()V", "mActivityLifecycleCallbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "refWatcher", "Lcom/squareup/leakcanary/RefWatcher;", "initConfig", "", "onCreate", "setupLeakCanary", "Companion", "basics_debug"})
public final class MyApplication extends android.app.Application {
    private com.squareup.leakcanary.RefWatcher refWatcher;
    private final android.app.Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks = null;
    private static final java.lang.String TAG = "MyApplication";
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.properties.ReadWriteProperty context$delegate = null;
    public static final com.app.basics.MyApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final com.squareup.leakcanary.RefWatcher setupLeakCanary() {
        return null;
    }
    
    /**
     * 初始化配置
     */
    private final void initConfig() {
    }
    
    public MyApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/app/basics/MyApplication$Companion;", "", "()V", "TAG", "", "<set-?>", "Landroid/content/Context;", "context", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context$delegate", "Lkotlin/properties/ReadWriteProperty;", "getRefWatcher", "Lcom/squareup/leakcanary/RefWatcher;", "basics_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        private final void setContext(android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.squareup.leakcanary.RefWatcher getRefWatcher(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}