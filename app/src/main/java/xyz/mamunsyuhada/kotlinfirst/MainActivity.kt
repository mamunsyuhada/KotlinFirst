package xyz.mamunsyuhada.kotlinfirst

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)


    }
    override fun onClick(v: View?) {

        when(v){
            btn1 -> {

                //kalo ndak bawa data
                startActivity(Intent(this, ListviewActivity::class.java))

//                var intent = Intent(this    , ListviewActivity::class.java)
//                startActivity(intent)
            }
            btn2 -> {
                startActivity(Intent(this, RecyclerviewActivity::class.java))
            }
        }

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
