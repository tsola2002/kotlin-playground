package com.kotlinplayground.basics

fun main() {
    //if-else

    var name = "Alex"
    // name = "Chloe"
    val result = if(name.length == 4) {
        println("Name is four characters")
        name.length
    } else {
        println("Name is not four characters")
        name.length
    }

    println("result $result")

    // WHEN BLOCK
    var position = 2

    val medal = when (position) {
        1 -> {
            "GOLD"
        }
        2 -> {
            "SILVER"
        }
        3 -> {
            "BRONZE"
        }
        else -> {
            "NO MEDAL"
        }
    }

    println(medal)

//    val medal = if(position == 1 ) {
//        "GOLD"
//    } else if(position == 2){
//        "SILVER"
//    } else if (position == 3) {
//        "BRONZE"
//    } else {
//        "NO MEDAL"
//    }

}