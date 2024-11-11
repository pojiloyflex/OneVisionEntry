package com.onevizion.entry.feature.item.domain.usecase

import com.onevizion.entry.feature.item.data.repository.ItemRepository
import javax.inject.Inject

class GetItems @Inject constructor(
    private val repository: ItemRepository
) {
    /*suspend operator fun invoke(): List<ItemModel> {
        return repository.fetchItems()
    }*/
}