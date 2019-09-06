package KotlinForAndroid

fun main() {
    //immutable - can't be changed
    val name: String = "JohnnyB"

    //mutable - can be changed
    var a: Int = 3
    var b = 6
    println(a+b)

    val doubleNum: Double = 123.45
    val floatNum: Float = 123.45f
    val longNum: Long = 123456789123L
    val aDouble = a.toString()

    var hero: String
    hero = "Batman"
    hero = "Superman"
    println(hero)
}