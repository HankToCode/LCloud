package com.app.basics.utils;

import java.lang.System;

/**
 * Created by HankGreen on 2017/12/11.
 * desc:kotlin委托属性+SharedPreference实例
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\"B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u001b\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0012J\u001d\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0086\u0002\u00a2\u0006\u0002\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u0000H\u0003\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u001d\u001a\u00020\u0004\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u001e\u001a\u0002H\u000eH\u0002\u00a2\u0006\u0002\u0010\u001fJ,\u0010 \u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010!R\u0010\u0010\u0005\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006#"}, d2 = {"Lcom/app/basics/utils/Preference;", "T", "", "name", "", "default", "(Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getName", "()Ljava/lang/String;", "contains", "", "key", "deSerialization", "A", "str", "(Ljava/lang/String;)Ljava/lang/Object;", "getAll", "", "getSharedPreferences", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "putSharedPreferences", "", "value", "serialize", "obj", "(Ljava/lang/Object;)Ljava/lang/String;", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Companion", "basics_debug"})
public final class Preference<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private static final java.lang.String file_name = "kotlin_mvp_file";
    private static final kotlin.Lazy prefs$delegate = null;
    public static final com.app.basics.utils.Preference.Companion Companion = null;
    
    public final T getValue(@org.jetbrains.annotations.Nullable()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.Nullable()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property, T value) {
    }
    
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    private final void putSharedPreferences(java.lang.String name, T value) {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final T getSharedPreferences(java.lang.String name, T p1_772401952) {
        return null;
    }
    
    /**
     * 序列化对象
     *
     * @param person
     * *
     * @return
     * *
     * @throws IOException
     */
    private final <A extends java.lang.Object>java.lang.String serialize(A obj) {
        return null;
    }
    
    /**
     * 反序列化对象
     *
     * @param str
     * *
     * @return
     * *
     * @throws IOException
     * *
     * @throws ClassNotFoundException
     */
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final <A extends java.lang.Object>A deSerialization(java.lang.String str) {
        return null;
    }
    
    /**
     * 查询某个key是否已经存在
     *
     * @param key
     * @return
     */
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    /**
     * 返回所有的键值对
     *
     * @param context
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ?> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public Preference(@org.jetbrains.annotations.NotNull()
    java.lang.String name, T p1_772401952) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/app/basics/utils/Preference$Companion;", "", "()V", "file_name", "", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "clearPreference", "", "key", "basics_debug"})
    public static final class Companion {
        
        private final android.content.SharedPreferences getPrefs() {
            return null;
        }
        
        /**
         * 删除全部数据
         */
        public final void clearPreference() {
        }
        
        /**
         * 根据key删除存储数据
         */
        public final void clearPreference(@org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        private Companion() {
            super();
        }
    }
}