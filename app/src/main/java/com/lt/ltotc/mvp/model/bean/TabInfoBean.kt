package com.lt.ltotc.mvp.model.bean

/**
 * Created by HankGreen on 2017/11/30.
 * desc: 热门的 tabInfo
 */

data class TabInfoBean(val tabInfo: TabInfo) {
    data class TabInfo(val tabList: ArrayList<Tab>)

    data class Tab(val id: Long, val name: String, val apiUrl: String)
}
