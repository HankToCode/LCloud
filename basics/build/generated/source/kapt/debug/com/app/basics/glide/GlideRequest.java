package com.app.basics.glide;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import java.io.File;
import java.lang.Class;
import java.lang.Cloneable;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.SafeVarargs;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.URL;

/**
 * Contains all public methods from {@link RequestBuilder<TranscodeType>}, all options from
 * {@link com.bumptech.glide.request.RequestOptions} and all generated options from
 * {@link com.bumptech.glide.annotation.GlideOption} in annotated methods in
 * {@link com.bumptech.glide.annotation.GlideExtension} annotated classes.
 *
 * <p>Generated code, do not modify.
 *
 * @see RequestBuilder<TranscodeType>
 * @see com.bumptech.glide.request.RequestOptions
 */
@SuppressWarnings({
    "unused",
    "deprecation"
})
public class GlideRequest<TranscodeType> extends RequestBuilder<TranscodeType> implements Cloneable {
  GlideRequest(@NonNull Class<TranscodeType> transcodeClass, @NonNull RequestBuilder<?> other) {
    super(transcodeClass, other);
  }

  GlideRequest(@NonNull Glide glide, @NonNull RequestManager requestManager,
      @NonNull Class<TranscodeType> transcodeClass, @NonNull Context context) {
    super(glide, requestManager ,transcodeClass, context);
  }

  @Override
  @CheckResult
  @NonNull
  protected GlideRequest<File> getDownloadOnlyRequest() {
    return new GlideRequest<>(File.class, this).apply(DOWNLOAD_ONLY_OPTIONS);
  }

