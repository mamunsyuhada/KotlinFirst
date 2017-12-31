package xyz.mamunsyuhada.kotlinfirst

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_recyclerview.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import xyz.mamunsyuhada.kotlinfirst.Network.KonfigureRetrofit
import xyz.mamunsyuhada.kotlinfirst.Respone.ResponseServer


class RecyclerviewActivity : AppCompatActivity() {

    var gambar = arrayOf(
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.jambuair,
            R.drawable.manggis
    )

    var nama = arrayOf(
            "Alpukat",
            "Apel",
            "Ceri",
            "Jambu Air",
            "Manggis"
    )

    var rate = arrayOf<Float>(
            1.2F,
            2.5F,
            3.8F,
            4.7F,
            5.7F
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        // get konfigure retrofit

        var getConfig = KonfigureRetrofit().service

        // get request
        var getRequest = getConfig.request_wisata()

        getRequest.enqueue(object : Callback<ResponseServer> {
            override fun onFailure(call: Call<ResponseServer>?, t: Throwable?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<ResponseServer>?, response: Response<ResponseServer>?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

                //get respone server
                Log.d("respone : ", response?.message())

                //get json kalau dapat
                Log.d("json : ", response?.body().toString())

                //Check responenya

                if(response?.isSuccessful!!){
                    // get data kalau ada respone server
                    var responeSemarang = response.body()
                    // get all json array
                    var arraySemarang = responeSemarang?.semarang

                    var adapter = CustomAdapter(arraySemarang)

                    rvBuah.adapter = adapter
                    rvBuah.layoutManager = LinearLayoutManager(this@RecyclerviewActivity)



                }
            }
        })

//        var adapter = CustomAdapter(gambar,nama,rate)
//
//        rvBuah.adapter =  adapter
//        rvBuah.layoutManager = LinearLayoutManager(this)

    }
}
