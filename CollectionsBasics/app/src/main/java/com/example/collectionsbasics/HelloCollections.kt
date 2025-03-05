package com.example.collectionsbasics

fun main() {

    // Immutable: read-only list
    val fruits = listOf("Apple", "Banana", "Cherry")

    for (item in fruits) {
        println(item)
    }

    // Mutable List
    val vegetables = mutableListOf("Potato", "Tomato", "Broccoli")
    val colors = arrayListOf("Red", "Green", "Blue")


    vegetables.add("Carrot")
    colors.add("Purple")

    vegetables.removeAt(0)
    colors.removeAt(0)

    vegetables[1] = "Garlic"
    colors[1] = "Yellow"

    for (item in vegetables) {
        println(item)
    }

    for (item in colors) {
        println(item)
    }

    // Immutable Set
    val colorSet = setOf("Red", "Green", "Blue")

    for (item in colorSet) {
        println(item)
    }


}