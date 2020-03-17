package com.lt.ltotc.mvp.contract

import com.lt.basics.base.IBaseView
import com.lt.basics.base.IPresenter
import com.lt.ltotc.mvp.model.bean.CategoryBean

/**
 * Created by HankGreen on 2017/11/29.
 * desc: 分类 契约类
 */
interface CategoryContract {

    interface View : IBaseView {
        /**
         * 显示分类的信息
         */
        fun showCategory(categoryList: ArrayList<CategoryBean>)

        /**
         * 显示错误信息
         */
        fun showError(errorMsg:String,errorCode:Int)
    }

    interface Presenter: IPresenter<View> {
        /**
         * 获取分类的信息
         */
        fun getCategoryData()
    }
}