package com.example.thequizapp.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.thequizapp.model.QuestionList;
import com.example.thequizapp.retrofit.QuestionsAPI;
import com.example.thequizapp.retrofit.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuizRepository {

    private QuestionsAPI questionsAPI;

    public QuizRepository() {
        this.questionsAPI = new RetrofitInstance().getRetrofitInstance()
                .create(QuestionsAPI.class);
    }

    public LiveData<QuestionList> getQuestionsFromAPI() {
        MutableLiveData<QuestionList> data = new MutableLiveData<>();

        Call<QuestionList> response = questionsAPI.getQuestions();

        response.enqueue(new Callback<QuestionList>() {

            @Override
            public void onResponse(Call<QuestionList> call, Response<QuestionList> response) {
                QuestionList list = response.body();
                Log.v("MyActivity", "list" );
                Log.v("MyActivity", list.get(0).getQuestion() );
                data.setValue(list);
            }

            @Override
            public void onFailure(Call<QuestionList> call, Throwable throwable) {

            }

        });

        return data;
    }
}
