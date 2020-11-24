package com.app.basics.net.interceptor.logging;

import java.lang.System;

/**
 * @author ihsan on 09/02/2017.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/app/basics/net/interceptor/logging/LoggingInterceptor;", "Lokhttp3/Interceptor;", "builder", "Lcom/app/basics/net/interceptor/logging/LoggingInterceptor$Builder;", "(Lcom/app/basics/net/interceptor/logging/LoggingInterceptor$Builder;)V", "isDebug", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Builder", "basics_debug"})
public final class LoggingInterceptor implements okhttp3.Interceptor {
    private final boolean isDebug = false;
    private final com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder builder = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    private LoggingInterceptor(com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder builder) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u001e\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\u0010 \u001a\u0004\u0018\u00010\u0018J\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\'\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0018J\u0010\u0010)\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0018J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u0013@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001a@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006,"}, d2 = {"Lcom/app/basics/net/interceptor/logging/LoggingInterceptor$Builder;", "", "()V", "builder", "Lokhttp3/Headers$Builder;", "headers", "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", "isDebug", "", "()Z", "setDebug", "(Z)V", "<set-?>", "Lcom/app/basics/net/interceptor/logging/Level;", "level", "getLevel", "()Lcom/app/basics/net/interceptor/logging/Level;", "Lcom/app/basics/net/interceptor/logging/Logger;", "logger", "getLogger", "()Lcom/app/basics/net/interceptor/logging/Logger;", "requestTag", "", "responseTag", "", "type", "getType", "()I", "addHeader", "name", "value", "build", "Lcom/app/basics/net/interceptor/logging/LoggingInterceptor;", "getTag", "isRequest", "log", "loggable", "request", "tag", "response", "setLevel", "Companion", "basics_debug"})
    public static final class Builder {
        private boolean isDebug;
        private int type;
        private java.lang.String requestTag;
        private java.lang.String responseTag;
        @org.jetbrains.annotations.NotNull()
        private com.app.basics.net.interceptor.logging.Level level;
        private final okhttp3.Headers.Builder builder = null;
        @org.jetbrains.annotations.Nullable()
        private com.app.basics.net.interceptor.logging.Logger logger;
        private static java.lang.String TAG;
        public static final com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder.Companion Companion = null;
        
        public final boolean isDebug() {
            return false;
        }
        
        public final void setDebug(boolean p0) {
        }
        
        public final int getType() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.basics.net.interceptor.logging.Level getLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.basics.net.interceptor.logging.Logger getLogger() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final okhttp3.Headers getHeaders() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTag(boolean isRequest) {
            return null;
        }
        
        /**
         * @param name  Filed
         * @param value Value
         * @return Builder
         * Add a field with the specified value
         */
        @org.jetbrains.annotations.NotNull()
        public final com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder addHeader(@org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
            return null;
        }
        
        /**
         * @param level set log level
         * @return Builder
         * @see Level
         */
        @org.jetbrains.annotations.NotNull()
        public final com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder setLevel(@org.jetbrains.annotations.NotNull()
        com.app.basics.net.interceptor.logging.Level level) {
            return null;
        }
        
        /**
         * Set request and response each log tag
         *
         * @param tag general log tag
         * @return Builder
         */
        @org.jetbrains.annotations.NotNull()
        public final com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder tag(@org.jetbrains.annotations.NotNull()
        java.lang.String tag) {
            return null;
        }
        
        /**
         * Set request log tag
         *
         * @param tag request log tag
         * @return Builder
         */
        @org.jetbrains.annotations.NotNull()
        public final com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder request(@org.jetbrains.annotations.Nullable()
        java.lang.String tag) {
            return null;
        }
        
        /**
         * Set response log tag
         *
         * @param tag response log tag
         * @return Builder
         */
        @org.jetbrains.annotations.NotNull()
        public final com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder response(@org.jetbrains.annotations.Nullable()
        java.lang.String tag) {
            return null;
        }
        
        /**
         * @param isDebug set can sending log output
         * @return Builder
         */
        @org.jetbrains.annotations.NotNull()
        public final com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder loggable(boolean isDebug) {
            return null;
        }
        
        /**
         * @param type set sending log output type
         * @return Builder
         * @see Platform
         */
        @org.jetbrains.annotations.NotNull()
        public final com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder log(int type) {
            return null;
        }
        
        /**
         * @param logger manuel logging interface
         * @return Builder
         * @see Logger
         */
        @org.jetbrains.annotations.NotNull()
        public final com.app.basics.net.interceptor.logging.LoggingInterceptor.Builder logger(@org.jetbrains.annotations.Nullable()
        com.app.basics.net.interceptor.logging.Logger logger) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.basics.net.interceptor.logging.LoggingInterceptor build() {
            return null;
        }
        
        public Builder() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/app/basics/net/interceptor/logging/LoggingInterceptor$Builder$Companion;", "", "()V", "TAG", "", "basics_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}