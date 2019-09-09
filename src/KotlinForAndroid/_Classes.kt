package KotlinForAndroid

fun main() {
//    val car = Car("Toyota","Avalon","red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//    val truck = Truck("Ford","F150",10000)
//    truck.tow()
//    truck.details()

    val tesla = Car("Tesla", "Model S", "Red")
    tesla.accelerate()
    tesla.brake()
    tesla.park()

    val truck = Truck("Ford", "F150", 1000)
    truck.accelerate()
    truck.tow()

}

//open keyword is required as an access modifier for a class so other classes may inherit from it
open class Vehicle(val make: String, val model: String) {

    //to make it overrideable, also open keyword is required
    open fun accelerate() {
        println("Vroom Vroom")
    }

    fun park() {
        println("Parking the vehicle")
    }

    fun brake() {
        println("Stop")
    }
}

//Inheritance
class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludicrous mode!")
    }
}

//Inheritance
class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    override fun accelerate() {
        println("Gallon! Gallon! Gallon!")
    }

    fun tow() {
        println("Headed  out to the mountain")
    }
}


//Class -> Blueprint
//class Car constructor(make: String, model: String) {
//    val make = make;
//    val model = model
//}

//Easiest way to create class
//class Car (val make: String, val model: String, val color: String) {
//    fun accelerate(){
//        println("Vroom Vroom")
//    }
//
//    fun details(){
//        println("This is a $color $make $model")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int){
//    fun tow(){
//        println("Taking the horses to the rodeo")
//    }
//
//    fun details(){
//        println("This $make $model has a towing capacity of $towingCapacity pounds")
//    }
//}
