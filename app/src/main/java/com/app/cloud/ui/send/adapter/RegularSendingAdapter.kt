package com.app.cloud.ui.send.adapter

import androidx.core.content.ContextCompat
import com.app.cloud.R
import com.app.cloud.mvp.model.bean.SendingTabBean
import com.app.cloud.mvp.model.bean.WxMessageListBean
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

class RegularSendingAdapter :
    BaseQuickAdapter<WxMessageListBean, BaseViewHolder>(R.layout.item_fragment_regular_sending) {
    override fun convert(helper: BaseViewHolder?, item: WxMessageListBean?) {
        helper?.apply {
            item?.let {
                setText(R.id.tvName, item.title)
                setText(R.id.tvStatus, "(${item.getContentStateName()})")

                setTextColor(
                    R.id.tvStatus,
                    if (item.contentState == 0) ContextCompat.getColor(
                        mContext,
                        R.color.colorFF4646
                    ) else ContextCompat.getColor(mContext, R.color.color666666)
                )

                setText(R.id.tvTime, "预计时间：${item.sendTime}")

                setText(R.id.tvButton1, if (item.contentState == 2) "修改" else "查看")
                setText(R.id.tvButton2, "删除")

            }
        }
    }
}