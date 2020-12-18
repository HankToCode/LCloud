package com.app.cloud.helper

import com.app.basics.utils.constant.Constants
import com.blankj.utilcode.util.SPUtils

class UserManager {

    companion object {

        fun isLogin(): Boolean {
            return getFakeToken().isNotEmpty()
        }

        /**
         *获取Token
         */
        fun getFakeToken(): String {
            return SPUtils.getInstance().getString(Constants.FAKE_TOKEN)
        }

        /**
         * 保存Tokne
         */
        fun saveFakeToken(fakeToken: String) {
            SPUtils.getInstance().put(Constants.FAKE_TOKEN, fakeToken)
        }
    }

}