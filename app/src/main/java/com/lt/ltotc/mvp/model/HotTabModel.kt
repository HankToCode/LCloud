package com.lt.ltotc.mvp.model

import com.lt.ltotc.mvp.model.bean.TabInfoBean
import com.lt.basics.scheduler.SchedulerUtils
import com.lt.ltotc.net.RetrofitManager
import io.reactivex.Observable

/**
 * Created by HankGreen on 2017/11/30.
 * desc: 热门 Model
 */
class HotTabModel {

    /**
     * 获取 TabInfo
     */
    fun getTabInfo(): Observable<TabInfoBean> {

        return RetrofitManager.service.getRankList()
                .compose(SchedulerUtils.ioToMain())
    }

}
