fun main(args: Array<String>) {

    //mutable variable
    var age = 28
    age = 30

    //immutable variable
   // val age2 = 30
   // age2 = 50         ---> will cost error
    
    //Explicit for Int
    var age2: Int =  0

    //for String
    var name: String = "Alfredo"

    //String interpolation
    println("I am $age years old, my name is $name")


}