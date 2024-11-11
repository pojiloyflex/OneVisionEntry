package com.onevizion.entry.feature.item.presentation.item

import com.onevizion.entry.core.ui.base.BaseViewModel
import com.onevizion.entry.feature.item.data.repository.ItemRepository
import com.onevizion.entry.feature.item.domain.usecase.GetItems
import com.onevizion.entry.navigation.features.ItemNavigation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ItemViewModel @Inject constructor(
    private val getItems: GetItems,
    private val itemNavigation: ItemNavigation
): BaseViewModel<ItemState, ItemEffect>(ItemState()) {

    init {
        // getItems()
    }

    fun navigateToDetail(id: Long) {
        itemNavigation.navigateToItemDetails(id)
    }
}