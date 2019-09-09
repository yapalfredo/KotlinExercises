package KotlinForAndroid

fun main() {
    //immutable
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")

    println(imperials)

    println(imperials.sorted())
    println(imperials.sorted()[3])
    println(imperials.first())
    println(imperials.last())

    println(imperials.contains("emperor"))
    println(imperials.contains("Luke"))

    //mutable
    var rebels = arrayListOf("Leiah", "Luke", "Hans Solo", "Mon Mothma")
    println(rebels.size)

    //Adding
    rebels.add("Chewbaca")
    println(rebels)

    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Lando"))

    //Removing
    rebels.remove("Hans Solo")
    println(rebels)

    //immutable
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap["Solo"])

    //prevents error
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesn't exist"))

    println(rebelVehiclesMap.values)

    //mutable
    var rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Bobba Fett" to "Rocket Pack")
    println(rebelVehicles)

    //updating
    rebelVehicles["Luke"] = "XWing"
    println(rebelVehicles)

    //Adding
    rebelVehicles.put("Leiah","Tantive IV")
    println(rebelVehicles)

    //Removing
    rebelVehicles.remove("Bobba Fett")
    println(rebelVehicles)

    //clearing the collections
    rebelVehicles.clear()
    println(rebelVehicles)
    println(rebelVehicles.isEmpty())
}