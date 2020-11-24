package com.app.basics.net.exception;

import java.lang.System;

/**
 * Created by HankGreen on 2017/12/5.
 * desc:
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/app/basics/net/exception/ErrorStatus;", "", "()V", "API_ERROR", "", "NETWORK_ERROR", "SERVER_ERROR", "SUCCESS", "UNKNOWN_ERROR", "basics_debug"})
public final class ErrorStatus {
    
    /**
     * 响应成功
     */
    public static final int SUCCESS = 0;
    
    /**
     * 未知错误
     */
    public static final int UNKNOWN_ERROR = 1002;
    
    /**
     * 服务器内部错误
     */
    public static final int SERVER_ERROR = 1003;
    
    /**
     * 网络连接超时
     */
    public static final int NETWORK_ERROR = 1004;
    
    /**
     * API解析异常（或者第三方数据结构更改）等其他异常
     */
    public static final int API_ERROR = 1005;
    public static final com.app.basics.net.exception.ErrorStatus INSTANCE = null;
    
    private ErrorStatus() {
        super();
    }
}