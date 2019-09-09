package KotlinForAndroid

fun main() {
    //mutable
    var rebels = arrayListOf("Leiah", "Luke", "Hans Solo", "Mon Mothma")

    for (rebel in rebels) {
        println(rebel)
    }

    //mutable
    var rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Bobba Fett" to "Rocket Pack")
    for ((key, value) in rebelVehicles) {
        println("$key gets around in their $value")
    }

    var x = 10
    while (x > 0){
        println(x)
        x--
    }

}