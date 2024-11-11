package com.onevizion.entry.core.local.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "items")
data class ItemEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val description: String
)