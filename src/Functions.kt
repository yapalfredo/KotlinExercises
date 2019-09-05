fun main(args: Array<String>) {

    //functions
    fun hello() {
        println("Hello Function")
    }

    //With return value
    fun returnValue(): Int {
        return 1 + 1
    }

    //with parameters
    fun withParam(name: String): String {
        return "Hello $name"
    }

    //With parameters and default
    fun withParamAndDefault(num: Int = 0): Int {
        return 5 + num
    }

    // Easier way of doing function with return value
    fun addNumber(num1: Int = 0, num2: Int = 0) = num1 + num2

    // Make a function that takes a dog's name and age, and prints a sentence about it

    fun dogInfo(name: String, age: Int): String {
        return "Your dog's name is $name, and its age is $age"
    }


    hello()
    println(returnValue())
    println(withParam("Alfredo"))

    println(withParamAndDefault())

    println(addNumber(5, 10))

    println(dogInfo("Bingo",2))
}