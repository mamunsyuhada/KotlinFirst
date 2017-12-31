package xyz.mamunsyuhada.kotlinfirst

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_listview.*

class ListviewActivity : AppCompatActivity() {

    //versi java String[] data = {};
    //variable array
    var data = arrayOf("SuketTeki","MicinPahit","Oreo","Hore",16,17,89)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        //include array ke adapter
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,data)

        //adapte include to listview
        listNama.adapter = adapter

        listNama.setOnItemClickListener { adapterView, view, posisi, l ->
            Log.d("klik user", data.get(posisi).toString())
        }
    }
}
