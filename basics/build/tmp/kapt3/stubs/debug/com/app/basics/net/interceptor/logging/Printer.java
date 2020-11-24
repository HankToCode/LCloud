package com.app.basics.net.interceptor.logging;

import java.lang.System;

/**
 * @author ihsan on 09/02/2017.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/app/basics/net/interceptor/logging/Printer;", "", "()V", "Companion", "basics_debug"})
public class Printer {
    private static final int JSON_INDENT = 3;
    private static final java.lang.String LINE_SEPARATOR = null;
    private static final java.lang.String DOUBLE_SEPARATOR = null;
    private static final java.lang.String[] OMITTED_RESPONSE = null;
    private static final java.lang.String[] OMITTED_REQUEST = null;
    private static final java.lang.String N = "\n";
    private static final java.lang.String T = "\t";
    private static final java.lang.String REQUEST_UP_LINE = "\u250c\u2500\u2500\u2500\u2500\u2500\u2500 Request \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500";
    private static final java.lang.String END_LINE = "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500";
    private static final java.lang.String RESPONSE_UP_LINE = "\u250c\u2500\u2500\u2500\u2500\u2500\u2500 Response \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500";
    private static final java.lang.String BODY_TAG = "Body:";
    private static final java.lang.String URL_TAG = "URL: ";
    private static final java.lang.String METHOD_TAG = "Method: @";
    private static final java.lang.String HEADERS_TAG = "Headers:";
    private static final java.lang.String STATUS_CODE_TAG = "Status Code: ";
    private static final java.lang.String RECEIVED_TAG = "Received in: ";
    private static final java.lang.String CORNER_UP = "\u250c ";
    private static final java.lang.String CORNER_BOTTOM = "\u2514 ";
    private static final java.lang.String CENTER_LINE = "\u251c ";
    private static final java.lang.String DEFAULT_LINE = "\u2502 ";
    public static final com.app.basics.net.interceptor.logging.Printer.Companion Companion = null;
    
    protected Printer() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004J#\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0002\u00a2\u0006\u0002\u0010&JI\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010 \u001a\u00020\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020,2\u0006\u0010$\u001a\u00020%2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040.H\u0002\u00a2\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u0004H\u0002J=\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\b\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020,H\u0002\u00a2\u0006\u0002\u0010:J\u0016\u0010;\u001a\u0002032\u0006\u0010<\u001a\u00020=2\u0006\u0010\u001d\u001a\u00020\u001eJ<\u0010>\u001a\u0002032\u0006\u0010<\u001a\u00020=2\u0006\u0010?\u001a\u00020)2\u0006\u0010+\u001a\u00020,2\u0006\u0010*\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u00042\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040.J\u0016\u0010A\u001a\u0002032\u0006\u0010<\u001a\u00020=2\u0006\u0010\u001d\u001a\u00020\u001eJD\u0010B\u001a\u0002032\u0006\u0010<\u001a\u00020=2\u0006\u0010?\u001a\u00020)2\u0006\u0010+\u001a\u00020,2\u0006\u0010*\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040.J\u0016\u0010D\u001a\u00020\u00042\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040.H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00040\u00040\u0013X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u001e\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00040\u00040\u0013X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/app/basics/net/interceptor/logging/Printer$Companion;", "", "()V", "BODY_TAG", "", "CENTER_LINE", "CORNER_BOTTOM", "CORNER_UP", "DEFAULT_LINE", "DOUBLE_SEPARATOR", "END_LINE", "HEADERS_TAG", "JSON_INDENT", "", "LINE_SEPARATOR", "kotlin.jvm.PlatformType", "METHOD_TAG", "N", "OMITTED_REQUEST", "", "[Ljava/lang/String;", "OMITTED_RESPONSE", "RECEIVED_TAG", "REQUEST_UP_LINE", "RESPONSE_UP_LINE", "STATUS_CODE_TAG", "T", "URL_TAG", "bodyToString", "request", "Lokhttp3/Request;", "dotHeaders", "header", "getJsonString", "msg", "getRequest", "level", "Lcom/app/basics/net/interceptor/logging/Level;", "(Lokhttp3/Request;Lcom/app/basics/net/interceptor/logging/Level;)[Ljava/lang/String;", "getResponse", "tookMs", "", "code", "isSuccessful", "", "segments", "", "(Ljava/lang/String;JIZLcom/app/basics/net/interceptor/logging/Level;Ljava/util/List;)[Ljava/lang/String;", "isEmpty", "line", "logLines", "", "type", "tag", "lines", "logger", "Lcom/app/basics/net/interceptor/logging/Logger;", "withLineSize", "(ILjava/lang/String;[Ljava/lang/String;Lcom/app/basics/net/interceptor/logging/Logger;Z)V", "printFileRequest", "builder", "Lcom/app/basics/net/interceptor/logging/LoggingInterceptor$Builder;", "printFileResponse", "chainMs", "headers", "printJsonRequest", "printJsonResponse", "bodyString", "slashSegments", "basics_debug"})
    public static final class Companion {
        
        private final boolean isEmpty(java.lang.String line) {
            return false;
        }
        
        public final void printJsonRequest(@org.jetbrains.annotations.NotNull()
        com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder builder, @org.jetbrains.annotations.NotNull()
        okhttp3.Request request) {
        }
        
        public final void printJsonResponse(@org.jetbrains.annotations.NotNull()
        com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder builder, long chainMs, boolean isSuccessful, int code, @org.jetbrains.annotations.NotNull()
        java.lang.String headers, @org.jetbrains.annotations.NotNull()
        java.lang.String bodyString, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> segments) {
        }
        
        public final void printFileRequest(@org.jetbrains.annotations.NotNull()
        com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder builder, @org.jetbrains.annotations.NotNull()
        okhttp3.Request request) {
        }
        
        public final void printFileResponse(@org.jetbrains.annotations.NotNull()
        com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder builder, long chainMs, boolean isSuccessful, int code, @org.jetbrains.annotations.NotNull()
        java.lang.String headers, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> segments) {
        }
        
        private final java.lang.String[] getRequest(okhttp3.Request request, com.app.basics.net.interceptor.logging.Level level) {
            return null;
        }
        
        private final java.lang.String[] getResponse(java.lang.String header, long tookMs, int code, boolean isSuccessful, com.app.basics.net.interceptor.logging.Level level, java.util.List<java.lang.String> segments) {
            return null;
        }
        
        private final java.lang.String slashSegments(java.util.List<java.lang.String> segments) {
            return null;
        }
        
        private final java.lang.String dotHeaders(java.lang.String header) {
            return null;
        }
        
        private final void logLines(int type, java.lang.String tag, java.lang.String[] lines, com.app.basics.net.interceptor.logging.Logger logger, boolean withLineSize) {
        }
        
        private final java.lang.String bodyToString(okhttp3.Request request) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getJsonString(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}