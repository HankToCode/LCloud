package com.app.basics.glide

import android.R
import android.widget.ImageView
import com.app.basics.MyApplication
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import com.lcw.library.imagepicker.utils.ImageLoader

/**
 * @author HankGreen.
 * @Date 2020/12/23
 * @name
 * desc:图片加载器
 *
 */
class GlideLoader : ImageLoader {
    private val mOptions: RequestOptions = RequestOptions()
        .centerCrop()
        .format(DecodeFormat.PREFER_RGB_565)
        .placeholder(R.color.darker_gray)
        .error(R.color.darker_gray)

    private val mPreOptions: RequestOptions = RequestOptions()
        .skipMemoryCache(true)
        .error(R.color.darker_gray)

    override fun loadPreImage(imageView: ImageView, imagePath: String?) {
        //大图加载
        Glide.with(imageView.context).load(imagePath).apply(mPreOptions).into(imageView);
    }

    override fun loadImage(imageView: ImageView, imagePath: String?) {
        //小图加载
        Glide.with(imageView.context).load(imagePath).apply(mOptions).into(imageView);
    }

    override fun clearMemoryCache() {
        //清理缓存
        Glide.get(MyApplication.context).clearMemory();
    }
}