package com.kotlinplayground.classes

class Person(val name: String = "", val age: Int = 0) {
          // FIELDS
          var email: String = ""
          var nameLength: Int = 0
          // ADDING INIT BLOCK
          init{
              println("Inside init block")
              nameLength = name.length
          }


          // CONSTRUCTOR IN KOTLIN
          constructor(_email: String, _name: String = "", _age: Int = 0): this(_name, _age) {
              email = _email
          }

          // CLASS METHOD
          fun action() {
              println("Person Walks")

          }
}

// EXECUTABLE FOR THE CLASS
fun main() {
   // Creating class instance
   val person = Person("Alex", 25)
   person.action()

    println(person)

   // printing instance values
   println("Name : ${person.name} and age is ${person.age}")

    val person1 = Person()

    val person2 = Person("richardlesnar@gmail.com", "Richard", 40)

   println(
       "Name : ${person2.name} and age is ${person2.age} and the email is ${person2.email} and nameLength is ${person2.nameLength}"
   )
}

