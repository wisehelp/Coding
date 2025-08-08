fun main(){
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    var result: Long = 0
    for(i in 0 until k){
        result += (i + 1) * (n - i - 1)
    }
    result += k
    println(result)
}

