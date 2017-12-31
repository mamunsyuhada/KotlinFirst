package xyz.mamunsyuhada.kotlinfirst.Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Mertani on 31/12/2017.
 */
class KonfigureRetrofit {
    val retrofit = Retrofit.Builder()
            .baseUrl("https://script.google.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val service = retrofit.create<ApiService>(ApiService::class.java!!)
}