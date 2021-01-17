package com.app.cloud.mvp.model.bean

data class MainTabBean(var position: Int) {
    companion object {
        const val TAB_HOME = 0
        const val TAB_ME = TAB_HOME + 1
    }
}