package com.troshchiy.testkoinscope

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.troshchiy.testkoinscope.fragment.Fragment1
import com.troshchiy.testkoinscope.fragment.Fragment2

class ViewPagerPagerAdapter(manager: FragmentManager) : FragmentStatePagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount() = 2

    override fun getPageTitle(position: Int) = if (position == 0) "First" else "Second"

    override fun getItem(position: Int) = if (position == 0) Fragment1() else Fragment2()
}