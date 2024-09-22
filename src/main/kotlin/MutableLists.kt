fun main() {
    val names = mutableListOf(
        "Douglas", "Martins", "Viegas"
    )
    println(names[0])
    println(names.size)
    println(names.contains("Douglas"))
    println(names)
    names.remove("Martins")
    println(names)
    names.add("Marcio")
    println(names)
}