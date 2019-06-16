package com.example.sub_quotes

import com.example.sub_quotes.model.apiQu
import retrofit2.Call
import retrofit2.http.GET

interface quotesApi {

    @GET(value = "qotd")
    fun getQuoteAPI() : Call<apiQu>

}
