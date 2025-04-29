package com.example.kotlingroceryapp

import android.view.View
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


}