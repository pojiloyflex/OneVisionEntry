package com.onevizion.entry.core.local.di

import android.content.Context
import androidx.room.Room
import com.onevizion.entry.core.local.database.AppDatabase
import com.onevizion.entry.core.local.database.ItemDao
import com.onevizion.entry.core.local.repository.LocalItemRepository
import com.onevizion.entry.core.local.repository.LocalItemRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "app_database"
        ).build()
    }

    @Provides
    fun provideItemDao(database: AppDatabase): ItemDao {
        return database.itemDao()
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindLocalItemRepository(
        impl: LocalItemRepositoryImpl
    ): LocalItemRepository
}