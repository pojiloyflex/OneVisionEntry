package com.onevizion.entry.feature.item

import com.github.terrakok.cicerone.androidx.FragmentScreen
import com.onevizion.entry.feature.item.presentation.detail.DetailFragment
import com.onevizion.entry.feature.item.presentation.item.ItemFragment
import com.onevizion.entry.navigation.features.ItemNavigation
import uz.hamroh.navigation.AppCoordinator

class ItemNavigationImpl(private val appCoordinator: AppCoordinator) : ItemNavigation {
    override fun navigateToItemList() {
        appCoordinator.navigateTo(ItemScreens.Item())
    }

    override fun navigateToItemDetails(id: Long) {
        appCoordinator.navigateTo(ItemScreens.ItemDetails(id))
    }
}

object ItemScreens {
    fun Item() = FragmentScreen { ItemFragment() }
    fun ItemDetails(id: Long) = FragmentScreen { DetailFragment.newInstance(id) }
}