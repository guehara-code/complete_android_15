package com.example.kotlinvolumecalculatorapp

import android.content.Context
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

// Adapter: acts as a bridge between data source and the GridView

class MyCustomAdapter(context: Context, private val gridItems: List<Shape>)
    : ArrayAdapter<Shape>(context, 0, gridItems) {

        private class ViewHolder {
            lateinit var imageView: ImageView
            lateinit var textView: TextView
        }
}