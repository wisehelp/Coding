package Baekjoon.Kotlin

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val (A, B) = reader.readLine().split(" ").map { it.toInt() }
    println(String.format("%.9f", A.toDouble() / B.toDouble()))
}