package com.kotlinplayground.classes

data class Course(val id: Int, val name: String, val author: String) {
}

fun main() {
    val course = Course(1, "Reactive java", "Dilip")

    val course1 = Course(1, "Reactive java", "Dilip")

    println(course)

    println("Equality Check : ${course == course1}")

    val course3 = course1.copy(3,"Omatsola")
}