  /**
   * @see GlideOptions#sizeMultiplier(float)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> sizeMultiplier(@FloatRange(from = 0.0, to = 1.0) float value) {
    return (GlideRequest<TranscodeType>) super.sizeMultiplier(value);
  }

  /**
   * @see GlideOptions#useUnlimitedSourceGeneratorsPool(boolean)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean flag) {
    return (GlideRequest<TranscodeType>) super.useUnlimitedSourceGeneratorsPool(flag);
  }

  /**
   * @see GlideOptions#useAnimationPool(boolean)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> useAnimationPool(boolean flag) {
    return (GlideRequest<TranscodeType>) super.useAnimationPool(flag);
  }

  /**
   * @see GlideOptions#onlyRetrieveFromCache(boolean)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean flag) {
    return (GlideRequest<TranscodeType>) super.onlyRetrieveFromCache(flag);
  }

  /**
   * @see GlideOptions#diskCacheStrategy(DiskCacheStrategy)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> diskCacheStrategy(@android.support.annotation.NonNull DiskCacheStrategy strategy) {
    return (GlideRequest<TranscodeType>) super.diskCacheStrategy(strategy);
  }

  /**
   * @see GlideOptions#priority(Priority)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> priority(@android.support.annotation.NonNull Priority priority) {
    return (GlideRequest<TranscodeType>) super.priority(priority);
  }

  /**
   * @see GlideOptions#placeholder(Drawable)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> placeholder(@Nullable Drawable drawable) {
    return (GlideRequest<TranscodeType>) super.placeholder(drawable);
  }

  /**
   * @see GlideOptions#placeholder(int)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> placeholder(@DrawableRes int id) {
    return (GlideRequest<TranscodeType>) super.placeholder(id);
  }

  /**
   * @see GlideOptions#fallback(Drawable)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> fallback(@Nullable Drawable drawable) {
    return (GlideRequest<TranscodeType>) super.fallback(drawable);
  }

  /**
   * @see GlideOptions#fallback(int)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> fallback(@DrawableRes int id) {
    return (GlideRequest<TranscodeType>) super.fallback(id);
  }

  /**
   * @see GlideOptions#error(Drawable)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> error(@Nullable Drawable drawable) {
    return (GlideRequest<TranscodeType>) super.error(drawable);
  }

  /**
   * @see GlideOptions#error(int)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> error(@DrawableRes int id) {
    return (GlideRequest<TranscodeType>) super.error(id);
  }

  /**
   * @see GlideOptions#theme(Resources.Theme)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> theme(@Nullable Resources.Theme theme) {
    return (GlideRequest<TranscodeType>) super.theme(theme);
  }

  /**
   * @see GlideOptions#skipMemoryCache(boolean)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> skipMemoryCache(boolean skip) {
    return (GlideRequest<TranscodeType>) super.skipMemoryCache(skip);
  }

  /**
   * @see GlideOptions#override(int, int)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> override(int width, int height) {
    return (GlideRequest<TranscodeType>) super.override(width, height);
  }

  /**
   * @see GlideOptions#override(int)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> override(int size) {
    return (GlideRequest<TranscodeType>) super.override(size);
  }

  /**
   * @see GlideOptions#signature(Key)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> signature(@android.support.annotation.NonNull Key key) {
    return (GlideRequest<TranscodeType>) super.signature(key);
  }

  /**
   * @see GlideOptions#set(Option<Y>, Y)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public <Y> GlideRequest<TranscodeType> set(@android.support.annotation.NonNull Option<Y> option,
      @android.support.annotation.NonNull Y y) {
    return (GlideRequest<TranscodeType>) super.set(option, y);
  }

  /**
   * @see GlideOptions#decode(Class<?>)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> decode(@android.support.annotation.NonNull Class<?> clazz) {
    return (GlideRequest<TranscodeType>) super.decode(clazz);
  }

  /**
   * @see GlideOptions#encodeFormat(Bitmap.CompressFormat)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> encodeFormat(@android.support.annotation.NonNull Bitmap.CompressFormat format) {
    return (GlideRequest<TranscodeType>) super.encodeFormat(format);
  }

  /**
   * @see GlideOptions#encodeQuality(int)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> encodeQuality(@IntRange(from = 0, to = 100) int value) {
    return (GlideRequest<TranscodeType>) super.encodeQuality(value);
  }

  /**
   * @see GlideOptions#frame(long)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> frame(@IntRange(from = 0) long value) {
    return (GlideRequest<TranscodeType>) super.frame(value);
  }

  /**
   * @see GlideOptions#format(DecodeFormat)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> format(@android.support.annotation.NonNull DecodeFormat format) {
    return (GlideRequest<TranscodeType>) super.format(format);
  }

  /**
   * @see GlideOptions#disallowHardwareConfig()
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> disallowHardwareConfig() {
    return (GlideRequest<TranscodeType>) super.disallowHardwareConfig();
  }

  /**
   * @see GlideOptions#downsample(DownsampleStrategy)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> downsample(@android.support.annotation.NonNull DownsampleStrategy strategy) {
    return (GlideRequest<TranscodeType>) super.downsample(strategy);
  }

  /**
   * @see GlideOptions#timeout(int)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> timeout(@IntRange(from = 0) int value) {
    return (GlideRequest<TranscodeType>) super.timeout(value);
  }

  /**
   * @see GlideOptions#optionalCenterCrop()
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> optionalCenterCrop() {
    return (GlideRequest<TranscodeType>) super.optionalCenterCrop();
  }

  /**
   * @see GlideOptions#centerCrop()
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> centerCrop() {
    return (GlideRequest<TranscodeType>) super.centerCrop();
  }

  /**
   * @see GlideOptions#optionalFitCenter()
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> optionalFitCenter() {
    return (GlideRequest<TranscodeType>) super.optionalFitCenter();
  }

  /**
   * @see GlideOptions#fitCenter()
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> fitCenter() {
    return (GlideRequest<TranscodeType>) super.fitCenter();
  }

  /**
   * @see GlideOptions#optionalCenterInside()
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> optionalCenterInside() {
    return (GlideRequest<TranscodeType>) super.optionalCenterInside();
  }

  /**
   * @see GlideOptions#centerInside()
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> centerInside() {
    return (GlideRequest<TranscodeType>) super.centerInside();
  }

  /**
   * @see GlideOptions#optionalCircleCrop()
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> optionalCircleCrop() {
    return (GlideRequest<TranscodeType>) super.optionalCircleCrop();
  }

  /**
   * @see GlideOptions#circleCrop()
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> circleCrop() {
    return (GlideRequest<TranscodeType>) super.circleCrop();
  }

  /**
   * @see GlideOptions#transform(Transformation<Bitmap>)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> transform(@android.support.annotation.NonNull Transformation<Bitmap> transformation) {
    return (GlideRequest<TranscodeType>) super.transform(transformation);
  }

  /**
   * @see GlideOptions#transform(Transformation<Bitmap>[])
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  @SuppressWarnings({
      "unchecked",
      "varargs"
  })
  public GlideRequest<TranscodeType> transform(@android.support.annotation.NonNull Transformation<Bitmap>... transformations) {
    return (GlideRequest<TranscodeType>) super.transform(transformations);
  }

  /**
   * @see GlideOptions#transforms(Transformation<Bitmap>[])
   */
  @Deprecated
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  @SuppressWarnings({
      "unchecked",
      "varargs"
  })
  public GlideRequest<TranscodeType> transforms(@android.support.annotation.NonNull Transformation<Bitmap>... transformations) {
    return (GlideRequest<TranscodeType>) super.transforms(transformations);
  }

