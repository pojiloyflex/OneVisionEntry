package com.onevizion.entry.feature.item.presentation.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.onevizion.entry.core.coroutines.safeLaunch
import com.onevizion.entry.core.ui.base.BaseViewModel
import com.onevizion.entry.feature.item.domain.usecase.GetItemDetails
import com.onevizion.entry.feature.item.presentation.detail.DetailFragment.Companion.DETAIL_ITEM_ID
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val getItemDetails: GetItemDetails,
    private val savedStateHandle: SavedStateHandle,
): BaseViewModel<DetailState, DetailEffect>(DetailState()) {
    init {
        /*viewModelScope.safeLaunch {
            val id = savedStateHandle.get<Long>(DETAIL_ITEM_ID)
            getItemDetails(id)
        }*/
    }
}