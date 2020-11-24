package com.app.basics.utils;

import java.lang.System;

/**
 * 状态栏透明
 * 暂时废弃、达不到预期效果
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/app/basics/utils/StatusBarUtil;", "", "()V", "Companion", "basics_debug"})
public final class StatusBarUtil {
    private static int DEFAULT_COLOR;
    private static float DEFAULT_ALPHA;
    private static final int MIN_API = 19;
    public static final com.app.basics.utils.StatusBarUtil.Companion Companion = null;
    
    public StatusBarUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0004J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0004H\u0007J\u0018\u0010\u0015\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\tJ\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ$\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0003\u0010\u0012\u001a\u00020\u0004H\u0007J\u000e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\"\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0003\u0010\u0012\u001a\u00020\u0004H\u0007J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010\"\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010#\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J \u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\'"}, d2 = {"Lcom/app/basics/utils/StatusBarUtil$Companion;", "", "()V", "DEFAULT_ALPHA", "", "DEFAULT_COLOR", "", "MIN_API", "isFlyme4Later", "", "()Z", "isMIUI6Later", "darkMode", "", "activity", "Landroid/app/Activity;", "dark", "color", "alpha", "window", "Landroid/view/Window;", "darkModeForFlyme4", "darkModeForM", "darkModeForMIUI6", "darkmode", "getStatusBarHeight", "context", "Landroid/content/Context;", "immersive", "mixtureColor", "setHeightAndPadding", "view", "Landroid/view/View;", "setMargin", "setPadding", "setPaddingSmart", "setTranslucentView", "container", "Landroid/view/ViewGroup;", "basics_debug"})
    public static final class Companion {
        
        private final boolean isFlyme4Later() {
            return false;
        }
        
        private final boolean isMIUI6Later() {
            return false;
        }
        
        public final void immersive(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, int color, @android.support.annotation.FloatRange(from = 0.0, to = 1.0)
        float alpha) {
        }
        
        public final void immersive(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, int color) {
        }
        
        public final void immersive(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        public final void immersive(@org.jetbrains.annotations.NotNull()
        android.view.Window window) {
        }
        
        public final void immersive(@org.jetbrains.annotations.NotNull()
        android.view.Window window, int color, @android.support.annotation.FloatRange(from = 0.0, to = 1.0)
        float alpha) {
        }
        
        public final void immersive(@org.jetbrains.annotations.NotNull()
        android.view.Window window, int color) {
        }
        
        @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
        public final void darkMode(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, boolean dark) {
        }
        
        /**
         * 设置状态栏darkMode,字体颜色及icon变黑(目前支持MIUI6以上,Flyme4以上,Android M以上)
         */
        public final void darkMode(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        public final void darkMode(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, int color, @android.support.annotation.FloatRange(from = 0.0, to = 1.0)
        float alpha) {
        }
        
        /**
         * 设置状态栏darkMode,字体颜色及icon变黑(目前支持MIUI6以上,Flyme4以上,Android M以上)
         */
        @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
        public final void darkMode(@org.jetbrains.annotations.NotNull()
        android.view.Window window, int color, @android.support.annotation.FloatRange(from = 0.0, to = 1.0)
        float alpha) {
        }
        
        /**
         * android 6.0设置字体颜色
         */
        @android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
        public final void darkModeForM(@org.jetbrains.annotations.NotNull()
        android.view.Window window, boolean dark) {
        }
        
        /**
         * 设置Flyme4+的darkMode,darkMode时候字体颜色及icon变黑
         * http://open-wiki.flyme.cn/index.php?title=Flyme%E7%B3%BB%E7%BB%9FAPI
         */
        public final boolean darkModeForFlyme4(@org.jetbrains.annotations.Nullable()
        android.view.Window window, boolean dark) {
            return false;
        }
        
        /**
         * 设置MIUI6+的状态栏是否为darkMode,darkMode时候字体颜色及icon变黑
         * http://dev.xiaomi.com/doc/p=4769/
         */
        public final boolean darkModeForMIUI6(@org.jetbrains.annotations.NotNull()
        android.view.Window window, boolean darkmode) {
            return false;
        }
        
        /**
         * 增加View的paddingTop,增加的值为状态栏高度
         */
        public final void setPadding(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        /**
         * 增加View的paddingTop,增加的值为状态栏高度 (智能判断，并设置高度)
         */
        public final void setPaddingSmart(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        /**
         * 增加View的高度以及paddingTop,增加的值为状态栏高度.一般是在沉浸式全屏给ToolBar用的
         */
        public final void setHeightAndPadding(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        /**
         * 增加View上边距（MarginTop）一般是给高度为 WARP_CONTENT 的小控件用的
         */
        public final void setMargin(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        /**
         * 创建假的透明栏
         */
        public final void setTranslucentView(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup container, int color, @android.support.annotation.FloatRange(from = 0.0, to = 1.0)
        float alpha) {
        }
        
        public final int mixtureColor(int color, @android.support.annotation.FloatRange(from = 0.0, to = 1.0)
        float alpha) {
            return 0;
        }
        
        /**
         * 获取状态栏高度
         */
        public final int getStatusBarHeight(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}