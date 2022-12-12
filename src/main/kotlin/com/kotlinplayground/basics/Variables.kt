package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevelFunction

fun main() {

    val num = topLevelFunction()
    println("Num is : $num")

    println("courseName : $courseName")

    val name : String = "Omatsola"
    println(name)

    // WILL NOT WORK
    //name = "laju"

    var age : Int = 34
    println(age)
    age = 40
    println(age)

    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("Course: $course and the course length is ${course.length}")

    val multiline = "ABC \n DEF"
    println(multiline)

    val preformat = """
        ABC
        DEF
    """.trimIndent()

    println(preformat)
}