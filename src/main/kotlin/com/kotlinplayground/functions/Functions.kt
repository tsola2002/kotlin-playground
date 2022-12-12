package com.kotlinplayground.functions

import java.time.LocalDate


fun printName(name: String) : Unit {
    println("Name is : $name")
}

fun addition(x: Int, y: Int): Int {
    return x+y
}

fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate =  LocalDate.now()
){
    println("Name is $name and email is $email and dob is $dob")
}

fun main() {
    printPersonDetails("Dilip", "abc@gmail.com", LocalDate.parse("2000-01-01"))
    printPersonDetails("Mofyjoe")
    val unit =  printName("Dilip")
    println("unit is: $unit")
   printName("Omatsola")
   val result = addition(1, 2)
   println("Result is $result")
}