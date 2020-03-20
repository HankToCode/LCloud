package com.lt.basics.utils

import android.annotation.SuppressLint
import android.content.Context

/**
 * Created by HankGreen on 2017/5/14.
 * 常用工具类
 */
class Util private constructor() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        private var context: Context? = null

        /**
         * 初始化工具类
         *
         * @param context 上下文
         */
        fun init(context: Context) {
            Companion.context = context.applicationContext
        }

        /**
         * 获取ApplicationContext
         *
         * @return ApplicationContext
         */
        @JvmStatic
        fun getContext(): Context {
            if (context != null) {
                return context!!
            }
            throw NullPointerException("should be initialized in application")
        }
    }

    init {
        throw UnsupportedOperationException("u can't instantiate me...")
    }
}