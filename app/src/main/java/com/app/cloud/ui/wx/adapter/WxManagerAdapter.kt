package com.app.cloud.ui.wx.adapter

import android.view.View
import android.widget.ImageView
import com.app.basics.utils.DateUtil
import com.app.cloud.R
import com.app.cloud.ex.clicksJustSeconds
import com.app.cloud.ex.loadImage
import com.app.cloud.ex.setVisibleOrGone
import com.app.cloud.mvp.model.bean.SendingTabBean
import com.app.cloud.mvp.model.bean.WxRobotListBean
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.trello.rxlifecycle3.components.support.RxAppCompatActivity

class WxManagerAdapter :
    BaseQuickAdapter<WxRobotListBean, BaseViewHolder>(R.layout.item_wx_manager) {
    override fun convert(helper: BaseViewHolder?, item: WxRobotListBean?) {
        helper?.apply {
            item?.let {

                if (item.isAddWeChatRobot) {
                    getView<View>(R.id.container1).setVisibleOrGone(false)
                    getView<View>(R.id.container2).setVisibleOrGone(true)

                } else {
                    getView<View>(R.id.container1).setVisibleOrGone(true)
                    getView<View>(R.id.container2).setVisibleOrGone(false)

                    getView<ImageView>(R.id.ivAvatar).loadImage(item.wechatUrl)
                    setText(R.id.tvWxName, "${item.wechatName} (${item.getOnlineStateName()})")

                    val timeInterval =
                        DateUtil.getTimeInterval(item.vipChargeDate, DateUtil.getCurDateStr())
                    val useDay = timeInterval / (3600000 * 24)//使用天数
                    setText(R.id.tvDesc, "剩余时长:${item.vipSurplus}天,已用：${useDay}天")
                }

                addOnClickListener(R.id.tvChange)

            }
        }
    }
}