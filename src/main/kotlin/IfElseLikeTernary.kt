fun main() {
    val n1 = 10
    val n2 = 20

    //Em Java: var result = n1 >= n2 ? ":)" : ":("
    val result = if (n1 > n2) ":)" else ":("
    println(result)
    val result2 =
        if (n1 > n2) ":)" 
        else if (n1 == 100) "no"
        else ":("
}