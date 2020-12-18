package com.app.basics.net.exception
class NetStatusException(errorCode: Int, msg: String?) : RuntimeException(msg) {
    private var errorCode: Int
    fun getErrorCode(): Int {
        return errorCode
    }

    fun setErrorCode(errorCode: Int) {
        this.errorCode = errorCode
    }

    init {
        this.errorCode = errorCode
    }
}