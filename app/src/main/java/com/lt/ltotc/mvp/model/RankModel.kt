package com.lt.ltotc.mvp.model

import com.lt.ltotc.mvp.model.bean.HomeBean
import com.lt.ltotc.mvp.model.bean.TabInfoBean
import com.lt.ltotc.net.RetrofitManager
import com.lt.ltotc.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * Created by HankGreen on 2017/11/30.
 * desc: 排行榜 Model
 */
class RankModel {

    /**
     * 获取排行榜
     */
    fun requestRankList(apiUrl:String): Observable<HomeBean.Issue> {

        return RetrofitManager.service.getIssueData(apiUrl)
                .compose(SchedulerUtils.ioToMain())
    }

}
