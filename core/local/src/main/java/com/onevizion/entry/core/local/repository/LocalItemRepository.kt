package com.onevizion.entry.core.local.repository

import com.onevizion.entry.core.local.database.ItemEntity
import kotlinx.coroutines.flow.Flow

interface LocalItemRepository {
    fun getItems(): Flow<List<ItemEntity>>
    suspend fun getItemById(id: Long): ItemEntity?
    suspend fun saveItem(item: ItemEntity)
    suspend fun deleteItem(item: ItemEntity)
}