fun main(){
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    var result: Long = 0
    for(i in 0 until k){
        result += (i + 1L) * (n - i - 1L)
    }
    result += k
    println(result)
}

