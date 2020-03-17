package com.lt.ltotc.mvp.model

import com.lt.ltotc.mvp.model.bean.HomeBean
import com.lt.ltotc.net.RetrofitManager
import com.lt.ltotc.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * Created by HankGreen on 2017/11/25.
 * desc:
 */
class VideoDetailModel {

    fun requestRelatedData(id:Long):Observable<HomeBean.Issue>{

        return RetrofitManager.service.getRelatedData(id)
                .compose(SchedulerUtils.ioToMain())
    }

}