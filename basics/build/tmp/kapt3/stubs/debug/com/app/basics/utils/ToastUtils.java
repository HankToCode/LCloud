package com.app.basics.utils;

import java.lang.System;

/**
 * Created by HankGreen on 2017/5/14.
 * 吐司工具类
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/app/basics/utils/ToastUtils;", "", "()V", "Companion", "basics_debug"})
public final class ToastUtils {
    private static final int DEFAULT_COLOR = 301989888;
    private static android.widget.Toast sToast;
    private static int gravity;
    private static int xOffset;
    private static int yOffset;
    private static int backgroundColor;
    private static int bgResource;
    private static int messageColor;
    private static java.lang.ref.WeakReference<android.view.View> sViewWeakReference;
    private static final android.os.Handler sHandler = null;
    public static final com.app.basics.utils.ToastUtils.Companion Companion = null;
    
    private ToastUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0018\u001a\u00020\u00162\b\b\u0001\u0010\u0006\u001a\u00020\u0004J\u001e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u001a\u001a\u00020\u00162\b\b\u0001\u0010\b\u001a\u00020\u0004J\u0010\u0010\u001b\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u001b\u001a\u00020\u00162\b\b\u0001\u0010\u001c\u001a\u00020\u0004J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004H\u0002J\u001a\u0010\u001d\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002J7\u0010\u001d\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010#\"\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0002\u0010$J5\u0010\u001d\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00042\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010#\"\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0002\u0010\'J\u0006\u0010(\u001a\u00020\u0016J\u0006\u0010)\u001a\u00020\u0016J\u0006\u0010*\u001a\u00020\u0016J\u0006\u0010+\u001a\u00020\u0016J\u000e\u0010,\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010,\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u0004J-\u0010,\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u00042\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010#\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010-J+\u0010,\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010#\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010/\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u0004J-\u0010/\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u00042\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010#\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010-J+\u0010/\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010#\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010.J\u000e\u00100\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u00100\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u0004J-\u00100\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u00042\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010#\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010-J+\u00100\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010#\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010.J\u000e\u00101\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u00101\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u0004J-\u00101\u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u00042\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010#\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010-J+\u00101\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010#\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010.R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/app/basics/utils/ToastUtils$Companion;", "", "()V", "DEFAULT_COLOR", "", "backgroundColor", "bgResource", "gravity", "messageColor", "sHandler", "Landroid/os/Handler;", "sToast", "Landroid/widget/Toast;", "sViewWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "view", "getView", "()Landroid/view/View;", "xOffset", "yOffset", "cancel", "", "setBackgroundColor", "setBgResource", "setGravity", "setMessageColor", "setView", "layoutId", "show", "text", "", "duration", "resId", "args", "", "(II[Ljava/lang/Object;)V", "format", "", "(Ljava/lang/String;I[Ljava/lang/Object;)V", "showCustomLong", "showCustomLongSafe", "showCustomShort", "showCustomShortSafe", "showLong", "(I[Ljava/lang/Object;)V", "(Ljava/lang/String;[Ljava/lang/Object;)V", "showLongSafe", "showShort", "showShortSafe", "basics_debug"})
    public static final class Companion {
        
        /**
         * 设置吐司位置
         *
         * @param gravity 位置
         * @param xOffset x偏移
         * @param yOffset y偏移
         */
        public final void setGravity(int gravity, int xOffset, int yOffset) {
        }
        
        /**
         * 设置吐司view
         *
         * @param layoutId 视图
         */
        public final void setView(@androidx.annotation.LayoutRes()
        int layoutId) {
        }
        
        /**
         * 设置吐司view
         *
         * @param view 视图
         */
        public final void setView(@org.jetbrains.annotations.Nullable()
        android.view.View view) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.view.View getView() {
            return null;
        }
        
        /**
         * 设置背景颜色
         *
         * @param backgroundColor 背景色
         */
        public final void setBackgroundColor(@androidx.annotation.ColorInt()
        int backgroundColor) {
        }
        
        /**
         * 设置背景资源
         *
         * @param bgResource 背景资源
         */
        public final void setBgResource(@androidx.annotation.DrawableRes()
        int bgResource) {
        }
        
        /**
         * 设置消息颜色
         *
         * @param messageColor 颜色
         */
        public final void setMessageColor(@androidx.annotation.ColorInt()
        int messageColor) {
        }
        
        /**
         * 安全地显示短时吐司
         *
         * @param text 文本
         */
        public final void showShortSafe(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text) {
        }
        
        /**
         * 安全地显示短时吐司
         *
         * @param resId 资源Id
         */
        public final void showShortSafe(@androidx.annotation.StringRes()
        int resId) {
        }
        
        /**
         * 安全地显示短时吐司
         *
         * @param resId 资源Id
         * @param args  参数
         */
        public final void showShortSafe(@androidx.annotation.StringRes()
        int resId, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args) {
        }
        
        /**
         * 安全地显示短时吐司
         *
         * @param format 格式
         * @param args   参数
         */
        public final void showShortSafe(@org.jetbrains.annotations.NotNull()
        java.lang.String format, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args) {
        }
        
        /**
         * 安全地显示长时吐司
         *
         * @param text 文本
         */
        public final void showLongSafe(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text) {
        }
        
        /**
         * 安全地显示长时吐司
         *
         * @param resId 资源Id
         */
        public final void showLongSafe(@androidx.annotation.StringRes()
        int resId) {
        }
        
        /**
         * 安全地显示长时吐司
         *
         * @param resId 资源Id
         * @param args  参数
         */
        public final void showLongSafe(@androidx.annotation.StringRes()
        int resId, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args) {
        }
        
        /**
         * 安全地显示长时吐司
         *
         * @param format 格式
         * @param args   参数
         */
        public final void showLongSafe(@org.jetbrains.annotations.NotNull()
        java.lang.String format, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args) {
        }
        
        /**
         * 显示短时吐司
         *
         * @param text 文本
         */
        public final void showShort(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text) {
        }
        
        /**
         * 显示短时吐司
         *
         * @param resId 资源Id
         */
        public final void showShort(@androidx.annotation.StringRes()
        int resId) {
        }
        
        /**
         * 显示短时吐司
         *
         * @param resId 资源Id
         * @param args  参数
         */
        public final void showShort(@androidx.annotation.StringRes()
        int resId, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args) {
        }
        
        /**
         * 显示短时吐司
         *
         * @param format 格式
         * @param args   参数
         */
        public final void showShort(@org.jetbrains.annotations.NotNull()
        java.lang.String format, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args) {
        }
        
        /**
         * 显示长时吐司
         *
         * @param text 文本
         */
        public final void showLong(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text) {
        }
        
        /**
         * 显示长时吐司
         *
         * @param resId 资源Id
         */
        public final void showLong(@androidx.annotation.StringRes()
        int resId) {
        }
        
        /**
         * 显示长时吐司
         *
         * @param resId 资源Id
         * @param args  参数
         */
        public final void showLong(@androidx.annotation.StringRes()
        int resId, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args) {
        }
        
        /**
         * 显示长时吐司
         *
         * @param format 格式
         * @param args   参数
         */
        public final void showLong(@org.jetbrains.annotations.NotNull()
        java.lang.String format, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args) {
        }
        
        /**
         * 安全地显示短时自定义吐司
         */
        public final void showCustomShortSafe() {
        }
        
        /**
         * 安全地显示长时自定义吐司
         */
        public final void showCustomLongSafe() {
        }
        
        /**
         * 显示短时自定义吐司
         */
        public final void showCustomShort() {
        }
        
        /**
         * 显示长时自定义吐司
         */
        public final void showCustomLong() {
        }
        
        /**
         * 显示吐司
         *
         * @param resId    资源Id
         * @param duration 显示时长
         */
        private final void show(@androidx.annotation.StringRes()
        int resId, int duration) {
        }
        
        /**
         * 显示吐司
         *
         * @param resId    资源Id
         * @param duration 显示时长
         * @param args     参数
         */
        private final void show(@androidx.annotation.StringRes()
        int resId, int duration, java.lang.Object... args) {
        }
        
        /**
         * 显示吐司
         *
         * @param format   格式
         * @param duration 显示时长
         * @param args     参数
         */
        private final void show(java.lang.String format, int duration, java.lang.Object... args) {
        }
        
        /**
         * 显示吐司
         *
         * @param text     文本
         * @param duration 显示时长
         */
        private final void show(java.lang.CharSequence text, int duration) {
        }
        
        /**
         * 取消吐司显示
         */
        private final void cancel() {
        }
        
        private Companion() {
            super();
        }
    }
}