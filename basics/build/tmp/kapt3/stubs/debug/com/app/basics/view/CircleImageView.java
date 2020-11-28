package com.app.basics.view;

import java.lang.System;

/**
 * Created by HankGreen on 2017/12/4.
 * desc: 圆角的 ImageView
 */
@kotlin.Suppress(names = {"IMPLICIT_CAST_TO_ANY"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/app/basics/view/CircleImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mBorderColor", "", "mBorderWidth", "mMatrix", "Landroid/graphics/Matrix;", "mPaintBitmap", "Landroid/graphics/Paint;", "mPaintBorder", "mRawBitmap", "Landroid/graphics/Bitmap;", "mRectBitmap", "Landroid/graphics/RectF;", "mRectBorder", "mRectRoundRadius", "mShader", "Landroid/graphics/BitmapShader;", "mType", "dip2px", "dipVal", "getBitmap", "drawable", "Landroid/graphics/drawable/Drawable;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "Companion", "basics_debug"})
public final class CircleImageView extends androidx.appcompat.widget.AppCompatImageView {
    private final int mType = 0;
    private final int mBorderColor = 0;
    private final int mBorderWidth = 0;
    private final int mRectRoundRadius = 0;
    private final android.graphics.Paint mPaintBitmap = null;
    private final android.graphics.Paint mPaintBorder = null;
    private final android.graphics.RectF mRectBorder = null;
    private final android.graphics.RectF mRectBitmap = null;
    private android.graphics.Bitmap mRawBitmap;
    private android.graphics.BitmapShader mShader;
    private final android.graphics.Matrix mMatrix = null;
    
    /**
     * android.widget.ImageView
     */
    private static final int TYPE_NONE = 0;
    
    /**
     * 圆形
     */
    private static final int TYPE_CIRCLE = 1;
    
    /**
     * 圆角矩形
     */
    private static final int TYPE_ROUNDED_RECT = 2;
    private static final int DEFAULT_TYPE = 0;
    private static final int DEFAULT_BORDER_COLOR = android.graphics.Color.TRANSPARENT;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final int DEFAULT_RECT_ROUND_RADIUS = 0;
    public static final com.app.basics.view.CircleImageView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final int dip2px(int dipVal) {
        return 0;
    }
    
    private final android.graphics.Bitmap getBitmap(android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    public CircleImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/app/basics/view/CircleImageView$Companion;", "", "()V", "DEFAULT_BORDER_COLOR", "", "DEFAULT_BORDER_WIDTH", "DEFAULT_RECT_ROUND_RADIUS", "DEFAULT_TYPE", "TYPE_CIRCLE", "getTYPE_CIRCLE", "()I", "TYPE_NONE", "getTYPE_NONE", "TYPE_ROUNDED_RECT", "getTYPE_ROUNDED_RECT", "basics_debug"})
    public static final class Companion {
        
        public final int getTYPE_NONE() {
            return 0;
        }
        
        public final int getTYPE_CIRCLE() {
            return 0;
        }
        
        public final int getTYPE_ROUNDED_RECT() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}