package com.app.basics.view;

import java.lang.System;

/**
 * Created by HankGreen on 2017/12/1.
 * desc: View 动画工具类
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J2\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/app/basics/view/ViewAnimUtils;", "", "()V", "animateRevealHide", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "finalRadius", "", "color", "listener", "Lcom/app/basics/view/ViewAnimUtils$OnRevealAnimationListener;", "animateRevealShow", "startRadius", "OnRevealAnimationListener", "basics_debug"})
public final class ViewAnimUtils {
    public static final com.app.basics.view.ViewAnimUtils INSTANCE = null;
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    public final void animateRevealShow(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View view, int startRadius, @androidx.annotation.ColorRes()
    int color, @org.jetbrains.annotations.NotNull()
    com.app.basics.view.ViewAnimUtils.OnRevealAnimationListener listener) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    public final void animateRevealHide(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View view, int finalRadius, @androidx.annotation.ColorRes()
    int color, @org.jetbrains.annotations.NotNull()
    com.app.basics.view.ViewAnimUtils.OnRevealAnimationListener listener) {
    }
    
    private ViewAnimUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/app/basics/view/ViewAnimUtils$OnRevealAnimationListener;", "", "onRevealHide", "", "onRevealShow", "basics_debug"})
    public static abstract interface OnRevealAnimationListener {
        
        public abstract void onRevealHide();
        
        public abstract void onRevealShow();
    }
}