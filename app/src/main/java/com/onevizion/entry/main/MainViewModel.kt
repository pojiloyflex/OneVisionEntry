package com.onevizion.entry.main

import com.github.terrakok.cicerone.NavigatorHolder
import com.onevizion.entry.core.ui.base.BaseViewModel
import com.onevizion.entry.navigation.features.ItemNavigation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val navigatorHolder: NavigatorHolder,
    private val itemNavigation: ItemNavigation,
): BaseViewModel<MainState, MainEffect>(MainState()) {

    fun getNavigationHolder() = navigatorHolder

    fun navigateToItemScreen() = itemNavigation.navigateToItemList()
}