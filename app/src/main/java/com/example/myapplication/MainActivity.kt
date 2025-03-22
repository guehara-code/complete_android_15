package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Declaring the views
    lateinit var imageView: ImageView
    lateinit var nameEditText: EditText
    lateinit var languageEditText: EditText
    lateinit var textView: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize the widgets
        imageView = findViewById(R.id.imageView)
        languageEditText = findViewById(R.id.javaOrKotlinEditText)
        nameEditText = findViewById(R.id.textView2)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        // handling user interactions
        button.setOnClickListener {
            // Getting the name of the user
            var userName = nameEditText.text.toString()

            // Getting the language specified by the user
            var languageSelected = languageEditText.text.toString()

            // Say hello to the user
            Toast.makeText(this, "Hello $userName", Toast.LENGTH_LONG).show()


            // Display Java or Kotlin logo
            if (languageSelected.equals("Java")) {
                imageView.setImageResource(R.drawable.java_logo)
            } else {
                imageView.setImageResource(R.drawable.kotlin_logo)
            }

        }




    }
}