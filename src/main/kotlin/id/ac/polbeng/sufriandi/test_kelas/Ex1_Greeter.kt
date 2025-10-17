package org.example.id.ac.polbeng.sufriandi.test_kelas

/*class Ex1_Greeter {
    fun greet() {
        println("Hello object world!")
    }
}*/

class Ex1_Greeter {
    var text: String = ""
    fun greet() {
        println("Hello object world!")
    }
    fun greet(name: String) {
        println("$text $name")
    }
    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}
fun main() {
    val greeter = Ex1_Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono"))
}