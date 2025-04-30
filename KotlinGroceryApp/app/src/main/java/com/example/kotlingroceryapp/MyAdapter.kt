package com.example.kotlingroceryapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val itemsList: ArrayList<ItemModel>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {

            var itemImg: ImageView
            var itemTitle: TextView
            var itemDesc: TextView

            init {
                itemImg = itemView.findViewById(R.id.imageView)
                itemTitle = itemView.findViewById(R.id.title_txt)
                itemDesc = itemView.findViewById(R.id.description_text)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}