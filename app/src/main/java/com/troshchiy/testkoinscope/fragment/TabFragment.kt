package com.troshchiy.testkoinscope.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.troshchiy.testkoinscope.R
import com.troshchiy.testkoinscope.TAG
import com.troshchiy.testkoinscope.TabViewModel
import com.troshchiy.testkoinscope.ViewPagerPagerAdapter
import kotlinx.android.synthetic.main.tab_fragment.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class TabFragment : Fragment() {

    private var logTag: String = this.javaClass.simpleName

    private val viewModel: TabViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tab_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val myScope1 = App.koin.createScope("A", named("A"))

        btn_back.setOnClickListener {
            activity?.onBackPressed()
        }

        Log.d(TAG, "TabFragment. ${lifecycle.hashCode()}")
        tv.text = viewModel.textLiveData.value

        viewPager.adapter = ViewPagerPagerAdapter(childFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
    }
}