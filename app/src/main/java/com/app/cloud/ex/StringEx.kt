package com.app.cloud.ex

import com.app.basics.utils.Md5
import com.app.basics.utils.ValidatorUtil
import com.app.basics.utils.constant.Constants
import com.app.basics.utils.constant.OSSConfig
import com.blankj.utilcode.util.TimeUtils
import java.math.BigDecimal
import java.text.DateFormat
import java.text.SimpleDateFormat

/**
 * @Author: 无人认领
 * @Date: 2020/4/15 11:48
 * desc:
 */

/**
 * 隐藏手机中间位数3-6
 */
fun String.hideMid(): String {
    if (!ValidatorUtil.isMobile(this)) {
        return this
    }
    var sb = StringBuilder()
    for (i in this.indices) {
        var c = this[i].toString()
        if (i in 3..6) {
            sb.append('*');
        } else {
            sb.append(c);
        }
    }
    return sb.toString()
}

//RMB符号
fun String.rmbSymbol(): String {
    return "$this ${Constants.SYMBOL_TOKEN}"
}

//美元符号
fun String.dollarSymbol(): String {
    return "$this ${Constants.SYMBOL_TOKEN}"
}

//重载String运算符 解决Java遗留Double计算精度问题
operator fun String.times(value: Number): BigDecimal {
    val b1 = BigDecimal(this)
    val b2 = BigDecimal(value.toString())
    return b1.multiply(b2)
}

operator fun String.plus(value: Number): BigDecimal {
    val b1 = BigDecimal(this)
    val b2 = BigDecimal(value.toString())
    return b1.add(b2)
}

operator fun String.div(value: Number): BigDecimal {
    val b1 = BigDecimal(this)
    val b2 = BigDecimal(value.toString())
    return b1.divide(b2, 8, BigDecimal.ROUND_HALF_UP)
}

operator fun String.minus(value: Number): BigDecimal {
    val b1 = BigDecimal(this)
    val b2 = BigDecimal(value.toString())
    return b1.subtract(b2)
}

/**
 * 转换成Md5
 */
fun String.md5(): String {
    return Md5.md5(this)
}

val DEFAULT_FORMAT: DateFormat = SimpleDateFormat("yyyy-MM-dd")
//oss图片上传拼接
fun String.ossImagePath(): String {
    var dateTime = TimeUtils.millis2String(System.currentTimeMillis(), DEFAULT_FORMAT) + "/"
    return OSSConfig.IMAGES_FOLDER_NAME + dateTime + this
}

//oss视频上传拼接
fun String.ossVideoPath(): String {
    var dateTime = TimeUtils.millis2String(System.currentTimeMillis(), DEFAULT_FORMAT) + "/"
    return OSSConfig.VIDEOS_FOLDER_NAME + dateTime + this
}