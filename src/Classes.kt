import java.awt.Color

fun main(args: Array<String>) {

    //Classes

//    class Dog{
//        var name = ""
//        var age = 0
//    }

    //Another way of doing it
    class Dog {
        var name: String = ""
        var age: Int = 0
    }

    //Some forms of doing it too
    class Dog2(var name: String, var age: Int) {
    }

    //CLass with Constructor
    class Dog3 {
        var name: String
        var age: Int

        constructor(name: String, age: Int) {
            this.name = name;
            this.age = age
        }

        constructor() {
            name = ""
            age = 0
        }

        fun dogInfo() {
            println("$name is $age years old")
        }
    }

    // Add a new property called furColor to the dog class and update with dogInfo()
    class Dog4 {
        var name: String
        var age: Int
        var furColor: String

        constructor(name: String, age: Int, furColor: String) {
            this.name = name
            this.age = age
            this.furColor = furColor
        }

        fun dogInfo() {
            println("Your dog's name is $name, $age years of age, and its fur color is $furColor.")
        }
    }


    //Creating object
    var myDog = Dog()
    myDog.age = 5
    myDog.name = "Bingo"


    var myDog2 = Dog2("Rambo", 3)
    var myDog3 = Dog3("Malou", 6)
    myDog3.dogInfo()


    println()
    var myDog4 = Dog4("Russell", 5, "Brown")
    myDog4.dogInfo()


}