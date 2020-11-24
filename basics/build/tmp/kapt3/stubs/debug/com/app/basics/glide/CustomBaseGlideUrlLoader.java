package com.app.basics.glide;

import java.lang.System;

/**
 * Created by HankGreen on 2017/12/1.
 * desc:
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B-\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\u0002\u0010\tJ(\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016\u00a8\u0006\u0016"}, d2 = {"Lcom/app/basics/glide/CustomBaseGlideUrlLoader;", "Lcom/bumptech/glide/load/model/stream/BaseGlideUrlLoader;", "", "concreteLoader", "Lcom/bumptech/glide/load/model/ModelLoader;", "Lcom/bumptech/glide/load/model/GlideUrl;", "Ljava/io/InputStream;", "modelCache", "Lcom/bumptech/glide/load/model/ModelCache;", "(Lcom/bumptech/glide/load/model/ModelLoader;Lcom/bumptech/glide/load/model/ModelCache;)V", "getUrl", "model", "width", "", "height", "options", "Lcom/bumptech/glide/load/Options;", "handles", "", "s", "Companion", "Factory", "basics_debug"})
public final class CustomBaseGlideUrlLoader extends com.bumptech.glide.load.model.stream.BaseGlideUrlLoader<java.lang.String> {
    private static final com.bumptech.glide.load.model.ModelCache<java.lang.String, com.bumptech.glide.load.model.GlideUrl> urlCache = null;
    
    /**
     * Url的匹配规则
     */
    private static final java.util.regex.Pattern PATTERN = null;
    public static final com.app.basics.glide.CustomBaseGlideUrlLoader.Companion Companion = null;
    
    /**
     * If the URL contains a special variable width indicator (eg "__w-200-400-800__")
     * we get the buckets from the URL (200, 400 and 800 in the example) and replace
     * the URL with the best bucket for the requested width (the bucket immediately
     * larger than the requested width).
     *
     * 控制加载的图片的大小
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String model, int width, int height, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.Options options) {
        return null;
    }
    
    @java.lang.Override()
    public boolean handles(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return false;
    }
    
    public CustomBaseGlideUrlLoader(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> concreteLoader, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.model.ModelCache<java.lang.String, com.bumptech.glide.load.model.GlideUrl> modelCache) {
        super(null);
    }
    
    /**
     * 工厂来构建CustomBaseGlideUrlLoader对象
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/app/basics/glide/CustomBaseGlideUrlLoader$Factory;", "Lcom/bumptech/glide/load/model/ModelLoaderFactory;", "", "Ljava/io/InputStream;", "()V", "build", "Lcom/bumptech/glide/load/model/ModelLoader;", "multiFactory", "Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;", "teardown", "", "basics_debug"})
    public static final class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.String, java.io.InputStream> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.bumptech.glide.load.model.ModelLoader<java.lang.String, java.io.InputStream> build(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.model.MultiModelLoaderFactory multiFactory) {
            return null;
        }
        
        @java.lang.Override()
        public void teardown() {
        }
        
        public Factory() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/app/basics/glide/CustomBaseGlideUrlLoader$Companion;", "", "()V", "PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "urlCache", "Lcom/bumptech/glide/load/model/ModelCache;", "", "Lcom/bumptech/glide/load/model/GlideUrl;", "basics_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}