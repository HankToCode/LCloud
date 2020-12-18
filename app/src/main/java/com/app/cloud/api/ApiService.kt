package com.app.cloud.api

import com.app.basics.base.BaseBean
import com.app.cloud.mvp.model.send.LoginSend
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

/**
 * Created by HankGreen on 2017/11/16.
 * Api 接口
 * 以下为sample
 */
interface ApiService{


    /**
     * 用户注册
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.LOGIN)
    fun login(@Body send: LoginSend): Observable<BaseBean<String>>
}