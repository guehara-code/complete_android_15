package com.example.kotlinquizapp.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.kotlinquizapp.R
import com.example.kotlinquizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_result)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_result)

        binding.txtAnswer.text = "Your Score is: " + MainActivity.result + "/" + MainActivity.totalQuestions

        binding.btnBack.setOnClickListener() {
            var intent = Intent(this@ResultActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }
}