package com.app.basics.base;

import java.lang.System;

/**
 * @author Jake.Ho
 * created: 2017/10/25
 * desc: Presenter 基类
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/app/basics/base/IPresenter;", "V", "Lcom/app/basics/base/IBaseView;", "", "attachView", "", "mRootView", "(Lcom/app/basics/base/IBaseView;)V", "detachView", "basics_debug"})
public abstract interface IPresenter<V extends com.app.basics.base.IBaseView> {
    
    public abstract void attachView(@org.jetbrains.annotations.NotNull()
    V mRootView);
    
    public abstract void detachView();
}