package com.example.sub_quotes

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class quotServ {

    companion object {
        fun getAPI():quotesApi{
            val retrofit = Retrofit.Builder()
                .baseUrl("https://favqs.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(quotesApi::class.java)
        }

    }
}