package com.app.basics.utils.constant;

import java.lang.System;

/**
 * Created by HankGreen on 2017/5/14.
 * 存储相关常量
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/app/basics/utils/constant/MemoryConstants;", "", "()V", "BYTE", "", "GB", "KB", "MB", "Unit", "basics_debug"})
public final class MemoryConstants {
    
    /**
     * Byte与Byte的倍数
     */
    public static final int BYTE = 1;
    
    /**
     * KB与Byte的倍数
     */
    public static final int KB = 1024;
    
    /**
     * MB与Byte的倍数
     */
    public static final int MB = 1048576;
    
    /**
     * GB与Byte的倍数
     */
    public static final int GB = 1073741824;
    public static final com.app.basics.utils.constant.MemoryConstants INSTANCE = null;
    
    private MemoryConstants() {
        super();
    }
    
    @androidx.annotation.IntDef(value = {1, 1024, 1048576, 1073741824})
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/app/basics/utils/constant/MemoryConstants$Unit;", "", "basics_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface Unit {
    }
}