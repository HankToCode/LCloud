package com.lt.ltotc.mvp.presenter

import com.lt.basics.base.BasePresenter
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