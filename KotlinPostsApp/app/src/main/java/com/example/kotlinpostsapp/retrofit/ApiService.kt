package com.example.kotlinpostsapp.retrofit

import com.example.kotlinpostsapp.model.Post
import retrofit2.http.GET


interface ApiService {

    @GET("/posts")
    suspend fun getPosts(): List<Post>
}