package com.app.basics.utils

import android.content.Context
import android.graphics.Bitmap
import android.widget.ImageView
import com.app.basics.R
import com.app.basics.glide.GlideApp
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class ImageLoaderUtils {
    companion object {
        /**
         * 不设置圆角,使用默认颜色当错误图片信息和默认加载图
         */
        fun load(context: Context, path: String, imageView: ImageView) {
            load(context, path, imageView, R.color.color_e4, R.color.color_e4)
        }

        /**
         * 不设置圆角
         */
        fun load(context: Context, path: String, imageView: ImageView, defaultImage: Int, errorImage: Int) {
            val options = RequestOptions().error(errorImage).placeholder(defaultImage).diskCacheStrategy(
                DiskCacheStrategy.ALL)
            GlideApp.with(context)
                    .load(path)
                    .apply(options)
                    .into(imageView)
        }

        /**
         * 设置圆角
         */
        fun load(context: Context, path: String, imageView: ImageView, rounddingRadius: Int) {
            load(context, path, imageView, R.color.color_e4, R.color.color_e4, rounddingRadius)
        }

        /**
         * 设置圆角
         */
        fun load(
                context: Context,
                path: String,
                imageView: ImageView,
                defaultImage: Int,
                errorImage: Int,
                rounddingRadius: Int
        ) {
            var roundedCorners = RoundedCorners(ConvertUtil.dp2px(rounddingRadius.toFloat()))
            var options1 = RequestOptions.bitmapTransform(roundedCorners)
            var options =
                    RequestOptions().error(errorImage).placeholder(defaultImage).diskCacheStrategy(DiskCacheStrategy.ALL)
            GlideApp.with(context)
                    .load(path)
                    .apply(options)
                    .apply(options1)
                    .into(imageView)
        }


        /**
         * 加载Bitmap设置圆角
         */
        fun load(context: Context, bitmap: Bitmap, imageView: ImageView, rounddingRadius: Int) {
            load(context, bitmap, imageView, R.color.color_e4, R.color.color_e4, rounddingRadius)
        }

        /**
         * 设置圆角
         */
        fun load(context: Context, bitmap: Bitmap, imageView: ImageView, defaultImage: Int, errorImage: Int, rounddingRadius: Int) {
            var roundedCorners = RoundedCorners(ConvertUtil.dp2px(rounddingRadius.toFloat()))
            var options1 = RequestOptions.bitmapTransform(roundedCorners)
            var options = RequestOptions().error(errorImage).placeholder(defaultImage).diskCacheStrategy(DiskCacheStrategy.ALL)
            GlideApp.with(context)
                    .load(bitmap)
                    .apply(options)
                    .apply(options1)
                    .into(imageView)
        }
    }

}