package com.example.a8.model.repository.networkWithRetrofit

import com.example.a8.model.repository.networkWithRetrofit.pojo.DataClasPrincial
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object{
        private const val URL_BASE = "https://akabab.github.io/superhero-api/api/"

        fun getRetrofitClient(): ApiInterfaceDataClassPrincipal{
            val mRetrofit = Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return mRetrofit.create(ApiInterfaceDataClassPrincipal::class.java)
        }

    }
}