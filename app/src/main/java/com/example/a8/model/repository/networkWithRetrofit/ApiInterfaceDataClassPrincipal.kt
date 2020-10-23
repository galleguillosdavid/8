package com.example.a8.model.repository.networkWithRetrofit

import com.example.a8.model.repository.networkWithRetrofit.pojo.DataClasPrincial
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterfaceDataClassPrincipal {

    @GET("all.json")
    fun fetchAllPrincial():Call<List<DataClasPrincial>>

    @GET("all.json")
    suspend fun fetchAllPrincipalWithCoroutines():Response<List<DataClasPrincial>>
}