  /**
   * @see GlideOptions#optionalTransform(Transformation<Bitmap>)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> optionalTransform(@android.support.annotation.NonNull Transformation<Bitmap> transformation) {
    return (GlideRequest<TranscodeType>) super.optionalTransform(transformation);
  }

  /**
   * @see GlideOptions#optionalTransform(Class<Y>, Transformation<Y>)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public <Y> GlideRequest<TranscodeType> optionalTransform(@android.support.annotation.NonNull Class<Y> clazz,
      @android.support.annotation.NonNull Transformation<Y> transformation) {
    return (GlideRequest<TranscodeType>) super.optionalTransform(clazz, transformation);
  }

  /**
   * @see GlideOptions#transform(Class<Y>, Transformation<Y>)
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public <Y> GlideRequest<TranscodeType> transform(@android.support.annotation.NonNull Class<Y> clazz,
      @android.support.annotation.NonNull Transformation<Y> transformation) {
    return (GlideRequest<TranscodeType>) super.transform(clazz, transformation);
  }

  /**
   * @see GlideOptions#dontTransform()
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> dontTransform() {
    return (GlideRequest<TranscodeType>) super.dontTransform();
  }

  /**
   * @see GlideOptions#dontAnimate()
   */
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> dontAnimate() {
    return (GlideRequest<TranscodeType>) super.dontAnimate();
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> apply(@android.support.annotation.NonNull BaseRequestOptions<?> options) {
    return (GlideRequest<TranscodeType>) super.apply(options);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> transition(@android.support.annotation.NonNull TransitionOptions<?, ? super TranscodeType> options) {
    return (GlideRequest<TranscodeType>) super.transition(options);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> listener(@Nullable RequestListener<TranscodeType> listener) {
    return (GlideRequest<TranscodeType>) super.listener(listener);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> addListener(@Nullable RequestListener<TranscodeType> listener) {
    return (GlideRequest<TranscodeType>) super.addListener(listener);
  }

  @Override
  @android.support.annotation.NonNull
  public GlideRequest<TranscodeType> error(@Nullable RequestBuilder<TranscodeType> builder) {
    return (GlideRequest<TranscodeType>) super.error(builder);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType> builder) {
    return (GlideRequest<TranscodeType>) super.thumbnail(builder);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  @SafeVarargs
  @SuppressWarnings("varargs")
  public final GlideRequest<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType>... builders) {
    return (GlideRequest<TranscodeType>) super.thumbnail(builders);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> thumbnail(float sizeMultiplier) {
    return (GlideRequest<TranscodeType>) super.thumbnail(sizeMultiplier);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable Object o) {
    return (GlideRequest<TranscodeType>) super.load(o);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable Bitmap bitmap) {
    return (GlideRequest<TranscodeType>) super.load(bitmap);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable Drawable drawable) {
    return (GlideRequest<TranscodeType>) super.load(drawable);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable String string) {
    return (GlideRequest<TranscodeType>) super.load(string);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable Uri uri) {
    return (GlideRequest<TranscodeType>) super.load(uri);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable File file) {
    return (GlideRequest<TranscodeType>) super.load(file);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@RawRes @DrawableRes @Nullable Integer id) {
    return (GlideRequest<TranscodeType>) super.load(id);
  }

  @Override
  @Deprecated
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable URL url) {
    return (GlideRequest<TranscodeType>) super.load(url);
  }

  @Override
  @android.support.annotation.NonNull
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable byte[] bytes) {
    return (GlideRequest<TranscodeType>) super.load(bytes);
  }

  @Override
  @android.support.annotation.CheckResult
  public GlideRequest<TranscodeType> clone() {
    return (GlideRequest<TranscodeType>) super.clone();
  }
}
