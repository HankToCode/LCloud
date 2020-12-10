package com.app.basics

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
 * Created by HankGreen on 2017/11/27.
 * desc: 常量
 */
class Constants private constructor() {

    companion object {

        val BUNDLE_VIDEO_DATA = "video_data"
        val BUNDLE_CATEGORY_DATA = "category_data"

        //重复点击冷却时间
        const val THROTTLE_SECONDS = 1L

        //腾讯 Bugly APP id
        val BUGLY_APPID = "176aad0d9e"


        //sp 存储的文件名
        val FILE_WATCH_HISTORY_NAME = "watch_history_file"   //观看记录


    }
}