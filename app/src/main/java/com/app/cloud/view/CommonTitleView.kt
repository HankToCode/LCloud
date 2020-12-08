package com.app.cloud.view

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.app.cloud.R


/**
 * @author HankGreen.
 * @Date 2020/9/11
 * @name 通用的标题栏
 * desc:
 *
 */

class CommonTitleView : LinearLayout {

    lateinit var tvTitle: TextView
    lateinit var llLeftViews: LinearLayout
    lateinit var llRightViews: LinearLayout
    lateinit var ivBack: ImageView

    private var ta: TypedArray? = null

    constructor(context: Context) : super(context) {
        initView(context)
    }

    constructor(context: Context, attr: AttributeSet) : super(context, attr) {
        ta = context.obtainStyledAttributes(attr, R.styleable.CommonTitleView)
        initView(context)
    }

    constructor(context: Context, attr: AttributeSet, defStyleAttr: Int) : super(
        context,
        attr,
        defStyleAttr
    ) {
        ta = context.obtainStyledAttributes(attr, R.styleable.CommonTitleView)
        initView(context)
    }


    private fun initView(context: Context) {

        val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.layout_title, this)
        tvTitle = view.findViewById(R.id.tvTitle)
        llLeftViews = view.findViewById(R.id.llLeftViews)
        llRightViews = view.findViewById(R.id.llRightViews)
        ivBack = view.findViewById(R.id.ivBack)

        ta?.apply {
            val iconBack = getInteger(R.styleable.CommonTitleView_icon_back, 0)
            if (iconBack != 0) {
                ivBack.setImageResource(iconBack)
            }
        }


    }

    fun addLeftViews(leftViews: MutableList<View>) {
        if (leftViews.isNotEmpty()) {
            leftViews.forEach { view ->
                val layoutParams = LayoutParams(
                    LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT
                )
                layoutParams.setMargins(6, 6, 6, 6)
                view.layoutParams = layoutParams
                llLeftViews.addView(view)
            }
        }
    }

    fun addRightViews(rightViews: MutableList<View>) {
        if (rightViews.isNotEmpty()) {
            rightViews.forEach { view ->
                val layoutParams = LayoutParams(
                    LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT
                )
                layoutParams.setMargins(6, 6, 6, 6)
                view.layoutParams = layoutParams
                llRightViews.addView(view)
            }
        }
    }




}