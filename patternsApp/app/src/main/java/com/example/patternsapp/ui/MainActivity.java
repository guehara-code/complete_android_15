package com.example.patternsapp.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.patternsapp.R;
import com.example.patternsapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
//    Button btn;
//    TextView textView;

   AppViewModel appViewModel;

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

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appViewModel.getAppName();
            }
        });

//        textView = findViewById(R.id.textView);
//        btn = findViewById(R.id.button);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                appViewModel.getAppName();
//            }
//        });

        appViewModel = new ViewModelProvider(this).get(AppViewModel.class);

        appViewModel.mutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {

                binding.textView.setText(s);
            }
        });

    }



}