package com.app.cloud.ui.common.activity

import android.content.Context
import android.content.Intent
import androidx.viewpager.widget.ViewPager
import com.app.basics.base.BaseActivity
import com.app.cloud.R
import com.app.cloud.ui.common.adapter.ImagePreViewAdapter
import kotlinx.android.synthetic.main.activity_preview_image.*

class ImageViewPreviewActivity : BaseActivity() {

    private val images by lazy { intent.getStringArrayListExtra(IMAGE_LIST) }
    private val position by lazy { intent.getIntExtra(IMAGE_POSITION, 0) }

    companion object {
        const val IMAGE_LIST = "image_list"
        const val IMAGE_POSITION = "imagePosition"

        fun startActivity(context: Context, list: ArrayList<String>, position: Int) {
            val intent = Intent(context, ImageViewPreviewActivity::class.java)
            intent.putStringArrayListExtra(IMAGE_LIST, list)
            intent.putExtra(IMAGE_POSITION, position)
            context.startActivity(intent)
        }
    }

    override fun layoutId(): Int = R.layout.activity_preview_image
    override fun initView() {
        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                mTvTitle.text = String.format("%d/%d", position + 1, images.size)
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })

        mTvTitle.text = String.format("%d/%d", position + 1, images.size)
        var mImagePreViewAdapter = ImagePreViewAdapter(this, images)
        mViewPager.adapter = mImagePreViewAdapter
        mViewPager.currentItem = position
        ivBack.setOnClickListener {
            finish()
        }

    }

    override fun start() {
    }
}