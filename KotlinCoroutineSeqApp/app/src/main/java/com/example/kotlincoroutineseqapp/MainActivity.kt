package com.example.kotlincoroutineseqapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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

        CoroutineScope(Dispatchers.IO).launch {
            val one = doSomethingUsefull1()
            val two = doSomethingUsefull2()

            val result = one + two
            Log.v("TAGGY", "The result is : $result")
        }

    }

    suspend fun doSomethingUsefull1(): Int {
        delay(5000)
        Log.v("TAGGY", "Fun1 is DONE")
        return 11
    }

    suspend fun doSomethingUsefull2(): Int {
        delay(7000)
        Log.v("TAGGY", "Fun2 is DONE")
        return 8
    }


}