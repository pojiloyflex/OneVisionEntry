package com.onevizion.entry.core.local.repository

import com.onevizion.entry.core.local.database.ItemDao
import com.onevizion.entry.core.local.database.ItemEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalItemRepositoryImpl @Inject constructor(
    private val itemDao: ItemDao
) : LocalItemRepository {

    override fun getItems(): Flow<List<ItemEntity>> = itemDao.getAllItems()

    override suspend fun getItemById(id: Long): ItemEntity? = itemDao.getItemById(id)

    override suspend fun saveItem(item: ItemEntity) {
        itemDao.insertItem(item)
    }

    override suspend fun deleteItem(item: ItemEntity) {
        itemDao.deleteItem(item)
    }
}