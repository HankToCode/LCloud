package com.app.cloud.mvp.contract

import com.app.basics.base.IBaseView
import com.app.basics.base.IPresenter
import com.app.cloud.mvp.model.bean.WxRobotListBean

/**
 * Created by HankGreen on 2017/11/25.
 * desc: 视频详情契约类
 */
interface WxManagerContract {

    interface View : IBaseView {
        fun responseWxRobotList(list: MutableList<WxRobotListBean>)

        fun finishRefresh()


    }

    interface Presenter : IPresenter<View> {

    }


}