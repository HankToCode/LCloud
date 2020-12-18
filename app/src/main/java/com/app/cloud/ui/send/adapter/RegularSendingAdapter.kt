package com.app.cloud.ui.send.adapter

import com.app.cloud.R
import com.app.cloud.mvp.model.bean.SendingTabBean
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

class RegularSendingAdapter :
    BaseQuickAdapter<SendingTabBean, BaseViewHolder>(R.layout.item_fragment_regular_sending) {
    override fun convert(helper: BaseViewHolder?, item: SendingTabBean?) {
        helper?.apply {
            item?.let {




            }
        }
    }
}