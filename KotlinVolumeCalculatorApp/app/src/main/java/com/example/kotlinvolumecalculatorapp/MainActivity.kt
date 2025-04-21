package com.example.kotlinvolumecalculatorapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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

        val gridView: GridView = findViewById(R.id.gridView)

        var shape1: Shape = Shape(R.drawable.sphere, "Sphere")
        var shape2: Shape = Shape(R.drawable.cube, "Cube")
        var shape3: Shape = Shape(R.drawable.prism, "Prism")
        var shape4: Shape = Shape(R.drawable.cylinder, "Cylinder")

        val gridItems = listOf<Shape>(shape1, shape2, shape3, shape4)

        val customAdapter = MyCustomAdapter(this, gridItems)
        gridView.adapter = customAdapter

        gridView.setOnItemClickListener {_, _, position, _ ->
            val clickedItem = customAdapter.getItem(position)

            if(clickedItem?.shapeName.equals("Sphere")) {
                val i = Intent(this, SphereActivity::class.java)
                startActivity(i)
            }
        }

    }
}