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

    // Mutable Set
    val fruitsMSet = mutableSetOf("Apple", "Banana", "Cherry")

    fruitsMSet.add("Melon")
    fruitsMSet.add("Apple")

    for (item in fruitsMSet) {
        println(item)
    }

    fruitsMSet.remove("Banana")
    fruitsMSet.add("Orange")

    for (item in fruitsMSet) {
        println(item)
    }

    // Immutable maps
    val fruitsMap = mapOf("apple" to 5, "banana" to 8, "cherry" to 12)

    val quantity = fruitsMap["banana"]
    println("The quantity of bananas is " + quantity)

}