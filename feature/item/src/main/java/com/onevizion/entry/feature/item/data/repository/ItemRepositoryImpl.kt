package com.onevizion.entry.feature.item.data.repository

import com.onevizion.entry.feature.item.data.api.ItemApi
import javax.inject.Inject

class ItemRepositoryImpl @Inject constructor(private val itemApi: ItemApi): ItemRepository{
    override fun fetchItems() {
        TODO("Not yet implemented")
    }

    override fun getItemDetail(id: String) {
        TODO("Not yet implemented")
    }
}