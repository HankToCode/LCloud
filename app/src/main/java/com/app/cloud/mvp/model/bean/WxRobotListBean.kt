package com.app.cloud.mvp.model.bean

/**
{
"id":0, 主键id
"userId":0, 用户id
"deviceId":"", 设备号
"onlineState":0, 在线状态：0不在线；1在线
"wechatId":"", 微信id
"wechatAccount":"", 微信号
"wechatName":"", 微信名
"wechatUrl":"", 微信头像
"totalMoney":0, 钱包
"vipChargeDate":"2020-12-19 00:00:00", VIP充值时间
"vipSurplus":0 VIP剩余天数
}
 */
data class WxRobotListBean(
    val deviceId: String? = null,
    val id: Int? = null,
    val onlineState: Int? = null,
    val totalMoney: Int? = null,
    val userId: Int? = null,
    val vipChargeDate: String? = null,
    val vipSurplus: Int? = null,
    val wechatAccount: String? = null,
    val wechatId: String? = null,
    val wechatName: String? = null,
    val wechatUrl: String? = null,
    var isAddWeChatRobot: Boolean = false
) {
    fun getOnlineStateName(): String {
        return if (onlineState == 0) {
            "离线"
        } else {
            "在线"
        }
    }
}