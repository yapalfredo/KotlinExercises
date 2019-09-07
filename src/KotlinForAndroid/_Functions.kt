package KotlinForAndroid

fun main() {

    fun forceChoke(): String {
        return "empty"
    }

    fun sayHelloWorld() {
        println("Hello World")
    }

    sayHelloWorld()
    println("I am ${forceChoke()}")

    fun printMessage(line: String) {
        println(line)
    }

    printMessage("I'm very focused on becoming an Android Developer")

    //function shortcut
    fun calculate(num1: Int, num2: Int): Int = num1 + num2

    val num1 = 2
    val num2 = 3
    println("$num1 + $num2 = ${calculate(num1,num2)}")

}