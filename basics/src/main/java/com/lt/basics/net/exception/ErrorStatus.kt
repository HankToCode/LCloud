package com.lt.basics.net.exception

/**
 * Created by HankGreen on 2017/12/5.
 * desc:
 */
object ErrorStatus {
    /**
     * 响应成功
     */
    const val SUCCESS = 0

    /**
     * 未知错误
     */
    const val UNKNOWN_ERROR = 1002

    /**
     * 服务器内部错误
     */
    const val SERVER_ERROR = 1003

    /**
     * 网络连接超时
     */
    const val NETWORK_ERROR = 1004

    /**
     * API解析异常（或者第三方数据结构更改）等其他异常
     */
    const val API_ERROR = 1005

}