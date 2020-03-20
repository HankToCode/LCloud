package com.lt.ltotc.mvp.presenter

import android.app.Activity
import com.lt.basics.MyApplication
import com.lt.basics.base.BasePresenter
import com.lt.basics.dataFormat
import com.lt.ltotc.mvp.contract.VideoDetailContract
import com.lt.ltotc.mvp.model.VideoDetailModel
import com.lt.ltotc.mvp.model.bean.HomeBean
import com.lt.basics.net.exception.ExceptionHandle
import com.lt.basics.showToast
import com.lt.basics.utils.DisplayManager
import com.lt.basics.utils.NetworkUtil
import com.lt.ltotc.mvp.contract.TradingCenterContract
import com.lt.ltotc.mvp.model.TradingCenterModel

/**
 * Created by HankGreen on 2017/11/25.
 * desc:
 */
class TradingCenterPresenter : BasePresenter<TradingCenterContract.View>(), TradingCenterContract.Presenter {

    private val tradingCenterModel: TradingCenterModel by lazy {

        TradingCenterModel()
    }




}