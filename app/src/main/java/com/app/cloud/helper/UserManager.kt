package com.app.cloud.helper

import com.app.basics.base.AppManager
import com.app.basics.utils.constant.Constants
import com.app.cloud.ui.login.activity.LoginActivity
import com.blankj.utilcode.util.SPUtils

class UserManager {

    companion object {

        fun isLogin(): Boolean {
            return getFakeToken().isNotEmpty()
        }

        fun logout() {
            saveFakeToken("")

            AppManager.appManager?.logout {
                val activity = AppManager.appManager!!.currentActivity()!!
                LoginActivity.startActivity(activity)
                AppManager.appManager?.finishActivity(activity)
            }
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