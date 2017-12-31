package xyz.mamunsyuhada.kotlinfirst.Network

//import android.telecom.Call
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import xyz.mamunsyuhada.kotlinfirst.Respone.ResponseServer

/**
 * Created by Mertani on 31/12/2017.
 */
interface ApiService {

    @GET("macros/s/AKfycby-jbgwKHEvnMbXo3yaW86EulRpsP59AAY2_p5CEDsjfIHqtXMK/exec?sheet=semarang")
    fun request_wisata(): Call<ResponseServer>
}