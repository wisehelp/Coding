package Baekjoon.Kotlin

fun main() {
    val (A,B,C) = readLine()!!.split(" ").map { it.toBigInteger() }
    print("${A+B+C}")
}