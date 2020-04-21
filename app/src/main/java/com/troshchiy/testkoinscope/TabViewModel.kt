package com.troshchiy.testkoinscope

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class TabViewModel : ViewModel() {

    private var tag: String = this::class.java.simpleName

    val textLiveData: MutableLiveData<String> = MutableLiveData()

    init {
        val text = Random.nextInt(0, 700).toString()
        Log.d(tag, "init: $text")
        textLiveData.value = text
    }
}