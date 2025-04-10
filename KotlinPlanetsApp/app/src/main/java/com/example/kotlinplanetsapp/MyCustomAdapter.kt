package com.example.kotlinplanetsapp

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class MyCustomAdapter(val context: Context, val planets: List<Planet>): BaseAdapter {
    override fun getCount(): Int {
        return planets.size
    }

    override fun getItem(position: Int): Any {
        return planets[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

    }


}