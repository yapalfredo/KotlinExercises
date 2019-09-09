package KotlinForAndroid

fun main() {

    //lambda always in curly braces
    val printMessage = { message: String -> println(message) }

    printMessage("Hello World")

    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(1, 5))

    //cleaner version
    val sumB: (Int, Int) -> Int = { x, y -> x + y }
    println(sumB(6, 10))

    //Unit is the equivalent of Void in Java (return nothing)
    fun downloadData(url: String, completion: () -> Unit) {
        // sent a download request
        // we got back data
        // there were no network errors

        completion()

    }

    // Call downloadDataFunction
    downloadData("fakeUrl.com", {
        println("The code in this block will only run" +
                "after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // send a download request
        // we got back car data
        val car = Car("Tesla", "Model X", "Blue")
        completion(car)
    }

    downloadCarData("FakeUrl.com") {
        println(it.color)
        println(it.make)
    }

    downloadCarData("FakeUrl.com") { car ->
        println(car.color)
        println(car.make)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        // make the web request
        // we get the results back
        val webRequestSuccess = false
        if (webRequestSuccess) {
            // received truck data
            val truck = Truck("Ford","F-150",10000)
            completion(truck, true)
            }else{
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com"){ truck, success ->
        if (success == true){
            //do something with our truck
            truck?.tow()
        }else {
            // handle the web request failure
            println("Something went wrong!")
        }
    }

}