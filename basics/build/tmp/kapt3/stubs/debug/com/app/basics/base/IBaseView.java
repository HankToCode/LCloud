package com.app.basics.base;

import java.lang.System;

/**
 * @author Jake.Ho
 * created: 2017/10/25
 * desc:
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/app/basics/base/IBaseView;", "", "dismissLoading", "", "showLoading", "basics_debug"})
public abstract interface IBaseView {
    
    public abstract void showLoading();
    
    public abstract void dismissLoading();
}