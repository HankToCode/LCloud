package com.app.basics.view.recyclerview.adapter;

import java.lang.System;

/**
 * Created by HankGreen on 2017/11/22.
 * desc: 通用的 Adapter
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B5\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u00a2\u0006\u0002\u0010\u000bB-\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\'\u001a\u00020\u000fH$\u00a2\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u000fH\u0016J\u0010\u0010*\u001a\u00020\u000f2\u0006\u0010\'\u001a\u00020\u000fH\u0016J\u0018\u0010+\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020\u000fH\u0016J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000fH\u0016J\u000e\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020 J\u000e\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020\"R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/app/basics/view/recyclerview/adapter/CommonAdapter;", "T", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/app/basics/view/recyclerview/ViewHolder;", "context", "Landroid/content/Context;", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "typeSupport", "Lcom/app/basics/view/recyclerview/MultipleType;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/app/basics/view/recyclerview/MultipleType;)V", "mContext", "mData", "mLayoutId", "", "(Landroid/content/Context;Ljava/util/ArrayList;I)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "getMData", "()Ljava/util/ArrayList;", "setMData", "(Ljava/util/ArrayList;)V", "mInflater", "Landroid/view/LayoutInflater;", "getMInflater", "()Landroid/view/LayoutInflater;", "setMInflater", "(Landroid/view/LayoutInflater;)V", "mItemClickListener", "Lcom/app/basics/view/recyclerview/adapter/OnItemClickListener;", "mItemLongClickListener", "Lcom/app/basics/view/recyclerview/adapter/OnItemLongClickListener;", "mTypeSupport", "bindData", "", "holder", "position", "(Lcom/app/basics/view/recyclerview/ViewHolder;Ljava/lang/Object;I)V", "getItemCount", "getItemViewType", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "itemClickListener", "setOnItemLongClickListener", "itemLongClickListener", "basics_debug"})
public abstract class CommonAdapter<T extends java.lang.Object> extends android.support.v7.widget.RecyclerView.Adapter<com.app.basics.view.recyclerview.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private android.view.LayoutInflater mInflater;
    private com.app.basics.view.recyclerview.MultipleType<? super T> mTypeSupport;
    private com.app.basics.view.recyclerview.adapter.OnItemClickListener mItemClickListener;
    private com.app.basics.view.recyclerview.adapter.OnItemLongClickListener mItemLongClickListener;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<T> mData;
    private int mLayoutId;
    
    @org.jetbrains.annotations.Nullable()
    protected final android.view.LayoutInflater getMInflater() {
        return null;
    }
    
    protected final void setMInflater(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.app.basics.view.recyclerview.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.app.basics.view.recyclerview.ViewHolder holder, int position) {
    }
    
    /**
     * 将必要参数传递出去
     *
     * @param holder
     * @param data
     * @param position
     */
    protected abstract void bindData(@org.jetbrains.annotations.NotNull()
    com.app.basics.view.recyclerview.ViewHolder holder, T data, int position);
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.app.basics.view.recyclerview.adapter.OnItemClickListener itemClickListener) {
    }
    
    public final void setOnItemLongClickListener(@org.jetbrains.annotations.NotNull()
    com.app.basics.view.recyclerview.adapter.OnItemLongClickListener itemLongClickListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getMData() {
        return null;
    }
    
    public final void setMData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> p0) {
    }
    
    public CommonAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> mData, int mLayoutId) {
        super();
    }
    
    public CommonAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> data, @org.jetbrains.annotations.NotNull()
    com.app.basics.view.recyclerview.MultipleType<? super T> typeSupport) {
        super();
    }
}