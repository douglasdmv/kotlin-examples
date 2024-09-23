fun main() {
    val names = listOf("mary", "ali", "alex")
    val numbers = intArrayOf(1,2,3,4,5)
    val letters = charArrayOf('a','b','c','d','e')

    for (name in names) {
        val n = name.replaceFirstChar { it.uppercase() }
        println(n)
    }
    for (number in numbers) println(number)

    //trazer posição dos índices
    for (index in letters.indices) {
        println("$index - ${letters[index]}")
    }
    println("reverse")
    for (index in letters.indices.reversed()) {
        println("$index - ${letters[index]}")
    }

    //Loops Range
    println("range")
    for (i in 1..5) println(i)
    println("downTo")
    for (i in 5 downTo 1) println(i)
    println("steps")
    for (i in 1..5 step 2) println(i)

}