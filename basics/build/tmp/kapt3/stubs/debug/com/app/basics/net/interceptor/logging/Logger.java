package com.app.basics.net.interceptor.logging;

import java.lang.System;

/**
 * @author ihsan on 11/07/2017.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/app/basics/net/interceptor/logging/Logger;", "", "log", "", "level", "", "tag", "", "msg", "Companion", "basics_debug"})
public abstract interface Logger {
    public static final com.app.basics.net.interceptor.logging.Logger.Companion Companion = null;
    
    public abstract void log(int level, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.String msg);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/app/basics/net/interceptor/logging/Logger$Companion;", "", "()V", "DEFAULT", "Lcom/app/basics/net/interceptor/logging/Logger;", "getDEFAULT", "()Lcom/app/basics/net/interceptor/logging/Logger;", "basics_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final com.app.basics.net.interceptor.logging.Logger DEFAULT = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.basics.net.interceptor.logging.Logger getDEFAULT() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}