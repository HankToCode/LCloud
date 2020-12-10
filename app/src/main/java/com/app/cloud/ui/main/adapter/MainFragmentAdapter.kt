package com.app.cloud.ui.main.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.app.basics.base.BasePagerAdapter
import com.app.cloud.ui.main.fragment.HomeFragment
import com.app.cloud.ui.main.fragment.MeFragment

class MainFragmentAdapter(fm: FragmentManager) : BasePagerAdapter(fm) {


    override fun getCount(): Int {
        return 2
    }

    override fun getItem(var1: Int): Fragment {
        return when (var1) {
            0 -> HomeFragment.newInstance()
            1 -> MeFragment.newInstance()
            else -> error("超过了")
        }
    }
}