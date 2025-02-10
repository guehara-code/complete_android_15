package com.example.dependencyapp;

import android.app.Application;

public class App extends Application {

    private static App app;
    private MobileComponent mobileComponent;

    public static App getApp() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        mobileComponent = DaggerMobileComponent.create();

        MobileComponent mobileComponent = DaggerMobileComponent.create();

    }

    public MobileComponent getMobileComponent() {
        return mobileComponent;
    }
}
