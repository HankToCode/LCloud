package com.app.basics

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log
import com.app.basics.utils.DisplayManager
import com.app.basics.utils.Util
import com.hjq.toast.ToastUtils
import com.scwang.smartrefresh.layout.SmartRefreshLayout
import com.scwang.smartrefresh.layout.constant.SpinnerStyle
import com.scwang.smartrefresh.layout.footer.ClassicsFooter
import com.scwang.smartrefresh.layout.header.ClassicsHeader
import com.squareup.leakcanary.LeakCanary
import com.squareup.leakcanary.RefWatcher
import me.jessyan.autosize.AutoSizeConfig
import kotlin.properties.Delegates


/**
 * Created by HankGreen on 2017/11/16.
 *
 */

class MyApplication : Application() {

    private var refWatcher: RefWatcher? = null

    companion object {

        private val TAG = "MyApplication"

        var context: Context by Delegates.notNull()
            private set

        fun getRefWatcher(context: Context): RefWatcher? {
            val myApplication = context.applicationContext as MyApplication
            return myApplication.refWatcher
        }

    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
//        refWatcher = setupLeakCanary()
        initConfig()
        DisplayManager.init(this)
        registerActivityLifecycleCallbacks(mActivityLifecycleCallbacks)


    }

    private fun setupLeakCanary(): RefWatcher {
        return if (LeakCanary.isInAnalyzerProcess(this)) {
            RefWatcher.DISABLED
        } else LeakCanary.install(this)
    }


    /**
     * 初始化配置
     */
    private fun initConfig() {
        Util.init(this)
        // 在 Application 中初始化
        ToastUtils.init(this)
        //自动适配，开启Fragment支持
        AutoSizeConfig.getInstance().isCustomFragment = true

        initSmart()

    }

    /**
     * 刷新组件
     */
    private fun initSmart() {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator { context1, _ ->

            ClassicsHeader(context1).setSpinnerStyle(
                SpinnerStyle.Translate
            )
        }
        //指定为经典Footer，默认是 BallPulseFooter
        SmartRefreshLayout.setDefaultRefreshFooterCreator { context12, _ ->
            ClassicsFooter(context12).setSpinnerStyle(
                SpinnerStyle.Scale
            )
        }
    }


    private val mActivityLifecycleCallbacks = object : Application.ActivityLifecycleCallbacks {
        override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
            Log.d(TAG, "onCreated: " + activity.componentName.className)
        }

        override fun onActivityStarted(activity: Activity) {
            Log.d(TAG, "onStart: " + activity.componentName.className)
        }

        override fun onActivityResumed(activity: Activity) {

        }

        override fun onActivityPaused(activity: Activity) {

        }

        override fun onActivityStopped(activity: Activity) {

        }

        override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {

        }

        override fun onActivityDestroyed(activity: Activity) {
            Log.d(TAG, "onDestroy: " + activity.componentName.className)
        }
    }


}
