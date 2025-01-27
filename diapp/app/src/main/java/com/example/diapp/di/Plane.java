package com.example.diapp.di;

import android.util.Log;
import android.widget.Toast;

public class Plane {

    Engine e;
    Wings w;
    PlaneType t;

    public Plane(Engine e, Wings w, PlaneType t) {
        this.e = e;
        this.w = w;
        this.t = t;
    }

    public void TakeOff() {
        Log.v("TAG", " Taking off");
    }


}
