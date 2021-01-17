package com.app.cloud.mvp.model.bean

data class WxQueryUserInfoBean(
    val deviceId: String,
    val id: String,
    val onlineState: String,
    val totalMoney: String,
    val userId: String,
    val vipChargeDate: String,
    val vipSurplus: String,
    val wechatAccount: String,
    val wechatId: String,
    val wechatName: String,
    val wechatUrl: String
)