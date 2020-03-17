package com.lt.ltotc.mvp.model

import com.lt.ltotc.mvp.model.bean.HomeBean
import com.lt.ltotc.mvp.model.bean.TabInfoBean
import com.lt.ltotc.net.RetrofitManager
import com.lt.ltotc.rx.scheduler.SchedulerUtils
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
