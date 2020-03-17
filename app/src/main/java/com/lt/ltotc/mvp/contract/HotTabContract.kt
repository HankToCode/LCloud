package com.lt.ltotc.mvp.contract

import com.lt.ltotc.base.IBaseView
import com.lt.ltotc.base.IPresenter
import com.lt.ltotc.mvp.model.bean.TabInfoBean

/**
 * Created by HankGreen on 2017/11/30.
 * desc: 契约类
 */
interface HotTabContract {

    interface View:IBaseView{
        /**
         * 设置 TabInfo
         */
        fun setTabInfo(tabInfoBean: TabInfoBean)

        fun showError(errorMsg:String,errorCode:Int)
    }


    interface Presenter:IPresenter<View>{
        /**
         * 获取 TabInfo
         */
        fun getTabInfo()
    }
}