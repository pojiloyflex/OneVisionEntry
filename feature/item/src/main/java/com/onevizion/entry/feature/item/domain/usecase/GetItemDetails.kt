package com.onevizion.entry.feature.item.domain.usecase

import com.onevizion.entry.feature.item.data.repository.ItemRepository

class GetItemDetails(private val itemRepository: ItemRepository) {
    /*suspend operator fun invoke(id: Long): DetailModel {
       return repository.getItemDetail(id)
   }*/
}