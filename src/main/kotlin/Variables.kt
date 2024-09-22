const val PI = 3.14 // static final
val pi = getPiValue()

fun main() {

    //var s: String = "Douglas"
    //Não é recomendado declarar os tipos com no exemplo acima
    var s = "Douglas"
    var n = 18
    var l = 100L
    var d = 3.14
    var f = 3.14F
    var b = true
    var c = 'A'
    println("Name: $s")
    println("Age: $n")

    //Any type
    var number: Any = 10
    var name: Any = "Jonas"

    //Val vs Var
    //Utilizando val, não é possível mudar o conteúdo da variável criada
    var brandVar = "Amigoscode"
    brandVar = "CodeWithAmigoscode"
    val brandVal = "Amigoscode"
    //Náo é possível realizar o código abaixo
    //brandVal = "CodeWithAmigoscode"

    //Null variables
    var brand: String? = null
    //A ? protege o códico de causar uma NullpointerException
    println(brand?.uppercase())

}

fun getPiValue(): Double = 3.14