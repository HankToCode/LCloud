package com.app.cloud.mvp.model.bean

/**
 * @author HankGreen.
 * @Date 2020/12/22
 * @name
 * desc:
 *
 */
data class WxPhotoOrVideoBean(
    var imageUrl: String = "",
    val videoUrl: String = "",
    var isAdd: Boolean = false
)