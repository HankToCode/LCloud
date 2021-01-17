package com.app.cloud.utils

import android.content.Context
import android.os.Build

object ColorUtil{
    /**
     * 兼容性的获取颜色信息
     *
     * @param context
     * @param id
     * @return
     */
    fun getColorId(context: Context, id: Int): Int {
        val resources = context.resources
        val theme = context.theme
        val color: Int
        color = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            resources.getColor(id, theme)
        } else {
            resources.getColor(id)
        }
        return color
    }
}