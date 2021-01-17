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
) {
    companion object {
        fun getStateName(position: Int?): String {
            when (position) {
                0 -> {
                    return STATE_WAIT_SEND
                }
                1 -> {
                    return STATE_ALL
                }
                2 -> {
                    return STATE_EXCEPT_WAIT_SEND
                }
            }
            return ""
        }

        const val TARGET_CHAT = "CHAT" //微信好友或群聊；
        const val TARGET_WECHAT_MOMENTS = "WECHAT_MOMENTS"//微信朋友圈

        const val STATE_WAIT_SEND = "WAIT_SEND"//-待发送；
        const val STATE_EXCEPT_WAIT_SEND = "EXCEPT_WAIT_SEND"//除了待发送其他所有的状态；
        const val STATE_ALL = "ALL"//所有
    }
}