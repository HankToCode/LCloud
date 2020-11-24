package com.app.basics.glide;

import java.lang.System;

/**
 * Created by HankGreen on 2017/12/1.
 * desc:
 */
@com.bumptech.glide.annotation.GlideModule()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/app/basics/glide/CustomAppGlideModule;", "Lcom/bumptech/glide/module/AppGlideModule;", "()V", "applyOptions", "", "context", "Landroid/content/Context;", "builder", "Lcom/bumptech/glide/GlideBuilder;", "isManifestParsingEnabled", "", "registerComponents", "glide", "Lcom/bumptech/glide/Glide;", "registry", "Lcom/bumptech/glide/Registry;", "basics_debug"})
public final class CustomAppGlideModule extends com.bumptech.glide.module.AppGlideModule {
    
    /**
     * 通过GlideBuilder设置默认的结构(Engine,BitmapPool ,ArrayPool,MemoryCache等等).
     *
     * @param context
     * @param builder
     */
    @java.lang.Override()
    public void applyOptions(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.GlideBuilder builder) {
    }
    
    /**
     * 清单解析的开启
     *
     *
     * 这里不开启，避免添加相同的modules两次
     *
     * @return
     */
    @java.lang.Override()
    public boolean isManifestParsingEnabled() {
        return false;
    }
    
    /**
     * 为App注册一个自定义的String类型的BaseGlideUrlLoader
     * @param context
     * @param glide
     * @param registry
     */
    @java.lang.Override()
    public void registerComponents(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.Glide glide, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.Registry registry) {
    }
    
    public CustomAppGlideModule() {
        super();
    }
}