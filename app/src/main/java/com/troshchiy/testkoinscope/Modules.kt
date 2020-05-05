package com.troshchiy.testkoinscope

import com.troshchiy.testkoinscope.fragment.TabFragment
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module


val viewModelModule = module {
    scope(named<TabFragment>()) {
        viewModel { TabViewModel() }
    }
}

val allAppModules = listOf(viewModelModule)