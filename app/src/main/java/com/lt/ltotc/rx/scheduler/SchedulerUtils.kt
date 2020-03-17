package com.lt.ltotc.rx.scheduler

/**
 * Created by HankGreen on 2017/11/17.
 * desc:
 */

object SchedulerUtils {

    fun <T> ioToMain(): IoMainScheduler<T> {
        return IoMainScheduler()
    }
}
