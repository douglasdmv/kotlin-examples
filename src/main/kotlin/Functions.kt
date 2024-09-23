fun main() {
    greet(age = 25, name = "Jamila")
    greet("Douglas", 15)
    greet("Marcio")
    println(double(10))

    val (v1, v2) = twoValues()
    val (t1, t2, t3) = threeValues()
}

//fun double(n: Int) : Int {
//    return n * 2
//}
//Outra maneira
fun double(n: Int): Int = n * 2

fun greet(name: String, age: Int = -1) {
    println("Hello $name!")
    if (age == -1) {
        println("age not provided")
    }
    else if (age >= 16) {
        println("$name is an adult")
    } else {
        println("$name is not an adult")
    }
}

fun twoValues(): Pair<String, Int> =
    "Amigos" to 20

fun threeValues():
        Triple<String, Int, Char> {
    return Triple("Marcio", 15, 'c')
}