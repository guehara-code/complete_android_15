package com.example.kotlinviewmodelapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.kotlinquadraticeqsolver.CounterViewModel
import com.example.kotlinviewmodelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var counterViewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var binding = DataBindingUtil
            .setContentView<ActivityMainBinding>(this, R.layout.activity_main)

//        var binding = DataBindingUtil
//            .setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//        counterViewModel = viewModelProvider(this).get(CounterViewModel::class.java)
    }
}