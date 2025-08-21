package com.example.kotlincoroutinesapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btn = findViewById<Button>(R.id.btn)
        var textView = findViewById<TextView>(R.id.textView)

        var counter = 0

        btn.setOnClickListener {
            counter++
            textView.text = counter.toString()
        }

        val main_scope = CoroutineScope(Dispatchers.Main)
        val background_scoupe = CoroutineScope(Dispatchers.IO)
        main_scope.launch {
            Log.v("TAGY", "Using the ${coroutineContext}")

            // switching to IO Dispatcher temporarily
            withContext(Dispatchers.IO) {
                Log.v("TAGY", "Using the ${coroutineContext}")
                Log.v("TAGY", "The IO Thread")
                delay(1000)
            }

            // switching to main dispatcher
            Log.v("TAGY", "Using the ${coroutineContext}")
        }

    }

    private fun downloadBigFileFromNet() {
        for (i in 1..1000000) {
            Log.i("TAGY", "Downloading $i ")
        }
    }

}