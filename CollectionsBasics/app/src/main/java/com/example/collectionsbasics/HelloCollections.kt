package com.example.collectionsbasics

fun main() {

    // Immutable: read-only list
    val fruits = listOf("Apple", "Banana", "Cherry")

    for (item in fruits) {
        println(item)
    }

}