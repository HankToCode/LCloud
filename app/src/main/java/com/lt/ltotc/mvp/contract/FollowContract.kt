package com.lt.ltotc.mvp.contract

import com.lt.ltotc.base.IBaseView
import com.lt.ltotc.base.IPresenter
import com.lt.ltotc.mvp.model.bean.HomeBean

/**
 * Created by HankGreen on 2017/11/30.
 * desc: 契约类
 */
interface FollowContract {

    interface View : IBaseView {
        /**
         * 设置关注信息数据
         */
        fun setFollowInfo(issue: HomeBean.Issue)

        fun showError(errorMsg: String, errorCode: Int)
    }


    interface Presenter : IPresenter<View> {
        /**
         * 获取List
         */
        fun requestFollowList()

        /**
         * 加载更多
         */
        fun loadMoreData()
    }
}