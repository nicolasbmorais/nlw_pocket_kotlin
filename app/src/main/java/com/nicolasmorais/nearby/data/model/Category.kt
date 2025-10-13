package com.nicolasmorais.nearby.data.model

import androidx.annotation.DrawableRes
import com.nicolasmorais.nearby.ui.components.category.NearbyCategoryFilterChipEnum

data class NearbyCategory(
    val id: String,
    val name: String,
) {
    @get:DrawableRes
    val icon: Int?
        get() = NearbyCategoryFilterChipEnum.fromDescription(description = name)?.icon
}