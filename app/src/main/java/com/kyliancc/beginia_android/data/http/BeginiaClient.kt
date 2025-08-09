package com.kyliancc.beginia_android.data.http

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BeginiaClient {
    private val BASE_URL = "http://localhost:8080/"

    val todoDocsService: TodoDocsService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TodoDocsService::class.java)
    }
}