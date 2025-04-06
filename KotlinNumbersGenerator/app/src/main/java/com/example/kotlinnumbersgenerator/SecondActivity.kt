package com.example.kotlinnumbersgenerator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    lateinit var textViewTitle: TextView
    lateinit var textGeneratedNumbers: TextView
    lateinit var shareButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textViewTitle = findViewById(R.id.textView2)
        textGeneratedNumbers = findViewById(R.id.resultTextView)
        shareButton = findViewById(R.id.shareBtn)

        val randomNumbers = generateRandomNumbers(6)
    }

    fun generateRandomNumbers(count: Int): String {
        // Create a list of random numbers
        var randomNumbers = List(count) {

            //lambda expression to generate random numbers
            (0..42).random()

        // val random = java.util.Random()
        // val randomNumber = random.nextInt(43)
        }

        // Convert the list of numbers to a string
        return randomNumbers.joinToString(" ")
    }
}