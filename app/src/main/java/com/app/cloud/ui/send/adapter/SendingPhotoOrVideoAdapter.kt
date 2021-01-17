package com.app.cloud.ui.send.adapter

import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.app.cloud.R
import com.app.cloud.ex.loadImage
import com.app.cloud.ex.setVisibleOrGone
import com.app.cloud.mvp.model.bean.SendingTabBean
import com.app.cloud.mvp.model.bean.WxMessageListBean
import com.app.cloud.mvp.model.bean.WxPhotoOrVideoBean
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.lcw.library.imagepicker.manager.ConfigManager

class SendingPhotoOrVideoAdapter(var tabPosition: Int) :
    BaseQuickAdapter<WxPhotoOrVideoBean, BaseViewHolder>(R.layout.item_sending_photo_video) {
    override fun convert(helper: BaseViewHolder?, item: WxPhotoOrVideoBean?) {
        helper?.apply {
            item?.apply {
                if (tabPosition == SendingTabBean.TAB_IMAGE) {
                    getView<View>(R.id.ivVideoPlay).setVisibleOrGone(false)

                    if (isAdd) {
                        getView<ImageView>(R.id.ivImage).setImageResource(R.mipmap.mass_bg_photo)
                        setText(R.id.tvDesc, "点击添加图片")

                    } else {
                        getView<ImageView>(R.id.ivImage).loadImage(imageUrl)
                        setText(R.id.tvDesc, "")
                    }

                } else {

                    if (isAdd) {
                        getView<View>(R.id.ivVideoPlay).setVisibleOrGone(false)
                        getView<ImageView>(R.id.ivImage).setImageResource(R.mipmap.mass_bg_photo)
                        setText(R.id.tvDesc, "点击添加视频")
                    } else {
                        getView<View>(R.id.ivVideoPlay).setVisibleOrGone(true)
                        ConfigManager.getInstance()
                            .imageLoader.loadImage(getView(R.id.ivImage), videoUrl)
                        setText(R.id.tvDesc, "")

                    }
                }

                addOnClickListener(R.id.ivImage)
                addOnClickListener(R.id.ivSelect)

            }
        }
    }

    fun refreshData(list: List<WxPhotoOrVideoBean>) {

        var mutableList = mutableListOf<WxPhotoOrVideoBean>()
        if (list.size < 9) {
            mutableList.addAll(list)
            val addBean = WxPhotoOrVideoBean()
            addBean.isAdd = true
            mutableList.add(addBean)
        } else {
            mutableList.addAll(list)
        }

        setNewData(mutableList)

    }
}