package com.example.thequizapp.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.thequizapp.model.QuestionList;
import com.example.thequizapp.repository.QuizRepository;

public class QuizViewModel extends ViewModel {

    QuizRepository repository = new QuizRepository();

    LiveData<QuestionList> questionListLiveData;

    public QuizViewModel() {
        questionListLiveData = repository.getQuestionsFromAPI();

    }

    public LiveData<QuestionList> getQuestionListLiveData() {
        Log.v("MyActivity", questionListLiveData.toString());
        return questionListLiveData;
    }
}
