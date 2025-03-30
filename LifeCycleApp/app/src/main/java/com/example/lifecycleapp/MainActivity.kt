package com.example.lifecycleapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var myButton: Button
    lateinit var openWeb: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        myButton = findViewById(R.id.goToNextBtn)
        myButton.setOnClickListener {
            val explicitIntent = Intent(this, SecondActivity::class.java)

            explicitIntent.putExtra("myname", "Jack")
            startActivity(explicitIntent)
        }

        openWeb = findViewById(R.id.openWebBtn)
        openWeb.setOnClickListener{
            val implicitIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com")
            )

            startActivity(implicitIntent)
        }


    }
}