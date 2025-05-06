package com.example.kotlinsportsapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

        // RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        // Data source: List of SportsModel objects
        var sportsList: ArrayList<SportModel> = ArrayList()

        val sport1 = SportModel(R.drawable.football , "Football")
        val sport2 = SportModel(R.drawable.basketball , "Basketball")
        val sport3 = SportModel(R.drawable.ping , "Ping Pong")
        val sport4 = SportModel(R.drawable.tennis , "Tennis")
        val sport5 = SportModel(R.drawable.volley , "VolleyBall")

        sportsList.add(sport1)
        sportsList.add(sport2)
        sportsList.add(sport3)
        sportsList.add(sport4)
        sportsList.add(sport5)

        // Adapter
        val adapter = SportsAdapter(sportsList)
        recyclerView.adapter = adapter

    }
}