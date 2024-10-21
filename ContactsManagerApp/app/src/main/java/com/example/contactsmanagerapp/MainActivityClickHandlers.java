package com.example.contactsmanagerapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.contactsmanagerapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivityClickHandlers {



    Context context;

    public MainActivityClickHandlers(Context context) {
        this.context = context;
    }

    public void onFABClicked(View view) {
        Intent i = new Intent(view.getContext(), AddNewContactActivity.class);
        context.startActivity(i);
    }
}
