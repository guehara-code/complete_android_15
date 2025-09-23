package com.example.kotlinpostsapp.util

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinpostsapp.R
import com.example.kotlinpostsapp.model.Post

class PostAdapter (private val posts: List<Post>):
RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.textViewTitleCard)
        val body: TextView = itemView.findViewById(R.id.textViewBody)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}