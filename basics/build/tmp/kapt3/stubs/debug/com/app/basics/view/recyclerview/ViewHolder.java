package com.app.basics.view.recyclerview;

import java.lang.System;

/**
 * Created by HankGreen on 2017/11/22.
 * desc:
 */
@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00032\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\r2\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001cJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0016\u0010\u001e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/app/basics/view/recyclerview/ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mView", "Landroid/util/SparseArray;", "getView", "T", "viewId", "", "(I)Landroid/view/View;", "getViewGroup", "Landroid/view/ViewGroup;", "(I)Landroid/view/ViewGroup;", "setHintText", "text", "", "setImagePath", "imageLoader", "Lcom/app/basics/view/recyclerview/ViewHolder$HolderImageLoader;", "setImageResource", "resId", "setOnItemClickListener", "", "listener", "Landroid/view/View$OnClickListener;", "setOnItemLongClickListener", "Landroid/view/View$OnLongClickListener;", "setText", "setViewVisibility", "visibility", "HolderImageLoader", "basics_debug"})
public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
    private android.util.SparseArray<android.view.View> mView;
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends android.view.View>T getView(int viewId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends android.view.ViewGroup>T getViewGroup(int viewId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final com.app.basics.view.recyclerview.ViewHolder setText(int viewId, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.basics.view.recyclerview.ViewHolder setHintText(int viewId, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
        return null;
    }
    
    /**
     * 设置本地图片
     *
     * @param viewId
     * @param resId
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.basics.view.recyclerview.ViewHolder setImageResource(int viewId, int resId) {
        return null;
    }
    
    /**
     * 加载图片资源路径
     *
     * @param viewId
     * @param imageLoader
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.basics.view.recyclerview.ViewHolder setImagePath(int viewId, @org.jetbrains.annotations.NotNull()
    com.app.basics.view.recyclerview.ViewHolder.HolderImageLoader imageLoader) {
        return null;
    }
    
    /**
     * 设置View的Visibility
     */
    @org.jetbrains.annotations.NotNull()
    public final com.app.basics.view.recyclerview.ViewHolder setViewVisibility(int viewId, int visibility) {
        return null;
    }
    
    /**
     * 设置条目点击事件
     */
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    /**
     * 设置条目长按事件
     */
    public final void setOnItemLongClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnLongClickListener listener) {
    }
    
    public ViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/app/basics/view/recyclerview/ViewHolder$HolderImageLoader;", "", "path", "", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "loadImage", "", "iv", "Landroid/widget/ImageView;", "basics_debug"})
    public static abstract class HolderImageLoader {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String path = null;
        
        /**
         * 需要去复写这个方法加载图片
         *
         * @param iv
         * @param path
         */
        public abstract void loadImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView iv, @org.jetbrains.annotations.NotNull()
        java.lang.String path);
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPath() {
            return null;
        }
        
        public HolderImageLoader(@org.jetbrains.annotations.NotNull()
        java.lang.String path) {
            super();
        }
    }
}