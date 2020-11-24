package com.app.basics.utils;

import java.lang.System;

/**
 * Created by HankGreen on 2017/11/27.
 * desc:
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0012J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0016J\r\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u001aJ\r\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u001aJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006 "}, d2 = {"Lcom/app/basics/utils/DisplayManager;", "", "()V", "STANDARD_HEIGHT", "", "STANDARD_WIDTH", "displayMetrics", "Landroid/util/DisplayMetrics;", "screenDpi", "Ljava/lang/Integer;", "screenHeight", "screenWidth", "dip2px", "dipValue", "", "(F)Ljava/lang/Integer;", "getPaintSize", "size", "(I)Ljava/lang/Integer;", "getRealHeight", "px", "parentHeight", "(IF)Ljava/lang/Integer;", "getRealWidth", "parentWidth", "getScreenHeight", "()Ljava/lang/Integer;", "getScreenWidth", "init", "", "context", "Landroid/content/Context;", "basics_debug"})
public final class DisplayManager {
    private static android.util.DisplayMetrics displayMetrics;
    private static java.lang.Integer screenWidth;
    private static java.lang.Integer screenHeight;
    private static java.lang.Integer screenDpi;
    private static final int STANDARD_WIDTH = 1080;
    private static final int STANDARD_HEIGHT = 1920;
    public static final com.app.basics.utils.DisplayManager INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getScreenWidth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getScreenHeight() {
        return null;
    }
    
    /**
     * 传入UI图中问题的高度，单位像素
     * @param size
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPaintSize(int size) {
        return null;
    }
    
    /**
     * 输入UI图的尺寸，输出实际的px
     *
     * @param px ui图中的大小
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRealWidth(int px) {
        return null;
    }
    
    /**
     * 输入UI图的尺寸，输出实际的px,第二个参数是父布局
     *
     * @param px          ui图中的大小
     * @param parentWidth 父view在ui图中的高度
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRealWidth(int px, float parentWidth) {
        return null;
    }
    
    /**
     * 输入UI图的尺寸，输出实际的px
     *
     * @param px ui图中的大小
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRealHeight(int px) {
        return null;
    }
    
    /**
     * 输入UI图的尺寸，输出实际的px,第二个参数是父布局
     *
     * @param px           ui图中的大小
     * @param parentHeight 父view在ui图中的高度
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRealHeight(int px, float parentHeight) {
        return null;
    }
    
    /**
     * dip转px
     * @param dipValue
     * @return int
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer dip2px(float dipValue) {
        return null;
    }
    
    private DisplayManager() {
        super();
    }
}