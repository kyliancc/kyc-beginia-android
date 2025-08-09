package com.kyliancc.beginia_android.data.http

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BeginiaClient {
    private val BASE_URL = "http://10.0.2.2:8080/"

    val docsService: DocsService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DocsService::class.java)
    }
}