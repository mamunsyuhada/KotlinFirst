package xyz.mamunsyuhada.kotlinfirst


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recyclerview_item.view.*
import xyz.mamunsyuhada.kotlinfirst.Respone.SemarangItem

/**
 * Created by Mertani on 30/12/2017.
 */

class CustomAdapter(dataItem: List<SemarangItem?>?) : RecyclerView.Adapter<CustomAdapter.MyHolder> (){

    var dataItem : List<SemarangItem?>?
//    lateinit var gambar : Array<Int>
//    lateinit var rate : Array<Float>
//    lateinit var nama : Array<String>
//
//    lateinit var dataItem : Array<String>

    init {
        this.dataItem = dataItem

//        this.gambar = gambar
//        this.nama = nama
//        this.rate = rate
//        this.dataItem = dataItem
    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {
        holder?.bind(position, dataItem)
        //    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder{

        //var view = LayoutInflater.from(parent?.context).inflate(R.layout.rec)

        var view = LayoutInflater.from(parent?.context).inflate(R.layout.recyclerview_item,parent,false)

    //    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return MyHolder(view)
    }

    override fun getItemCount(): Int {

        return dataItem?.size!!
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){
        fun bind(position: Int, dataItem: List<SemarangItem?>?) {

            var wisata = dataItem?.get(position)

//            itemView.imgBuah.setImageResource(gambar.get(position))
//            itemView.textBuah.setText(nama.get(position))


            itemView.textBuah.text = wisata?.namaWisata
            itemView.textContent.text = wisata?.alamatWisata

            Picasso.with(itemView.context)
                    .load("https://drive.google.com/thumbnail?id=" + wisata?.gambarWisata)
                    .resize(50, 50)
                    .centerCrop()
                    .into(itemView.imgBuah)



        }

    }
}