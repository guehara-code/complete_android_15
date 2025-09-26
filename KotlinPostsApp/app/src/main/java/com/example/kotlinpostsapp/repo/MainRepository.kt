package com.example.kotlinpostsapp.repo

import com.example.kotlinpostsapp.retrofit.ApiService
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getPosts() = apiService.getPosts()
}