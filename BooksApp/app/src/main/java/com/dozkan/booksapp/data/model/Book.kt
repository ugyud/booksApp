package com.dozkan.booksapp.data.model

import com.google.gson.annotations.SerializedName

data class Book (
    val author: String?,
    val id: Int?,
    val name: String?,
    val price: Double?,
    @SerializedName("image_url") val imageUrl: String?,
    @SerializedName("is_best_seller") val isBestSeller: Boolean?,
    val publisher: String?
)