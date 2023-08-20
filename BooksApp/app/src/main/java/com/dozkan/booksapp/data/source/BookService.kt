package com.dozkan.booksapp.data.source

import com.dozkan.booksapp.common.Constants
import com.dozkan.booksapp.data.model.GetBookDetailResponse
import com.dozkan.booksapp.data.model.GetBookResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {
    @GET(Constants.Endpoint.GET_BOOKS)
    fun getProducts(): Call<GetBookResponse>

    @GET(Constants.Endpoint.GET_BOOK_DETAIL)
    fun getBookDetail(
        @Query("id") id: Int
    ): Call<GetBookDetailResponse>
}