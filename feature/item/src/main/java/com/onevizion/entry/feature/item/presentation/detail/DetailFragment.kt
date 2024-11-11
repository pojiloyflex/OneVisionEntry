package com.onevizion.entry.feature.item.presentation.detail

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.onevizion.entry.core.ui.base.ComposeFragment
import com.onevizion.entry.core.ui.ext.lazyLongArgument
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment: ComposeFragment() {


    private val viewModel: DetailViewModel by viewModels()

    @Composable
    override fun ComposeContent() {
        DetailContent()
    }

    companion object {
        const val DETAIL_ITEM_ID = "DETAIL_ITEM_ID"

        fun newInstance(id: Long): DetailFragment {
            return DetailFragment().apply {
                arguments = Bundle().apply {
                    putLong(DETAIL_ITEM_ID, id)
                }
            }
        }
    }
}