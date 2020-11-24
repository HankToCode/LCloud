package com.app.basics.net.interceptor.download;

import java.lang.System;

/**
 * Created by HankGreen on 2017/5/11.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB\u000f\b\u0014\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/app/basics/net/interceptor/download/DownLoadStateBean;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "total", "", "bytesLoaded", "(JJ)V", "tag", "", "(JJLjava/lang/String;)V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getBytesLoaded", "()J", "setBytesLoaded", "(J)V", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "getTotal", "setTotal", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "basics_debug"})
public class DownLoadStateBean implements java.io.Serializable, android.os.Parcelable {
    private long total;
    private long bytesLoaded;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tag;
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<com.app.basics.net.interceptor.download.DownLoadStateBean> CREATOR = null;
    public static final com.app.basics.net.interceptor.download.DownLoadStateBean.Companion Companion = null;
    
    public final long getTotal() {
        return 0L;
    }
    
    public final void setTotal(long p0) {
    }
    
    public final long getBytesLoaded() {
        return 0L;
    }
    
    public final void setBytesLoaded(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    public DownLoadStateBean(long total, long bytesLoaded) {
        super();
    }
    
    public DownLoadStateBean(long total, long bytesLoaded, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
        super();
    }
    
    protected DownLoadStateBean(@org.jetbrains.annotations.NotNull()
    android.os.Parcel in) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/app/basics/net/interceptor/download/DownLoadStateBean$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/app/basics/net/interceptor/download/DownLoadStateBean;", "basics_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}