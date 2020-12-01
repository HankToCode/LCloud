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

        const val BUNDLE_VIDEO_DATA = "video_data"
        const val BUNDLE_CATEGORY_DATA = "category_data"

        //腾讯 Bugly APP id
        const val BUGLY_APPID = "176aad0d9e"

        //TAG
        const val TAG_LOGGER = "logger"

        //sp 存储的文件名
        const val FILE_WATCH_HISTORY_NAME = "watch_history_file"   //观看记录

        const val FILE_COLLECTION_NAME = "collection_file"    //收藏视屏缓存的文件名


    }
}