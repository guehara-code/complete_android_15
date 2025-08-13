package com.example.kotlinquizapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinquizapp.model.QuestionsList
import com.example.kotlinquizapp.repository.QuizRepository

class QuizViewModel: ViewModel() {

    var repository: QuizRepository = QuizRepository()

    lateinit var questionsLiveData: LiveData<QuestionsList>

    init {
        questionsLiveData = repository.getQuestionsFromAPI()

    }

    fun getQuestionsFromLiveData(): LiveData<QuestionsList> {
        return questionsLiveData
    }

}