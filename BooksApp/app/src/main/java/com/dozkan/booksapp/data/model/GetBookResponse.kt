package com.dozkan.booksapp.data.model

data class GetBookResponse(
    val success:Int?,
    val books:List<Book>?,
    val message:String?
)