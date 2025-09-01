package com.example.kotlinroomapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val name: String,
    val price: Double,
    val quality: Int
)
