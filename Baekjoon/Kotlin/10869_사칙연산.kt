package Baekjoon.Kotlin

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(String.format("%d\n%d\n%d\n%d\n%d",a+b,a-b,a*b,a/b,a%b))
}