package com.dozkan.booksapp.data.retrofit

import com.dozkan.booksapp.common.Constants.BASE_URL
import com.dozkan.booksapp.data.source.BookService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class retrofit {
    companion object {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BookService::class.java)
    }
}