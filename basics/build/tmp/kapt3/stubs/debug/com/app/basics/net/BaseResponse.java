package com.app.basics.net;

import java.lang.System;

/**
 * Created by HankGreen on 2017/11/16.
 * 封装返回的数据
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/app/basics/net/BaseResponse;", "T", "", "code", "", "msg", "", "data", "(ILjava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMsg", "()Ljava/lang/String;", "basics_debug"})
public final class BaseResponse<T extends java.lang.Object> {
    private final int code = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String msg = null;
    private final T data = null;
    
    public final int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMsg() {
        return null;
    }
    
    public final T getData() {
        return null;
    }
    
    public BaseResponse(int code, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, T data) {
        super();
    }
}