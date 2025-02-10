package com.example.dependencyapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;

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

        // Dependency Injection

        // Creating a mobile with constructor injection

//        Battery battery = new Battery(100);
//        MemoryCard memoryCard = new MemoryCard(1024);
//        Processor processor = new Processor("Intel");
//        CPU cpu = new CPU(processor);
//
//        Mobile mobile = new Mobile(battery, memoryCard, cpu);
//        mobile.printMobileSpecs();


        // Method Injection
//        mobile.battery.setPowerPercentage(90);
//        mobile.printMobileSpecs();

        // Field Injection
//        processor.processorType = "AMD";
//        mobile.printMobileSpecs();

//        Mobile mobile;
//        MobileComponent mobileComponent = DaggerMobileComponent.create();
//
//        mobile = mobileComponent.getMobile();

        App.getApp().getMobileComponent().getMobile();
//        Log.v("MSG", mobile.toString());
//        mobile.ringNow();

    }



}