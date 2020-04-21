package com.troshchiy.testkoinscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.tab_fragment.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class TabFragment : Fragment() {

    private val viewModel: TabViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tab_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv.text = viewModel.textLiveData.value

        viewPager.adapter = ViewPagerPagerAdapter(childFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
    }
}