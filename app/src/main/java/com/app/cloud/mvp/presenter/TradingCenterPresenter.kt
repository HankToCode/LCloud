package com.app.cloud.mvp.presenter

import com.app.basics.base.BasePresenter
import com.app.cloud.mvp.contract.TradingCenterContract
import com.app.cloud.mvp.model.TradingCenterModel

/**
 * Created by HankGreen on 2017/11/25.
 * desc:
 */
class TradingCenterPresenter : BasePresenter<TradingCenterContract.View>(), TradingCenterContract.Presenter {

    private val tradingCenterModel: TradingCenterModel by lazy {
        TradingCenterModel()
    }




}