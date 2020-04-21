package com.troshchiy.testkoinscope

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel { TabViewModel() }
}

val allAppModules = listOf(viewModelModule)