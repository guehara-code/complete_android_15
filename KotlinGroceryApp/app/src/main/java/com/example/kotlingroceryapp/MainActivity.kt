package com.example.kotlingroceryapp

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

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        var groceryItems: ArrayList<ItemModel> = ArrayList()

        val v1 = ItemModel("Fruits", "Fresh Fruits from the Garden", R.drawable.fruit)
        val v2 = ItemModel("Vegetables", "Delicious Vegetables", R.drawable.vegitables)
        val v3 = ItemModel("Bakery", "Bread, Wheat and Beans", R.drawable.bread)
        val v4 = ItemModel("Milk", "Milk, Shakes and Yogurt", R.drawable.milk)
        val v5 = ItemModel("Snacks", "Pop Corn, Donut and Drinks", R.drawable.popcorn)

        groceryItems.add(v1)
        groceryItems.add(v2)
        groceryItems.add(v3)
        groceryItems.add(v4)
        groceryItems.add(v5)

        val adapter = MyAdapter(groceryItems)
        recyclerView.adapter = adapter

    }
}