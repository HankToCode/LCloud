package com.app.cloud.ui.common.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.app.basics.utils.ImageLoaderUtils
import com.lcw.library.imagepicker.view.PinchImageView
import java.util.*

class ImagePreViewAdapter(var mContext: Context, var mMediaFileList: List<String>) : PagerAdapter() {

    var viewCache = LinkedList<PinchImageView>()
    override fun isViewFromObject(p0: View, p1: Any): Boolean {
        return p0 === p1
    }

    override fun getCount(): Int {
        return if (mMediaFileList == null) 0 else mMediaFileList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val imageView: PinchImageView
        if (viewCache.size > 0) {
            imageView = viewCache.remove()
            imageView.reset()
        } else {
            imageView = PinchImageView(mContext)
        }
        try {
            ImageLoaderUtils.load(mContext, mMediaFileList[position], imageView)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        container.addView(imageView)
        return imageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val imageView = `object` as PinchImageView
        container.removeView(imageView)
        viewCache.add(imageView)
    }
}