package com.app.basics.net.interceptor.download;

import java.lang.System;

/**
 * Created by HankGreen on 2017/5/11.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/app/basics/net/interceptor/download/ProgressResponseBody;", "Lokhttp3/ResponseBody;", "responseBody", "(Lokhttp3/ResponseBody;)V", "tag", "", "(Lokhttp3/ResponseBody;Ljava/lang/String;)V", "bufferedSource", "Lokio/BufferedSource;", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "source", "Lokio/Source;", "basics_debug"})
public final class ProgressResponseBody extends okhttp3.ResponseBody {
    private okhttp3.ResponseBody responseBody;
    private okio.BufferedSource bufferedSource;
    private java.lang.String tag;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @java.lang.Override()
    public long contentLength() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okio.BufferedSource source() {
        return null;
    }
    
    private final okio.Source source(okio.Source source) {
        return null;
    }
    
    public ProgressResponseBody(@org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody responseBody) {
        super();
    }
    
    public ProgressResponseBody(@org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody responseBody, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
        super();
    }
}