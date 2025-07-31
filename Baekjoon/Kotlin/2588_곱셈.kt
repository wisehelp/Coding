package Baekjoon.Kotlin

fun main() {
    val A = readLine()!!.toInt()
    val B = readLine()!!
    print("${A*Character.getNumericValue(B[2])}\n")
    print("${A*Character.getNumericValue(B[1])}\n")
    print("${A*Character.getNumericValue(B[0])}\n")
    print("${A*B.toInt()}")
}

