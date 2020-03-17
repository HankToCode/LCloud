package com.lt.ltotc.mvp.model

import com.lt.ltotc.mvp.model.bean.HomeBean
import com.lt.ltotc.mvp.model.bean.TabInfoBean
import com.lt.ltotc.net.RetrofitManager
import com.lt.ltotc.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * Created by HankGreen on 2017/11/30.
 * desc: 关注Model
 */
class FollowModel {

    /**
     * 获取关注信息
     */
    fun requestFollowList(): Observable<HomeBean.Issue> {

        return RetrofitManager.service.getFollowInfo()
                .compose(SchedulerUtils.ioToMain())
    }

    /**
     * 加载更多
     */
    fun loadMoreData(url:String):Observable<HomeBean.Issue>{
        return RetrofitManager.service.getIssueData(url)
                .compose(SchedulerUtils.ioToMain())
    }


}
