package com.dozkan.booksapp.data.model

data class GetBookDetailResponse(
    val success: Int?,
    val book: Book?,
    val message: String?
)