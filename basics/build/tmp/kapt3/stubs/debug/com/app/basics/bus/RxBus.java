package com.app.basics.bus;

import java.lang.System;

/**
 * 只会把在订阅发生的时间点之后来自原始Observable的数据发射给观察者
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001J\u0006\u0010\u0012\u001a\u00020\u000fJ\u001f\u0010\u0013\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u000fJ\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\t0\u0016\"\u0004\b\u0000\u0010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\u0007J \u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\t0\u0016\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/app/basics/bus/RxBus;", "", "()V", "mBus", "Lio/reactivex/subjects/Subject;", "mStickyEventMap", "", "Ljava/lang/Class;", "getStickyEvent", "T", "eventType", "(Ljava/lang/Class;)Ljava/lang/Object;", "hasObservers", "", "post", "", "event", "postSticky", "removeAllStickyEvents", "removeStickyEvent", "reset", "toObservable", "Lio/reactivex/Observable;", "toObservableSticky", "Companion", "basics_debug"})
public final class RxBus {
    private final io.reactivex.subjects.Subject<java.lang.Object> mBus = null;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> mStickyEventMap = null;
    private static volatile com.app.basics.bus.RxBus mDefaultInstance;
    public static final com.app.basics.bus.RxBus.Companion Companion = null;
    
    /**
     * 发送事件
     */
    public final void post(@org.jetbrains.annotations.NotNull()
    java.lang.Object event) {
    }
    
    /**
     * 根据传递的 eventType 类型返回特定类型(eventType)的 被观察者
     */
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.Observable<T> toObservable(@org.jetbrains.annotations.Nullable()
    java.lang.Class<T> eventType) {
        return null;
    }
    
    /**
     * 判断是否有订阅者
     */
    public final boolean hasObservers() {
        return false;
    }
    
    public final void reset() {
    }
    
    /**
     * 发送一个新Sticky事件
     */
    public final void postSticky(@org.jetbrains.annotations.NotNull()
    java.lang.Object event) {
    }
    
    /**
     * 根据传递的 eventType 类型返回特定类型(eventType)的 被观察者
     */
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.Observable<T> toObservableSticky(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> eventType) {
        return null;
    }
    
    /**
     * 根据eventType获取Sticky事件
     */
    public final <T extends java.lang.Object>T getStickyEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> eventType) {
        return null;
    }
    
    /**
     * 移除指定eventType的Sticky事件
     */
    public final <T extends java.lang.Object>T removeStickyEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> eventType) {
        return null;
    }
    
    /**
     * 移除所有的Sticky事件
     */
    public final void removeAllStickyEvents() {
    }
    
    public RxBus() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final com.app.basics.bus.RxBus getDefault() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/app/basics/bus/RxBus$Companion;", "", "()V", "default", "Lcom/app/basics/bus/RxBus;", "default$annotations", "getDefault", "()Lcom/app/basics/bus/RxBus;", "mDefaultInstance", "basics_debug"})
    public static final class Companion {
        
        public static void default$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.basics.bus.RxBus getDefault() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}