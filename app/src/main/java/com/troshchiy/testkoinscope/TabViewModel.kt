package com.troshchiy.testkoinscope

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class TabViewModel : ViewModel() {

    private var tag: String = this.javaClass.simpleName

    val textLiveData: MutableLiveData<String> = MutableLiveData()

    init {
        val text = Random.nextInt(0, 700).toString()

        Log.w(TAG, "ViewModel. init: $text")
        textLiveData.value = text
    }
}