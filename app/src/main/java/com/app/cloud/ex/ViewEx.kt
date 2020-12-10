package com.app.cloud.ex

import android.app.Activity
import android.os.Build
import android.text.InputType
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import com.app.basics.glide.GlideApp
import com.app.basics.utils.ConvertUtil
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory


/**
 *   @Author Gubr <a href="mailto:Gubr@foxmail.com">Gubr</a>
 **/

fun EditText.getTextStr() = this.text.toString()


fun View.findTextView(id: Int): TextView = this.findViewById(id)

fun View.findImageView(id: Int): ImageView = this.findViewById(id)


fun ImageView.loadImage(url: String?, error: Int = 0, placeholder: Int = 0) {

    val imageUrl = getImageUrl(url)
    Log.d("ImageLoad", imageUrl ?: "")
    loadAbsolutelyIamge(imageUrl, error, placeholder)
}


private fun getImageUrl(url: String?): String? {

    return if (url.isNullOrEmpty()) {
        url
    } else if (url.startsWith("//")) {
        "https:$url"
    } else if (url.contains("http")) {
        url

    } else if (url.startsWith("/storage")) {
        url
    } else if (!url.startsWith("http")) {
        "http://$url"
    } else {
        "https://prod.liantaoapp.com$url"
    }
}


fun ImageView.loadAbsolutelyIamge(url: String?, error: Int = 0, placeholder: Int = 0) {
    if (this.context is Activity) {
        val activity = this.context as Activity
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            if (activity.isDestroyed) {
                return
            }
        }

    }
    val drawableCrossFadeFactory = DrawableCrossFadeFactory.Builder(300).setCrossFadeEnabled(true).build()
    Glide.with(this).load(url)
            .apply(
                    RequestOptions().apply {
                        if (error != 0) {
                            this.error(0)
                        }
                        if (placeholder != 0) {
                            this.placeholder(placeholder)
                        }
                    }
            )
            .transition(DrawableTransitionOptions.with(drawableCrossFadeFactory))
            .into(this)
}


fun ImageView.loadImageRound(url: String?, dp: Float, error: Int = 0, placeholder: Int = 0) {

    val imageUrl = getImageUrl(url)
    Log.d("ImageLoad", imageUrl ?: "")
    if (this.context is Activity) {
        val activity = this.context as Activity
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            if (activity.isDestroyed) {
                return
            }
        }
    }
    val drawableCrossFadeFactory = DrawableCrossFadeFactory.Builder(300).setCrossFadeEnabled(true).build()
    GlideApp.with(this).load(imageUrl).fitCenter().apply(RequestOptions.bitmapTransform(RoundedCorners(
        ConvertUtil.dp2px(dp))).apply {
        if (error != 0) {
            this.error(0)
        }
        if (placeholder != 0) {
            this.placeholder(placeholder)
        }
    }).transition(DrawableTransitionOptions.with(drawableCrossFadeFactory)).into(this)
}


fun View.setSimpleClickListner(callback: (() -> Unit)?) {
    this.setOnClickListener {
        callback?.invoke()
    }
}

fun View.getColorEx(@ColorRes colorId: Int) = ContextCompat.getColor(this.context, colorId)

fun View.getDrawableEx(@DrawableRes drawableId: Int) = ContextCompat.getDrawable(this.context, drawableId)


fun View.setVisibleOrGone(isVisible: Boolean) {
    this.visibility = if (isVisible) View.VISIBLE else View.GONE
}

fun View.setVisibleOrINVISIBLE(isVisible: Boolean) {
    this.visibility = if (isVisible) View.VISIBLE else View.INVISIBLE
}


fun EditText.setTextAndSelection(text: String?, selection: Int = text?.length ?: -1) {
    this.setText(text)
    if (text != null && selection > -1) {
        this.setSelection(selection)
    }
}


fun ViewGroup.foreachChild(back: ((Int, View) -> Unit)) {
    val childCount = this.childCount
    if (childCount > 0) {
        for (index in 0 until childCount) {
            back.invoke(index, this.getChildAt(index))
        }
    }
}

fun Switch.setCheckedOrUnchecked(isChecked: Boolean) {
    this.isChecked = isChecked
}

/**
 * 切换显示状态
 */
fun EditText.switchLook() {
    if (this.inputType == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {//如果现在是显示密码模式
        //设置为隐藏密码
        this.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
    } else {//设置为显示密码
        this.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
    }
    this.setSelection(this.text.length)//设置光标的位置到末尾
}

/**
 * 数字密码，切换显示状态
 */
fun EditText.switchLookNum() {
    if (this.inputType == InputType.TYPE_CLASS_NUMBER) {
        //如果现在是显示密码模式
        //设置为隐藏密码
        this.inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_VARIATION_PASSWORD
    } else {
        this.inputType = InputType.TYPE_CLASS_NUMBER//设置为显示密码
    }
    this.setSelection(this.text.length)//设置光标的位置到末尾
}












