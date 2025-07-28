package com.example.kotlincoroutineapp2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.kotlincoroutineapp2.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        SayHelloFromMainThread()

        SayHelloFromBackThread()

    }

    private fun SayHelloFromMainThread() {

        CoroutineScope(Dispatchers.Main).launch {
            binding.text1.text = "Hello From " +
                    " ${Thread.currentThread().name}"
        }
    }

    private fun SayHelloFromBackThread() {
        CoroutineScope(Dispatchers.IO).launch {
            binding.text2.text = " Hello From " +
                    " ${Thread.currentThread().name}"
        }
    }


}



