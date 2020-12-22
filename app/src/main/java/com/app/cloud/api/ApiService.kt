package com.app.cloud.api

import com.app.basics.base.BaseBean
import com.app.cloud.mvp.model.bean.WxMailListBean
import com.app.cloud.mvp.model.bean.WxMessageListBean
import com.app.cloud.mvp.model.bean.WxQueryUserInfoBean
import com.app.cloud.mvp.model.bean.WxRobotListBean
import com.app.cloud.mvp.model.send.*
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

/**
 * Created by HankGreen on 2017/11/16.
 * Api 接口
 * 以下为sample
 */
interface ApiService {


    /**
     * 用户注册
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.LOGIN)
    fun login(@Body send: LoginSend): Observable<BaseBean<String>>

    /**
     * 微信·创建设备
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.WX_CREATE_DEVICE)
    fun wxCreateDevice(): Observable<BaseBean<String>>


    /**
     * 微信·获得登录二维码
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.WX_QRCODE)
    fun wxQrCode(@Body send: WxQrCodeSend): Observable<BaseBean<String>>

    /**
     * 微信·退出微信的登录
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.WX_LOGOUT)
    fun wxLogout(@Body send: WxLogoutSend): Observable<BaseBean<String?>>

    /**
     * 微信·确认是否登录
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.WX_CONFIRM_LOGIN)
    fun wxConfirmLogin(@Body send: WxConfirmLoginSend): Observable<BaseBean<String?>>

    /**
     * 微信·查询设备和微信号信息，包括在线状态
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.WX_QUERY_USER_INFO)
    fun wxQueryUserInfo(@Body send: WxQueryUserInfoSend): Observable<BaseBean<WxQueryUserInfoBean>>

    /**
     * 微信·刷新通讯录列表
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.WX_REFRESH_MAIL_LIST)
    fun wxRefreshMailList(@Body send: WxRefreshMailListSend): Observable<BaseBean<String?>>

    /**
     * 微信·通讯录列表
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.WX_MAIL_LIST)
    fun wxMailList(@Body send: WxMailListSend): Observable<BaseBean<List<WxMailListBean>>>

    /**
     * 微信·发送消息
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.WX_SEND)
    fun wxSend(@Body send: WxSendSend): Observable<BaseBean<String?>>

    /**
     * 微信·查询消息
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.WX_MESSAGE_LIST)
    fun wxMessageList(@Body send: WxMessageListSend): Observable<BaseBean<List<WxMessageListBean>>>

    /**
     * 设备列表
     */
    @Headers(UrlConstant.HEADER_JSON_TYPE, UrlConstant.HEADER_JSON_ACCEPT)
    @POST(Urls.WX_ROBOT_LIST)
    fun wxRobotList(): Observable<BaseBean<MutableList<WxRobotListBean>>>


}