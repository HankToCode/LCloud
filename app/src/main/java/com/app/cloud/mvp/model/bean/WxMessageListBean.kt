package com.app.cloud.mvp.model.bean

import java.io.Serializable

/**
{
"id":0, 主键id
"userId":0, 用户id
"deviceId":"",设备id
"contentState":0,文本消息是否发送成功：0失败；1成功；2未发送
"imgState":0,图片消息是否发送成功：0失败；1成功；2未发送
"videoState":0,视频消息是否发送成功：0失败；1成功；2未发送
"voiceState":0,语音消息是否发送成功：0失败；1成功；2未发送
"target":"CHAT",消息目的地：1聊天或群聊；2朋友圈
"wxId":"",发送给哪个朋友/哪个群
"blackWxId":"",对谁不可见
"content":"",文本消息
"imgPath":"",图片消息路径
"videoPath":"",视频消息地址
"videoThumbPath":"",视频封面URL
"voicePath":"",语音消息文件路径
"voiceLength":"",语音消息的语音长度
"delayTime":0,消息间隔时长（单位秒）
"sendTime":"Dec 1, 2020 2:22:21 PM",定时任务执行时间
"createDate":"Dec 1, 2020 2:22:21 PM"创建时间
}
 */
data class WxMessageListBean(
    val blackWxId: String = "",
    val content: String = "",
    val contentState: Int = 0,
    val createDate: String = "",
    val delayTime: String = "",
    val deviceId: String = "",
    val id: String = "",
    val imgPath: String = "",
    val imgState: Int = 0,
    val sendTime: String = "",
    val target: String = "",
    val userId: String = "",
    val videoPath: String = "",
    val videoState: Int = 0,
    val videoThumbPath: String = "",
    val voiceLength: String = "",
    val voicePath: String = "",
    val voiceState: Int = 0,
    val wxId: String = "",
    val title: String = "后端这里没有给标题字段",
    var optMethod: Int = OPT_METHOD_ADD
) : Serializable {

    fun getContentStateName(): String {
        return when (contentState) {
            0 -> "失败"
            1 -> "成功"
            2 -> "未发送"
            else -> ""
        }
    }

    companion object {
        //添加
        const val OPT_METHOD_ADD = 0
        //查看
        const val OPT_METHOD_VIEW = 1
        //修改
        const val OPT_METHOD_EDIT = 2
    }

}