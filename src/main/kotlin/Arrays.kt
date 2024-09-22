fun main() {
    val array1 = arrayOf("Douglas", "Jonas", 2)
    val names = arrayOf<String>("Douglas", "Jonas")
    println(names[0])
    names[0] = "Samira"
    println(names[1])
    println(names.size)
    if ("Jonas" in names) {
        println("Found")
    } else {
        println("Not Found")
    }
    println(names.contentToString())

    //

    val arrayOfNulls = arrayOfNulls<String>(5)
    println(arrayOfNulls.contentToString())
}