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
import kotlinx.android.synthetic.main.fragment_2.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class Fragment2 : Fragment() {

    private var logTag: String = this.javaClass.simpleName

    private val viewModel: TabViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d(TAG, "Fragment2. ${lifecycle.hashCode()}")
        tv.text = viewModel.textLiveData.value
    }
}