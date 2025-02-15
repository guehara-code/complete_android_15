package com.example.kotlinbasics

fun main() {

    // Mutable variable
    var myAge : Int = 25

    // Immutable variable
    val pi : Double = 3.14159

    println("My age is: " + myAge)


    // Byte: -128 tp 127
    val myByte : Byte = 127

    // Short: -32786 to 32767
    val myShort : Short = 5473

    // Int: approx. -2 billion to 2 billion
    val myInt : Int = 475638

    // Long
    val myLong : Long = 6541681351

    // Float : decimal numbers
    val myFloat : Float = 3.14159f


    // Double : decimals with double precision
    val myDouble : Double = 2.75135654

    // Boolean : True or False
    val isRaining : Boolean = true

    if (isRaining) {
        println("It is raining outside")
    }

    // Characters: represents characters
    // letters, digits, symbols or special characters
    var myChar : Char = '\n'

    // Arithmetic Operators: +-*/%

    var result: Int = 5 + 3
    println("The result = " + result)

    result = 5 - 3
    println("The result = " + result)

    result = 5 * 3
    println("The result = " + result)

    result = 6 / 3
    println("The result = " + result)

    result = 5 % 3     // remainder or division
    println("The result = " + result)

    // Logical Operators: && || !
    var result2 : Boolean = true && true
    println("The result2 = " + result2)

    result2 = true || false
    println("The result2 = " + result2)

    result2 = !true
    println("The result2 = " + result2)

    // Strings
    val text1 : String = "Hello My Friends"
    val text2 : String = " Welcome Back!"

    // String concat
    val text3 = text1 + text2

    println("text3 = " + text3)

    // String templates
    val name = "Jack"
    val age = 30
    val info = "My name is $name and I am $age years old"

    println(info)

    // String interpolation
    val x = 5
    val y = 3
    val result3 = "The sum of $x and $y is ${x + y}"

    println(result3)

    // String functions and properties
    val text = "Welcome to our course"
    val length = text.length
    println("the length of text is: " + length)

    val subText = text.substring(0, 7)
    println("the substring is " + subText)

    // String comparison
    val str1 = "Hello"
    val str2 = "Hello"
    val comparisonResult = str1.equals(str2)
    println("String comparison result: " + comparisonResult)

    // String Literals
    val newLineText = "This is the first line \nThis is the second line"
    println(newLineText)


}