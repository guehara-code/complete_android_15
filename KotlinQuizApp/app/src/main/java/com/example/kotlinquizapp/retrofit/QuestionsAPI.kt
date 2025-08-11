package com.example.kotlinquizapp.retrofit

import com.example.kotlinquizapp.model.QuestionsList
import retrofit2.Response
import retrofit2.http.GET

interface QuestionsAPI {

    @GET("questionapi.php")
    suspend fun getQuestions(): Response<QuestionsList>

}