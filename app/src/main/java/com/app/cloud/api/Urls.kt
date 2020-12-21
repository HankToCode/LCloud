package com.app.cloud.api

/**
 * @author HankGreen.
 * @Date 2020/12/18
 * @name
 * desc:
 *
 */
object Urls {

    //用户模块
    //登录
    const val LOGIN = "/user/login"

    //微信·创建设备
    const val WX_CREATE_DEVICE = "/wx/base/create/device"

    //微信·获得登录二维码
    const val WX_QRCODE = "/wx/base/login/qrcode"

    //微信·退出微信的登录
    const val WX_LOGOUT = "/wx/base/logout/wx"

    //微信·确认是否登录
    const val WX_CONFIRM_LOGIN = "/wx/base/confirm/login"

    //微信·查询设备和微信号信息，包括在线状态
    const val WX_QUERY_USER_INFO = "/wx/base/query/user/info"

    //微信·刷新通讯录列表
    const val WX_REFRESH_MAIL_LIST = "/wx/base/refresh/mail/list"

    //微信·通讯录列表
    const val WX_MAIL_LIST = "/wx/base/mail/list"

    //微信·发送消息
    const val WX_SEND = "/wx/message/send"

    //微信·查询消息
    const val WX_MESSAGE_LIST = "/wx/message/message/list"

    //上传文件
    const val UPLOAD = "/upload"

    //设备列表
    const val WX_ROBOT_LIST = "/wx/base/robot/list"

}