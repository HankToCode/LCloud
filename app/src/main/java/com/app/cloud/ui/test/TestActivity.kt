package com.app.cloud.ui.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.widget.NestedScrollView
import com.app.cloud.ui.login.activity.LoginActivity
import com.app.cloud.ui.main.activity.MainActivity
import com.app.cloud.ui.send.activity.RegularSendingActivity
import com.app.cloud.ui.send.activity.SendingActivity
import com.trello.rxlifecycle3.components.support.RxAppCompatActivity

/**
 * Created by 无人认领 on 2020/3/20.
 * desc: 测试demo
 */
class TestActivity : RxAppCompatActivity() {

    companion object {
        const val TAG = "TestActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(NestedScrollView(this).apply {
            addView(LinearLayout(context).apply {
                orientation = LinearLayout.VERTICAL
                addView(Button(context).apply {
                    text = "登录"
                    setOnClickListener {
                        val intent = Intent(context, LoginActivity::class.java)
                        startActivity(intent)
                    }
                })
                addView(Button(context).apply {
                    text = "首页"
                    setOnClickListener {
                        MainActivity.startActivity(this@TestActivity)
                    }
                })
                addView(Button(context).apply {
                    text = "编辑朋友圈"
                    setOnClickListener {
                        SendingActivity.startActivity(this@TestActivity)
                    }
                })
                addView(Button(context).apply {
                    text = "定时群发"
                    setOnClickListener {
                        RegularSendingActivity.startActivity(this@TestActivity)
                    }
                })

            })
        })

    }

}