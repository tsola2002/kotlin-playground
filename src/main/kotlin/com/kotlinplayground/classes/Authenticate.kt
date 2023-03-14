package com.kotlinplayground.classes

object Authenticate {
    fun authenticate(username: String, password: String) {
        println("User authenticate for username : $username")
    }

}

fun main() {
    Authenticate.authenticate("tsola2002", "brov2002")
}