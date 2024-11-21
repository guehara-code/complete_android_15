package com.example.firebaseapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.Firebase;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
        Log.v("TAG", database.toString());

        DatabaseReference myRef = database.getReference("messages");
        Log.v("TAG", myRef.toString());
        myRef.setValue("Hello from our Course!");
        Log.v("TAG", "after write");

//        myRef.setValue("I'm writing data", new DatabaseReference.CompletionListener() {
//            @Override
//            public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
//                if (error != null) {
//                    // System.out.println("Data could not be saved " + error.getMessage());
//                    Log.v("TAG", "Data could not be saved " + error.getMessage());
//                } else {
//                    // System.out.println("Data saved successfully.");
//                    Log.v("TAG", "Data saved successfully.");
//                }
//            }
//
//        });

    }
}