package com.lt.ltotc.mvp.contract

import com.lt.basics.base.IBaseView
import com.lt.basics.base.IPresenter
import com.lt.ltotc.mvp.model.bean.HomeBean

/**
 * Created by HankGreen on 2017/11/30.
 * desc: 契约类
 */
interface RankContract {

    interface View: IBaseView {
        /**
         * 设置排行榜的数据
         */
        fun setRankList(itemList: ArrayList<HomeBean.Issue.Item>)

        fun showError(errorMsg:String,errorCode:Int)
    }


    interface Presenter: IPresenter<View> {
        /**
         * 获取 TabInfo
         */
        fun requestRankList(apiUrl:String)
    }
}