package com.example.kotlindatabindingapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.kotlindatabindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )

        var v1 = Vehicle("2024", "Mercedes")
        binding.myVehicle = v1

//        binding.textView1.text = v1.name

//        binding.button.setOnClickListener {
//            Toast.makeText(this, "You clicked the button", Toast.LENGTH_SHORT).show()
//        }

        binding.clickHandler = VehicleClickHandlers(this)

    }
}