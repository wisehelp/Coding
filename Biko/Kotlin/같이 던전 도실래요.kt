package Biko.Kotlin

fun main(){
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val t = readLine()!!.split(" ").map { it.toInt() }.sorted()

    var result: Long = 0
    for(i in 0 until n){
        val a = t[2 * i]
        val b = t[2 * i + 1]
        val mint = minOf(a, b)
        val clear = mint / m
        val s = 2L * mint
        result += s * clear
    }
    println(result)

}
