package com.app.basics.base;

import java.lang.System;

/**
 * Created by HankGreen on 2017/6/15.
 * activity堆栈式管理
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u0011\u001a\u00020\bJ\u0010\u0010\u0011\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\u0011\u001a\u00020\b2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013J\u0006\u0010\u0014\u001a\u00020\bJ\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013J\u0010\u0010\u0016\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0017\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005\u00a8\u0006\u0019"}, d2 = {"Lcom/app/basics/base/AppManager;", "", "()V", "isActivity", "", "()Z", "isFragment", "AppExit", "", "addActivity", "activity", "Landroid/app/Activity;", "addFragment", "fragment", "Landroid/support/v4/app/Fragment;", "currentActivity", "currentFragment", "finishActivity", "cls", "Ljava/lang/Class;", "finishAllActivity", "getActivity", "removeActivity", "removeFragment", "Companion", "basics_debug"})
public final class AppManager {
    @org.jetbrains.annotations.Nullable()
    private static java.util.Stack<android.app.Activity> activityStack;
    @org.jetbrains.annotations.Nullable()
    private static java.util.Stack<android.support.v4.app.Fragment> fragmentStack;
    private static com.app.basics.base.AppManager instance;
    public static final com.app.basics.base.AppManager.Companion Companion = null;
    
    /**
     * 添加Activity到堆栈
     */
    public final void addActivity(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    /**
     * 移除指定的Activity
     */
    public final void removeActivity(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    public final boolean isActivity() {
        return false;
    }
    
    /**
     * 获取当前Activity（堆栈中最后一个压入的）
     */
    @org.jetbrains.annotations.Nullable()
    public final android.app.Activity currentActivity() {
        return null;
    }
    
    /**
     * 结束当前Activity（堆栈中最后一个压入的）
     */
    public final void finishActivity() {
    }
    
    /**
     * 结束指定的Activity
     */
    public final void finishActivity(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    /**
     * 结束指定类名的Activity
     */
    public final void finishActivity(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cls) {
    }
    
    /**
     * 结束所有Activity
     */
    public final void finishAllActivity() {
    }
    
    /**
     * 获取指定的Activity
     *
     * @author kymjs
     */
    @org.jetbrains.annotations.Nullable()
    public final android.app.Activity getActivity(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cls) {
        return null;
    }
    
    /**
     * 添加Fragment到堆栈
     */
    public final void addFragment(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment) {
    }
    
    /**
     * 移除指定的Fragment
     */
    public final void removeFragment(@org.jetbrains.annotations.Nullable()
    android.support.v4.app.Fragment fragment) {
    }
    
    public final boolean isFragment() {
        return false;
    }
    
    /**
     * 获取当前Activity（堆栈中最后一个压入的）
     */
    @org.jetbrains.annotations.Nullable()
    public final android.support.v4.app.Fragment currentFragment() {
        return null;
    }
    
    /**
     * 退出应用程序
     */
    public final void AppExit() {
    }
    
    private AppManager() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final com.app.basics.base.AppManager getAppManager() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR4\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/app/basics/base/AppManager$Companion;", "", "()V", "<set-?>", "Ljava/util/Stack;", "Landroid/app/Activity;", "activityStack", "getActivityStack", "()Ljava/util/Stack;", "setActivityStack", "(Ljava/util/Stack;)V", "appManager", "Lcom/app/basics/base/AppManager;", "appManager$annotations", "getAppManager", "()Lcom/app/basics/base/AppManager;", "Landroid/support/v4/app/Fragment;", "fragmentStack", "getFragmentStack", "setFragmentStack", "instance", "basics_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Stack<android.app.Activity> getActivityStack() {
            return null;
        }
        
        private final void setActivityStack(java.util.Stack<android.app.Activity> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Stack<android.support.v4.app.Fragment> getFragmentStack() {
            return null;
        }
        
        private final void setFragmentStack(java.util.Stack<android.support.v4.app.Fragment> p0) {
        }
        
        /**
         * 单例模式
         *
         * @return AppManager
         */
        public static void appManager$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.basics.base.AppManager getAppManager() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}