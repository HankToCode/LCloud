package com.app.cloud.mvp.model.send

/**
{
"page":0,
"size":0,
"target":"CHAT", 消息类型：CHAT-微信好友或群聊；WECHAT_MOMENTS-微信朋友圈
"state":"WAIT_SEND" 消息状态：WAIT_SEND-待发送；EXCEPT_WAIT_SEND-除了待发送其他所有的状态
}
 */
data class WxMessageListSend(
    val page: Int,
    val size: Int,
    val state: String,
    val target: String
)