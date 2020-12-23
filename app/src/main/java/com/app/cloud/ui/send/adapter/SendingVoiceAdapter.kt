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
import com.app.cloud.mvp.model.bean.WxVoiceBean
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.lcw.library.imagepicker.manager.ConfigManager

class SendingVoiceAdapter() :
    BaseQuickAdapter<WxVoiceBean, BaseViewHolder>(R.layout.item_sending_photo_video) {
    override fun convert(helper: BaseViewHolder?, item: WxVoiceBean?) {
        helper?.apply {
            item?.apply {


            }
        }
    }

    fun refreshData(list: List<WxVoiceBean>) {

        var mutableList = mutableListOf<WxVoiceBean>()
        if (list.size < 9) {
            mutableList.addAll(list)
            val addBean = WxVoiceBean()
            addBean.isAdd = true
            mutableList.add(addBean)
        } else {
            mutableList.addAll(list)
        }

        setNewData(mutableList)

    }
}