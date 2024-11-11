package com.onevizion.entry.main

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.NavigatorHolder
import com.onevizion.entry.R
import com.onevizion.entry.core.ui.base.BaseActivity
import com.onevizion.entry.core.ui.base.CustomAppNavigator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity: BaseActivity() {
    private val viewModel by viewModels<MainViewModel>()
    override val navigatorHolder: NavigatorHolder by lazy { viewModel.getNavigationHolder() }
    override val navigator: Navigator = object : CustomAppNavigator(this, R.id.fragment_container_view) {}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)
        viewModel.navigateToItemScreen()
    }
}