package com.app.cloud.mvp.model.bean

import java.io.Serializable

/**
 * 数据基类定义
 *
 */
data class BaseBean<T : Any?>(var code: String, var msg: String, var data: T, var token: String?)


