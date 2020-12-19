package com.app.cloud.ui.login.activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.text.Editable
import android.text.TextWatcher
import com.app.basics.base.BaseActivity
import com.app.basics.utils.SoftInputUtil
import com.app.cloud.R
import com.app.cloud.ex.clicksJustSeconds
import com.app.cloud.ex.md5
import com.app.cloud.ex.setVisibleOrInvisible
import com.app.cloud.ex.switchLookNum
import com.app.cloud.helper.UserManager
import com.app.cloud.mvp.contract.LoginContract
import com.app.cloud.mvp.model.send.LoginSend
import com.app.cloud.mvp.presenter.LoginPresenter
import com.app.cloud.ui.main.activity.MainActivity
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
import kotlinx.android.synthetic.main.activity_login.*

/**
 * Created by HankGreen on 2020/3/20.
 * desc: 交易中心
 * Tips:onDestroy() 记得mPresenter.detachView()
 */
class LoginActivity : BaseActivity(), LoginContract.View {
    override fun layoutId(): Int = R.layout.activity_login

    private val mPresenter by lazy { LoginPresenter() }

    override fun initData() {
    }

    @SuppressLint("SetTextI18n")
    override fun initView() {

        mPresenter.attachView(this)

        QMUIStatusBarHelper.setStatusBarLightMode(this)

        tvLogin.isEnabled = false
        editPhone.addTextChangedListener(editWatcher)
        editPwd.addTextChangedListener(editWatcher)

        clicksJustSeconds(tvLogin) {
            val username = editPhone.text.toString()
            val password = editPwd.text.toString()
            val send = LoginSend(username, password)
            mPresenter.login(send)
            SoftInputUtil.closeKeyBord(editPhone, this)
            SoftInputUtil.closeKeyBord(editPwd, this)
        }
        clicksJustSeconds(ivClearAccount) {
            editPhone.setText("")
        }
        clicksJustSeconds(ivClearPass) {
            editPwd.setText("")
        }
        clicksJustSeconds(ivLook) {
            editPwd.switchLookNum()
        }

        if (UserManager.getFakeToken().isNotBlank()) {
            MainActivity.startActivity(this)
            finish()
        }

    }

    private val editWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            val username = editPhone.text.toString()
            val password = editPwd.text.toString()
            tvLogin.isEnabled =
                username.isNotEmpty() && username.length == 11 && password.isNotEmpty()

            ivClearAccount.setVisibleOrInvisible(username.isNotEmpty())
            ivClearPass.setVisibleOrInvisible(password.isNotEmpty())
            ivLook.setVisibleOrInvisible(password.isNotEmpty())

        }

    }

    override fun start() {

    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }

    companion object {
        fun startActivity(context: Context) {
            context.startActivity(Intent(context, LoginActivity::class.java))
        }
    }
}
