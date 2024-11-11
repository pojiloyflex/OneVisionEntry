package com.onevizion.entry.feature.item.di

import com.onevizion.entry.feature.item.ItemNavigationImpl
import com.onevizion.entry.feature.item.data.api.ItemApi
import com.onevizion.entry.feature.item.data.repository.ItemRepository
import com.onevizion.entry.feature.item.data.repository.ItemRepositoryImpl
import com.onevizion.entry.feature.item.domain.usecase.GetItemDetails
import com.onevizion.entry.feature.item.domain.usecase.GetItems
import com.onevizion.entry.navigation.features.ItemNavigation
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import uz.hamroh.navigation.AppCoordinator
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ItemModule {
    @Singleton
    @Provides
    fun provideAuth(appCoordinator: AppCoordinator): ItemNavigation =
        ItemNavigationImpl(appCoordinator)

    @Singleton
    @Provides
    fun provideItemApi(retrofit: Retrofit): ItemApi =
        retrofit.create(ItemApi::class.java)

    @Singleton
    @Provides
    fun provideAuthRepository(itemApi: ItemApi): ItemRepository = ItemRepositoryImpl(itemApi)

    @Provides
    @Singleton
    fun provideGetItems(repository: ItemRepository): GetItems {
        return GetItems(repository)
    }

    @Provides
    @Singleton
    fun provideGetItemDetail(repository: ItemRepository): GetItemDetails {
        return GetItemDetails(repository)
    }
}
