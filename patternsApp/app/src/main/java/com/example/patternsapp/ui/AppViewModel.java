package com.example.patternsapp.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.patternsapp.util.MyModel;

public class AppViewModel extends ViewModel {

    public MutableLiveData<String> mutableLiveData = new MutableLiveData<>();

    private MyModel getAppFromDatabase() {


        return new MyModel("Master Coding App", 90000, 4);
    }

    public void getAppName() {
        String appName = getAppFromDatabase().getAppName();
        mutableLiveData.setValue(appName);
    }

}
