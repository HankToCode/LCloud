package com.app.cloud.mvp.model.send

/**
 * "type": "通讯录类型：1好友列表；2群聊列表",
 * "deviceId": "设备id"
 */
data class WxRefreshMailListSend(
    val deviceId: String,
    val type: String
)