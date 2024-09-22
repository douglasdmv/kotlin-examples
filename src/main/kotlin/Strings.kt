fun main() {
    var name = "Douglas"
    var age = 18
    val msg = "Name $name, Age $age"
    println(msg)
    val msg2 = "Name ${name.uppercase()}, Age ${age + 1} "
    println(msg2)

    val email = """
        Hello %s
          How
        Are You
    """.trimIndent()
    println(email.format("Ana"))

    //Comparação de Strings
    val name1 = "Douglas"
    val name2 = "Viegas"
    //Cria um novo objeto
    val name3 = String("Douglas".toCharArray())
    // Compara apenas a string
    println("== ${name1 == name2}")
    // Compara a alocação de memória
    println("=== ${name1 === name2}")
    println(".equals ${name1.equals(name3)}")
}