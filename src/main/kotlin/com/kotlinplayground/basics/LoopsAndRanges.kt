package com.kotlinplayground.basics

fun main() {
    // RANGES
    val range = 1 .. 10
    for (i in range) {
        println("i : $i")
    }

    // REVERSE RANGE
    val reverseRange = 10 downTo 1
    for (i in reverseRange) {
        println("reverseRange : $i")
    }

    // SKIP RANGE
    for (i in reverseRange step 2) {
        println("reverseRange with skip : $i")
    }
}