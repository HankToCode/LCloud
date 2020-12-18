package com.app.cloud.api

import android.webkit.WebSettings
import com.app.basics.MyApplication
import com.app.cloud.BuildConfig
import kotlin.random.Random

public object HeaderConstant {

    //接口版本
    const val URL_VERSION = "1.0"

    //1,安卓 2,ios
    const val OS = 1

    //版本号
    const val URL_APP_VERSION = BuildConfig.VERSION_CODE
    //版本名
    const val URL_APP_VERSION_NAME = BuildConfig.VERSION_NAME


    /**
     * 获取七位随机数
     */
     fun getRandomCode(): String {

        var strRand = ""
        for (index in 1..7) {
            val random: Number = Random.nextInt(1, 10)
            strRand += random.toString()
        }
        return strRand
    }

    /**
     * 获取签名
     */
    fun getNonce(strRand: String, timestamp: String, salt: String): String {
        return strRand + timestamp + salt
    }

    /**
     * 获取UserAgent
     */
    fun getUserAgent(): String {
        var userAgent = ""
        userAgent =
                try {
                    WebSettings.getDefaultUserAgent(MyApplication.context)
                } catch (e: Exception) {
                    System.getProperty("http.agent")
                }
        val sb = StringBuffer()
        var i = 0
        val length = userAgent.length
        while (i < length) {
            val c = userAgent[i]
            if (c <= '\u001f' || c >= '\u007f') {
                sb.append(String.format("\\u%04x", c.toInt()))
            } else {
                sb.append(c)
            }
            i++
        }
        return sb.toString()
    }

}