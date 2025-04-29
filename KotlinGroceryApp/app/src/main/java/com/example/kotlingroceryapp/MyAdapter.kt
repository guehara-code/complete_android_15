package com.example.kotlingroceryapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val itemsList: ArrayList<ItemModel>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView)
}