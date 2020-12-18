package com.app.cloud.api

import android.text.TextUtils
import com.app.basics.BuildConfig
import com.app.cloud.ex.toJsonString
import com.blankj.utilcode.util.SPUtils
import com.google.gson.Gson
import java.io.Serializable

/**
 * URL集合
 * Created by HankGreen on 2017/11/16.
 */
object UrlConstant{
    const val HEADER_JSON_TYPE = "Content-Type: application/json;charset=UTF-8"
    const val HEADER_JSON_ACCEPT = "Accept: application/json"

    var CURRENT_DOMAIN = getCurrentHost()
    private var HTTP_HOST = CURRENT_DOMAIN.host

    private fun getCurrentHost(): Domain {
        return if (!BuildConfig.PROJECT_DEBUG) {
            //TODO 上线必改
//            Domain("生产服", "http://test.otc.liantaoapp.com", "3d41424a0f6b481ba033f236a895d665")
            Domain("生产服", "http://assist.dev.liantao.top:8095", "3d41424a0f6b481ba033f236a895d665")
        } else {
            val domain: String = SPUtils.getInstance().getString("domain")
            if (!TextUtils.isEmpty(domain)) {
                Gson().fromJson(domain, Domain::class.java)
            } else {
                //TODO 上线必改
//                Domain("生产服", "http://test.otc.liantaoapp.com", "3d41424a0f6b481ba033f236a895d665")
                Domain("生产服", "http://assist.dev.liantao.top:8095", "3d41424a0f6b481ba033f236a895d665")
            }
        }
    }

    fun changeCurrentHost(domain: Domain) {
        if (!BuildConfig.PROJECT_DEBUG) {
        } else {
            CURRENT_DOMAIN = domain
            HTTP_HOST = CURRENT_DOMAIN.host
            SPUtils.getInstance().put("domain", domain.toJsonString())
        }
    }


    class Domain(val name: String, val host: String, val satl: String) : Serializable {

        override fun toString(): String {
            return "$name $host"
        }

        override fun equals(o: Any?): Boolean {
            if (this === o) {
                return true
            }
            if (o == null || javaClass != o.javaClass) {
                return false
            }
            val domain = o as Domain
            if (name != domain.name) {
                return false
            }
            return host == domain.host
        }

        /**
         * 复写hashCode,31 * 性能优化更好
         */
        override fun hashCode(): Int {
            var result = name.hashCode() ?: 0
            result = 31 * result + (host.hashCode() ?: 0)
            return result
        }

    }


}