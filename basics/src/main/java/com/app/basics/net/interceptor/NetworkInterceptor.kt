package com.app.basics.net.interceptor

import com.app.basics.utils.LogUtils
import okhttp3.Interceptor
import okhttp3.Response
import okio.Buffer
import java.io.IOException
import java.net.URLDecoder

/**
 * @Author: 无人认领
 * @Date: 2020/4/15 20:35
 * desc:
 */
class NetworkInterceptor : Interceptor {
    val TAG = "NetworkInterceptor"
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response? {
        val oriRequest = chain.request()
        val requestUrl = URLDecoder.decode(oriRequest.url().toString(), "UTF-8")
        val requestMethod = URLDecoder.decode(oriRequest.method(), "UTF-8")
        val requestHeaders = URLDecoder.decode(oriRequest.headers().toString(), "UTF-8")
        var con = ""
        //打印url
        LogUtils.largeLogD(TAG, "requestUrl:$requestUrl")
        LogUtils.largeLogD(TAG, "RequestMethod:$requestMethod")
        LogUtils.largeLogD(TAG, "RequestHeaders:\n$requestHeaders")
        //打印requestBody
        if ("POST" == oriRequest.method()) {
            val buffer1 = Buffer()
            oriRequest.body()!!.writeTo(buffer1)
            con = buffer1.readUtf8()
            if (con.isNotEmpty() && con.length < 2 * 1024 * 1024) {
                LogUtils.largeLogD(TAG, "requestBody：$con")
            } else {
                LogUtils.largeLogD(TAG, "requestBody：length=" + con.length)
            }
        }
        //打印responseBody
        val response = chain.proceed(oriRequest)
        val responseBody = response.body()
        if (responseBody!!.contentLength() != 0L) {
            val bufferedSource = responseBody.source()
            bufferedSource.request(Long.MAX_VALUE)
            val buffer = bufferedSource.buffer()
            LogUtils.largeLogD(TAG, "requestUrl：$requestUrl")
            LogUtils.largeLogD(TAG, "requestBody：$con")
            if (responseBody.contentType()!!.type() == "image") {
                LogUtils.largeLogD(TAG, "responseBody：" + responseBody.contentType())
            } else {
                LogUtils.largeLogD(TAG, "responseBody：" + buffer.clone().readUtf8())
            }
        } else {
            LogUtils.largeLogD(TAG, "responseBody：contentLength=" + responseBody.contentLength())
        }
        return response
    }
}