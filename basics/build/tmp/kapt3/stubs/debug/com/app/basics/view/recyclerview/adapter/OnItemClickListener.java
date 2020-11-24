package com.app.basics.view.recyclerview.adapter;

import java.lang.System;

/**
 * Created by HankGreen on 2017/2/23.
 * Description: Adapter条目的点击事件
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/app/basics/view/recyclerview/adapter/OnItemClickListener;", "", "onItemClick", "", "obj", "position", "", "basics_debug"})
public abstract interface OnItemClickListener {
    
    public abstract void onItemClick(@org.jetbrains.annotations.Nullable()
    java.lang.Object obj, int position);
}