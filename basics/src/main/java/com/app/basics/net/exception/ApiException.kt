package com.app.basics.net.exception

/**
 * Created by HankGreen on 2017/12/5.
 * desc:
 */
class ApiException : RuntimeException {

    private var code: Int? = null


    var errorCode: String? = null
    var errorMsg: String? = null


    constructor(throwable: Throwable, code: Int) : super(throwable) {
        this.code = code
    }

    constructor (errorCode: String?, errorMsg: String?) {
        this.errorCode = errorCode
        this.errorMsg = errorMsg
    }

    constructor(message: String) : super(Throwable(message))
}