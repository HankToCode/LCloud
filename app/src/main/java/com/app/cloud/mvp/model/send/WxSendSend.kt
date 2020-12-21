package com.app.cloud.mvp.model.send

/**
{
"deviceId":"设备id",
"target":"CHAT", 发送目的地：CHAT-微信好友或群聊；WECHAT_MOMENTS-微信朋友圈
"wxId":[
发送给哪些好友或群
],
"blackWxId":[
不发送给哪些好友或群
],
"content":"文本消息",
"imgPath":"图片消息-图片URL",
"videoPath":"视频消息-视频URL",
"videoThumbPath":"视频消息-视频封面图URL",
"voicePath":"语音消息-语音URL",
"voiceLength":"语音消息-语音时长",
"delayTime":0, 延迟多少秒
"sendTime":"Dec 1, 2020 2:14:03 PM", 定时发送时间
"sendTimeState":0 是否需要定时发送：0不需要定时发送；1需要定时发送
}
 */
data class WxSendSend(
    val blackWxId: List<String>,
    val content: String,
    val delayTime: Int,
    val deviceId: String,
    val imgPath: String,
    val sendTime: String,
    val sendTimeState: Int,
    val target: String,
    val videoPath: String,
    val videoThumbPath: String,
    val voiceLength: String,
    val voicePath: String,
    val wxId: List<String>
)