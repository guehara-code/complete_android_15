package com.example.kotlinfragmentsapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

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

        val btn1: Button = findViewById(R.id.displayFrag1)
        val btn2: Button = findViewById(R.id.displayFrag2)

        btn1.setOnClickListener {
            val fragment1: FragmentOne = FragmentOne()
            loadFragment(fragment1)
        }
        btn2.setOnClickListener {
            val fragment2 = FragmentTwo()
            loadFragment(fragment2)
        }

    }

    fun loadFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager

        val fragmentTransaction: FragmentTransaction =
            fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.framelayout, fragment)
        fragmentTransaction.commit()

    }
}