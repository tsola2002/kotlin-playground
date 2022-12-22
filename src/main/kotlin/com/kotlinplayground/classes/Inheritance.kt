package com.kotlinplayground.classes

// OPEN MODIFIER MAKES THIS CLASS EXTENDABLE
open class User(val name: String){
    open var isLoggedIn: Boolean = false


    open fun login(){
        println("Inside user class login function")
    }

}

class Student(name: String) : User(name){

    // OVERRIDING A VARIABLE
    override var isLoggedIn: Boolean = false


    // OVERRIDING A FUNCTION
    override fun login(){
        println("Inside Student class login function")

        // CALLING PARENT LOGIN FUNCTION USING SUPER KEYWORD
        super.login()
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Alex")
    println("student name is: ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("loggedIn is: ${student.isLoggedIn}")

    val instructor = Instructor("Mayowa")
    println("instructor name is: ${instructor.name}")
    instructor.login()
}