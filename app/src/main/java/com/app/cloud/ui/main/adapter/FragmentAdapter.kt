package com.app.cloud.ui.main.adapter

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentAdapter(
    fm: FragmentManager,
    private val mFragments: List<Fragment>?,
    private var mTitles: List<String>?
) : FragmentPagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    fun updateTitles(titles: List<String>) {
        mTitles = titles
        this.notifyDataSetChanged()
    }

    override fun getItem(position: Int): Fragment {
        return mFragments!![position]
    }

    override fun setPrimaryItem(container: ViewGroup, position: Int, `object`: Any) {
        super.setPrimaryItem(container, position, `object`)
    }

    override fun getCount(): Int {
        return mFragments?.size ?: 0
    }

    override fun getPageTitle(position: Int): CharSequence {
        return mTitles!![position]
    }
}