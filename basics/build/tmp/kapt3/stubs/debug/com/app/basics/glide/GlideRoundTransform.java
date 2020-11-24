package com.app.basics.glide;

import java.lang.System;

/**
 * Created by HankGreen on 2017/11/29.
 * desc:
 * 1.永远不要把transform()传给你的原始resource或原始Bitmap给recycle()了，更不要放回BitmapPool，因为这些都自动完成了。值得注意的是，任何从BitmapPool取出的用于自定义图片变换的辅助Bitmap，如果不经过transform()方法返回，就必须主动放回BitmapPool或者调用recycle()回收。
 * 2.如果你从BitmapPool拿出多个Bitmap或不使用你从BitmapPool拿出的一个Bitmap，一定要返回extras给BitmapPool。
 * 3.如果你的图片处理没有替换原始resource(例如由于一张图片已经匹配了你想要的尺寸，你需要提前返回), transform()`方法就返回原始resource或原始Bitmap。
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002J*\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/app/basics/glide/GlideRoundTransform;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "dp", "", "(I)V", "radius", "", "roundCrop", "Landroid/graphics/Bitmap;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "source", "transform", "toTransform", "outWidth", "outHeight", "updateDiskCacheKey", "", "messageDigest", "Ljava/security/MessageDigest;", "basics_debug"})
public final class GlideRoundTransform extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private float radius;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected android.graphics.Bitmap transform(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool pool, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap toTransform, int outWidth, int outHeight) {
        return null;
    }
    
    @java.lang.Override()
    public void updateDiskCacheKey(@org.jetbrains.annotations.NotNull()
    java.security.MessageDigest messageDigest) {
    }
    
    private final android.graphics.Bitmap roundCrop(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool pool, android.graphics.Bitmap source) {
        return null;
    }
    
    public GlideRoundTransform(int dp) {
        super();
    }
    
    public GlideRoundTransform() {
        super();
    }
}