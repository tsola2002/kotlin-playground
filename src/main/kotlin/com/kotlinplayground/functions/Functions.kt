package com.kotlinplayground.functions


fun printName(name: String) : Unit {
    println("Name is : $name")
}

fun addition(x: Int, y: Int): Int {
    return x+y
}

fun main() {
    val unit =  printName("Dilip")
    println("unit is: $unit")
   printName("Omatsola")
   val result = addition(1, 2)
   println("Result is $result")
}