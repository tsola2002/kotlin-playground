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

    companion object {
        // static variable within a class
        const val noOfEnrolledCourses = 10

        //static function within a class
        fun country() = "USA"
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

    val country =  Student.country()
    println("Country is : $country")

    val enrolled = Student.noOfEnrolledCourses
    println("Enrolled courses is : $enrolled")
}