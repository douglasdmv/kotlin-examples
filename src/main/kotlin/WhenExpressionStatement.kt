fun main() {
    val input = "F"

    val g = when (input) {
        "F" -> "FEMALE"
        "M" -> "MALE"
        else -> "Unknown Gender"
    }
    println(g)


    val age = 18
    when (age) {
        !in 0..12 -> println("a")
        in 13..19 -> println("Teenager")
        else -> println("Not a teenager")
    }
}