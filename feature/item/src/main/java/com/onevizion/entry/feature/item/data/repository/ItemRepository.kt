package com.onevizion.entry.feature.item.data.repository

interface ItemRepository {
    fun fetchItems()
    fun getItemDetail(id: String)
}