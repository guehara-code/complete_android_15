package com.example.dependencyapp;

import android.util.Log;

import javax.inject.Inject;

public class NickelBattery implements Battery {

    @Inject
    public NickelBattery() {

    }

    @Override
    public void showType() {
        Log.v("TAGY", "This is a nickel Battery");
    }
}
