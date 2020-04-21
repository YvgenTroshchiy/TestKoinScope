package com.troshchiy.testkoinscope

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class TabViewModel : ViewModel() {

    private var tag: String = this::class.java.simpleName

    val value: MutableLiveData<String> = MutableLiveData()

    init {
        Log.d(tag, "init")
        value.postValue(Random.nextInt(0, 700).toString())
    }
}