package com.example.patternsapp.ui;

import com.example.patternsapp.util.MyModel;

public class AppPresenter {

    AppView appView;

    public  AppPresenter(AppView appView) {
        this.appView = appView;
    }


    // Linkage between presenter and model
    public MyModel GetAppFromModel() {
        return new MyModel("Master Coding App", 90000, 4);
    }

    // Linkage between presenter and mainActivity (calling the interface)
    public void getAppName() {
        appView.onGetAppName(GetAppFromModel().getAppName());
    }

}
