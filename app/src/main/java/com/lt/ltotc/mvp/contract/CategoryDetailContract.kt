package com.lt.ltotc.mvp.contract

import com.lt.ltotc.base.IBaseView
import com.lt.ltotc.base.IPresenter
import com.lt.ltotc.mvp.model.bean.HomeBean

/**
 * Created by HankGreen on 2017/11/30.
 * desc: 分类详情契约类
 */
interface CategoryDetailContract {

    interface View:IBaseView{
        /**
         *  设置列表数据
         */
        fun setCateDetailList(itemList:ArrayList<HomeBean.Issue.Item>)

        fun showError(errorMsg:String)




    }

    interface Presenter:IPresenter<View>{

        fun getCategoryDetailList(id:Long)

        fun loadMoreData()
    }
}