fun main() {
    val tv = SmartDevice("Samsung", 1000.0)
//    tv.brand = "Samsung"
//    tv.price = 1000.0
    println("${tv.brand} - ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()

    val phone = SmartDevice("Apple", 1200.0)
    phone.brand = "Apple"
    phone.price = 1200.0
    println("${phone.brand} - ${phone.price}")
    phone.turnOff()
    phone.getDeviceState()
}

class SmartDevice constructor(
    // properties
    var brand: String,
    var price: Double,
    var isSwitchedOn: Boolean = false
){
    // method/functions
    fun getDeviceState() {
        println("$brand is on: ${isSwitchedOn}")
    }
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on")
    }
    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off")
    }
}