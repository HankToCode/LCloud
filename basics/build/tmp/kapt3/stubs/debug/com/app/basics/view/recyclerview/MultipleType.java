package com.app.basics.view.recyclerview;

import java.lang.System;

/**
 * Created by HankGreen on 2017/11/22.
 * desc: 多布局条目类型
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0004H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/app/basics/view/recyclerview/MultipleType;", "T", "", "getLayoutId", "", "item", "position", "(Ljava/lang/Object;I)I", "basics_debug"})
public abstract interface MultipleType<T extends java.lang.Object> {
    
    public abstract int getLayoutId(T item, int position);
}