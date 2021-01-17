package com.app.cloud.mvp.model.bean

data class SendingTabBean(var position: Int) {
    companion object {
        const val TAB_IMAGE = 0
        const val TAB_VIDEO = TAB_IMAGE + 1
    }
}