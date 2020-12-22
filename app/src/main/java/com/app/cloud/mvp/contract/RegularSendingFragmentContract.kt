package com.app.cloud.mvp.contract

import com.app.basics.base.IBaseView
import com.app.basics.base.IPresenter
import com.app.cloud.mvp.model.bean.WxMessageListBean

/**
 * Created by HankGreen on 2017/11/25.
 * desc:
 */
interface RegularSendingFragmentContract {

    interface View : IBaseView {

        fun responseWxMessageList(list: List<WxMessageListBean>)

    }

    interface Presenter : IPresenter<View> {


    }


}