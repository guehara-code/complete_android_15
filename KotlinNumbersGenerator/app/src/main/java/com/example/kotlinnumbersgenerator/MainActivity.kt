package com.example.kotlinnumbersgenerator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var titleTextView: TextView
    lateinit var editText: EditText
    lateinit var generateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        titleTextView = findViewById(R.id.textView)
        editText = findViewById(R.id.editText)
        generateButton = findViewById(R.id.generateBtn)

        generateButton.setOnClickListener {
            var name: String = editText.text.toString()

            var i = Intent(this, SecondActivity::class.java)

            i.putExtra("username", name)

            startActivity(i)
        }

    }
}