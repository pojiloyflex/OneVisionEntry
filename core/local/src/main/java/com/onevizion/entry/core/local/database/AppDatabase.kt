package com.onevizion.entry.core.local.database


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ItemEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}