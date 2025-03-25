package com.example.kotlincurrencyconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Declaring variables (widgets)

    lateinit var titleTextView: TextView
    lateinit var resultTextView: TextView
    lateinit var editText: EditText
    lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initializing widgets
        titleTextView = findViewById(R.id.textView)
        resultTextView = findViewById(R.id.resultText)
        editText = findViewById(R.id.editText)
        convertButton = findViewById(R.id.convertBTN)

    }
}