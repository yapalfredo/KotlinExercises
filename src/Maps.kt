fun main(args: Array<String>) {

    //Maps (Key value pair)

    //Immutable
//    var dogs = mapOf("Fido" to 8,"Sara" to 17, "Sean" to 6)

    //Mutable
    var dogs = mutableMapOf("Fido" to 8, "Sara" to 17, "Sean" to 6)
    println(dogs)
    println(dogs["Fido"])

    dogs["Jeremy"] = 52
    println(dogs["Jeremy"])

    // Make a map that holds 3 words and 3 definitions of slang you use
    var slang = mapOf<String, String>("FU" to "Fuck you", "BS" to "Bullshit", "WTF" to "What the fuck!")
    println(slang)

}