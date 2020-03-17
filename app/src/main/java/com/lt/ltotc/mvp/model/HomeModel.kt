package com.lt.ltotc.mvp.model

import com.lt.ltotc.mvp.model.bean.HomeBean
import com.lt.basics.scheduler.SchedulerUtils
import com.lt.ltotc.net.RetrofitManager
import io.reactivex.Observable

/**
 * Created by HankGreen on 2017/11/21.
 * desc: 首页精选 model
 */

class HomeModel{

    /**
     * 获取首页 Banner 数据
     */
    fun requestHomeData(num:Int):Observable<HomeBean>{
        return RetrofitManager.service.getFirstHomeData(num)
                .compose(SchedulerUtils.ioToMain())
    }

    /**
     * 加载更多
     */
    fun loadMoreData(url:String):Observable<HomeBean>{

        return RetrofitManager.service.getMoreHomeData(url)
                .compose(SchedulerUtils.ioToMain())
    }



}
