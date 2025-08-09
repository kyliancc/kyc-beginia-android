package com.kyliancc.beginia_android.data.http

import com.kyliancc.beginia_android.model.AllDocItems
import com.kyliancc.beginia_android.model.CpltDocItem
import com.kyliancc.beginia_android.model.DocSwitches
import com.kyliancc.beginia_android.model.TodoDocItem
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface TodoDocsService {
    @POST("/api/v1/docs/create")
    suspend fun createDoc(@Body doc: TodoDocItem)

    @POST("/api/v1/docs/update_todo")
    suspend fun updateTodoDoc(@Body doc: TodoDocItem)

    @POST("/api/v1/docs/update_cplt")
    suspend fun updateCpltDoc(@Body doc: CpltDocItem)

    @DELETE("/api/v1/docs/delete_todo")
    suspend fun deleteTodoDoc(@Path("id") id: Int)

    @DELETE("api/v1/docs/delete_cplt")
    suspend fun deleteCpltDoc(@Path("id") id: Int)

    @GET("api/v1/docs/get_todo")
    suspend fun getTodoDoc(@Path("id") id: Int): TodoDocItem

    @GET("api/v1/docs/get_cplt")
    suspend fun getCpltDoc(@Path("id") id: Int): CpltDocItem

    @GET("/api/v1/docs/get_all_todo")
    suspend fun getAllTodoDocs(): List<TodoDocItem>

    @GET("/api/v1/docs/get_all_cplt")
    suspend fun getAllCpltDocs(): List<CpltDocItem>

    @GET("/api/v1/docs/get_all")
    suspend fun getAllDocs(): AllDocItems

    @POST("/api/v1/docs/complete")
    suspend fun completeDoc(@Path("id") id: Int)

    @POST("/api/v1/docs/switch")
    suspend fun switchTodoPriority(@Body switches: DocSwitches)
}