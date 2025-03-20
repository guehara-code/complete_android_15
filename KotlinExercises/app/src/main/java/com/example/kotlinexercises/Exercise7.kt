package com.example.kotlinexercises

fun main() {

    var nums = arrayOf(5, 3, 2, 6, 8, 1, 7)
    var even_counter = 0
    var odd_counter = 0

    for (i in nums) {
        if (i % 2 == 0) {
            even_counter++
        } else {
            odd_counter++
        }
    }
    print("Number of even: $even_counter and number of odd: $odd_counter")
}