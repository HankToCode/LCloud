package com.app.basics.utils;

import java.lang.System;

/**
 * Created by HankGreen on 2017/12/11.
 * desc:kotlin委托属性+SharedPreference实例(记录视频观看记录的）
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/app/basics/utils/WatchHistoryUtil;", "", "()V", "Companion", "basics_debug"})
public final class WatchHistoryUtil {
    
    /**
     * 保存在手机里面的文件名
     */
    private static final java.lang.String FILE_NAME = "kotlin_mvp_file";
    public static final com.app.basics.utils.WatchHistoryUtil.Companion Companion = null;
    
    public WatchHistoryUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004J\u001b\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010\u0010J#\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0001H\u0086\u0002J+\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0001H\u0086\u0002J\u0018\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00142\u0006\u0010\u0007\u001a\u00020\bJ \u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00142\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ \u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004J\u001e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0001J&\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0001J(\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004J\u001e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004J\u001b\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u001b\u001a\u0002H\u000eH\u0002\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/app/basics/utils/WatchHistoryUtil$Companion;", "", "()V", "FILE_NAME", "", "clear", "", "context", "Landroid/content/Context;", "fileName", "contains", "", "key", "deSerialization", "A", "str", "(Ljava/lang/String;)Ljava/lang/Object;", "get", "defaultObject", "getAll", "", "getObject", "put", "object", "putObject", "remove", "serialize", "obj", "(Ljava/lang/Object;)Ljava/lang/String;", "SharedPreferencesCompat", "basics_debug"})
    public static final class Companion {
        
        /**
         * 保存数据的方法，我们需要拿到保存数据的具体类型，然后根据类型调用不同的保存方法
         *
         * @param context
         * @param key
         * @param object
         */
        public final void put(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.Object object) {
        }
        
        /**
         * 得到保存数据的方法，我们根据默认值得到保存的数据的具体类型，然后调用相对于的方法获取值
         *
         * @param context
         * @param key
         * @param defaultObject
         * @return
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object get(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.Object defaultObject) {
            return null;
        }
        
        /**
         * 移除某个key值已经对应的值
         *
         * @param context
         * @param key
         */
        public final void remove(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        /**
         * 清除所有数据
         *
         * @param context
         */
        public final void clear(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        /**
         * 查询某个key是否已经存在
         *
         * @param context
         * @param key
         * @return
         */
        public final boolean contains(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
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
        public final java.util.Map<java.lang.String, ?> getAll(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * 保存数据的方法，我们需要拿到保存数据的具体类型，然后根据类型调用不同的保存方法
         *
         * @param context
         * @param key
         * @param object
         */
        public final void put(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.Object object) {
        }
        
        /**
         * 得到保存数据的方法，我们根据默认值得到保存的数据的具体类型，然后调用相对于的方法获取值
         *
         * @param context
         * @param key
         * @param defaultObject
         * @return
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object get(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.Object defaultObject) {
            return null;
        }
        
        /**
         * 移除某个key值已经对应的值
         *
         * @param context
         * @param key
         */
        public final void remove(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        /**
         * 清除所有数据
         *
         * @param context
         */
        public final void clear(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        /**
         * 查询某个key是否已经存在
         *
         * @param context
         * @param key
         * @return
         */
        public final boolean contains(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
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
        public final java.util.Map<java.lang.String, ?> getAll(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final boolean putObject(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.Object object, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
            return false;
        }
        
        /**
         * 得到保存数据的方法，我们根据默认值得到保存的数据的具体类型，然后调用相对于的方法获取值
         *
         * @param context
         * @param key
         * @return
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getObject(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
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
        
        private Companion() {
            super();
        }
        
        /**
         * 创建一个解决SharedPreferencesCompat.apply方法的一个兼容类
         *
         * @author zhy
         */
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/app/basics/utils/WatchHistoryUtil$Companion$SharedPreferencesCompat;", "", "()V", "sApplyMethod", "Ljava/lang/reflect/Method;", "apply", "", "editor", "Landroid/content/SharedPreferences$Editor;", "findApplyMethod", "basics_debug"})
        static final class SharedPreferencesCompat {
            private static final java.lang.reflect.Method sApplyMethod = null;
            public static final com.app.basics.utils.WatchHistoryUtil.Companion.SharedPreferencesCompat INSTANCE = null;
            
            /**
             * 反射查找apply的方法
             *
             * @return
             */
            private final java.lang.reflect.Method findApplyMethod() {
                return null;
            }
            
            /**
             * 如果找到则使用apply执行，否则使用commit
             *
             * @param editor
             */
            public final void apply(@org.jetbrains.annotations.NotNull()
            android.content.SharedPreferences.Editor editor) {
            }
            
            private SharedPreferencesCompat() {
                super();
            }
        }
    }
}