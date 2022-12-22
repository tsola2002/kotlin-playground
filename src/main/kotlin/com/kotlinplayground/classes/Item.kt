package com.kotlinplayground.classes

import java.lang.IllegalArgumentException

class Item() {
    var name : String = ""
    var price : Double = 0.0

    // GETTER METHOD
    get(){
        println("Inside Getter")
        return field
    }

    // SETTER METHOD
    set(value) {
        println("Inside Setter")
        if (value>=0.0){
            field = value
        } else{
            throw IllegalArgumentException("Negative price is not Allowed")
        }
    }

    //SECONDARY CONSTRUCTOR
    constructor(_name : String) : this() {
        name = _name
    }
}

fun main() {
    // creating new instance of the class
    val item = Item("Iphone")
    println("Item name is ${item.name}")

    item.name = "Iphone 13"
    println("item name is now ${item.name}")

    item.price = 10.0
    println(item.price)
}