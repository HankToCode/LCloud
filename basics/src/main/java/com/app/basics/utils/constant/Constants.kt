package com.app.basics.utils.constant

//  ┏┓　　　┏┓
//┏┛┻━━━┛┻┓
//┃　　　　　　　┃
//┃　　　━　　　┃
//┃　┳┛　┗┳　┃
//┃　　　　　　　┃
//┃　　　┻　　　┃
//┃　　　　　　　┃
//┗━┓　　　┏━┛
//    ┃　　　┃   神兽保佑
//    ┃　　　┃   代码无BUG！
//    ┃　　　┗━━━┓
//    ┃　　　　　　　┣┓
//    ┃　　　　　　　┏┛
//    ┗┓┓┏━┳┓┏┛
//      ┃┫┫　┃┫┫
//      ┗┻┛　┗┻┛
/**
 * Created by 无人认领 on 2020/3/27.
 * desc: 常量
 */
class Constants private constructor() {

    companion object {

        //---------------普通常量-------------------
        //腾讯 Bugly APP id
        const val BUGLY_APPID = ""

        //重复点击冷却时间
        const val THROTTLE_SECONDS = 1L

        //重复点击冷却时间3S
        const val THROTTLE_SECONDS_3S = 3L

        //fake_token
        const val FAKE_TOKEN = "fake_token"
        //device_id
        const val DEVICE_ID = "device_id"
        //倒计时时间
        const val MAX_COUNT_TIME = 60L
        //更新延迟时间
        const val SEARCH_DELAY = 1000L

        //人民币符号
        const val SYMBOL_RMB = "¥"
        //美元符号
        const val SYMBOL_DOLLAR = "$"

        const val SYMBOL_TOKEN = "LCNY"

        //60s
        const val AUTO_REFRESH_TIME60s = 1000 * 60

        //---------------普通常量-------------------


        //---------------sp 存储的文件名-------------------

        //用户信息
        const val SP_USER = "sp_user"

        //---------------sp 存储的文件名-------------------
        //首页置换大屏数据
        const val SP_TRADE_DATA = "sp_trade_data"

        //本地通知设置
        const val SP_LOCAL_NOTICE_SETTING = "sp_local_notice_setting"

        //本地oss信息
        const val SP_LOCAL_OSS_INFO = "sp_local_oss_info"

        //是否第一次打开使用
        const val SP_IS_FIRST_USE = "sp_is_first_use"
    }
}