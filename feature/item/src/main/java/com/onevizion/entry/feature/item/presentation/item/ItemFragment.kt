package com.onevizion.entry.feature.item.presentation.item

import androidx.compose.runtime.Composable
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.onevizion.entry.core.ui.base.ComposeFragment
import com.onevizion.entry.feature.item.presentation.detail.DetailViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ItemFragment: ComposeFragment() {

    private val viewModel: ItemViewModel by viewModels()

    @Composable
    override fun ComposeContent() {
        ItemContent()
    }
}