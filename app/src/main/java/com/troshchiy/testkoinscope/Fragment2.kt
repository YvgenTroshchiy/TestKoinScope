package com.troshchiy.testkoinscope

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_2.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class Fragment2 : Fragment() {

    private var logTag: String = this.javaClass.simpleName

    private val viewModel: TabViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d(logTag, lifecycle.hashCode().toString())
        tv.text = viewModel.textLiveData.value
    }
}