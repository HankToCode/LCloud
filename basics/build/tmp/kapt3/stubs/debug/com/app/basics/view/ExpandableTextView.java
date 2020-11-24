package com.app.basics.view;

import java.lang.System;

/**
 * 可折叠，展开的TextView
 * Created by HankGreen on 2017/11/27
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0003456B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u001a\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\rH\u0002J\b\u0010+\u001a\u00020\'H\u0002J\u0010\u0010,\u001a\u00020\'2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010-\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010.\u001a\u00020\'H\u0014J\u0018\u0010/\u001a\u00020\'2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\nH\u0014J\u0010\u00102\u001a\u00020\'2\u0006\u00103\u001a\u00020\nH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010 \u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u00067"}, d2 = {"Lcom/app/basics/view/ExpandableTextView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAnimAlphaStart", "", "mAnimating", "", "mAnimationDuration", "mButton", "Landroid/widget/ImageView;", "mCollapseDrawable", "Landroid/graphics/drawable/Drawable;", "mCollapsed", "mCollapsedHeight", "mExpandDrawable", "mListener", "Lcom/app/basics/view/ExpandableTextView$OnExpandStateChangeListener;", "mMarginBetweenTxtAndBottom", "mMaxCollapsedLines", "mRelayout", "mTextHeightWithMaxLines", "mTextView", "Landroid/widget/TextView;", "text", "", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "applyAlphaAnimation", "", "view", "Landroid/view/View;", "alpha", "findViews", "initView", "onClick", "onFinishInflate", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setOrientation", "orientation", "Companion", "ExpandCollapseAnimation", "OnExpandStateChangeListener", "basics_debug"})
public final class ExpandableTextView extends android.widget.LinearLayout implements android.view.View.OnClickListener {
    private android.widget.TextView mTextView;
    private android.widget.ImageView mButton;
    private boolean mRelayout;
    private boolean mCollapsed;
    private android.graphics.drawable.Drawable mExpandDrawable;
    private android.graphics.drawable.Drawable mCollapseDrawable;
    private int mMaxCollapsedLines;
    private int mTextHeightWithMaxLines;
    private int mMarginBetweenTxtAndBottom;
    private int mCollapsedHeight;
    private boolean mAnimating;
    private float mAnimAlphaStart;
    private int mAnimationDuration;
    private final com.app.basics.view.ExpandableTextView.OnExpandStateChangeListener mListener = null;
    private static final int MAX_COLLAPSED_LINES = 8;
    private static final int DEFAULT_ANIM_DURATION = 300;
    private static final float DEFAULT_ANIM_ALPHA_START = 0.7F;
    public static final com.app.basics.view.ExpandableTextView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.CharSequence getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    private final void initView(android.util.AttributeSet attrs) {
    }
    
    /**
     * 该组合控件只支持垂直布局
     *
     * @param orientation
     */
    @java.lang.Override()
    public void setOrientation(int orientation) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    private final void findViews() {
    }
    
    /**
     * 点击展开/折叠
     */
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void applyAlphaAnimation(android.view.View view, float alpha) {
    }
    
    public ExpandableTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ExpandableTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ExpandableTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/app/basics/view/ExpandableTextView$ExpandCollapseAnimation;", "Landroid/view/animation/Animation;", "mTargetView", "Landroid/view/View;", "mStartHeight", "", "mEndHeight", "(Lcom/app/basics/view/ExpandableTextView;Landroid/view/View;II)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "willChangeBounds", "", "basics_debug"})
    public final class ExpandCollapseAnimation extends android.view.animation.Animation {
        private final android.view.View mTargetView = null;
        private final int mStartHeight = 0;
        private final int mEndHeight = 0;
        
        @java.lang.Override()
        protected void applyTransformation(float interpolatedTime, @org.jetbrains.annotations.NotNull()
        android.view.animation.Transformation t) {
        }
        
        @java.lang.Override()
        public boolean willChangeBounds() {
            return false;
        }
        
        public ExpandCollapseAnimation(@org.jetbrains.annotations.NotNull()
        android.view.View mTargetView, int mStartHeight, int mEndHeight) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/app/basics/view/ExpandableTextView$OnExpandStateChangeListener;", "", "onExpandStateChanged", "", "textView", "Landroid/widget/TextView;", "isExpanded", "", "basics_debug"})
    public static abstract interface OnExpandStateChangeListener {
        
        /**
         * Called when the expand/collapse animation has been finished
         *
         * @param textView - TextView being expanded/collapsed
         * @param isExpanded - true if the TextView has been expanded
         */
        public abstract void onExpandStateChanged(@org.jetbrains.annotations.Nullable()
        android.widget.TextView textView, boolean isExpanded);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/app/basics/view/ExpandableTextView$Companion;", "", "()V", "DEFAULT_ANIM_ALPHA_START", "", "DEFAULT_ANIM_DURATION", "", "MAX_COLLAPSED_LINES", "getDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "resId", "getRealTextViewHeight", "textView", "Landroid/widget/TextView;", "basics_debug"})
    public static final class Companion {
        
        /**
         * 获取TextView真正的高度
         *
         * @param textView
         * @return
         */
        private final int getRealTextViewHeight(android.widget.TextView textView) {
            return 0;
        }
        
        private final android.graphics.drawable.Drawable getDrawable(android.content.Context context, @android.support.annotation.DrawableRes()
        int resId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}