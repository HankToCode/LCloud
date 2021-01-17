package com.app.basics.base

/**
 * Created by 无人认领 on 2020/4/1.
 * name:
 * desc:
 * Tips:
 *
 */

data class BaseBean<T : Any?>(var code: String, var msg: String, var data: T, var token: String?)