fun main(args: Array<String>) {

    //Nullable (?)
    var age: Int? = 28

    age = 45
    age = null // valid only if you specified it as Nullable

    //Unnullable (!!)
    var newAge = Int!!
    // newAge = null -> this is not allowed since you've specified that it's unnullable


    //Check if age is not equal to null if it is, make it unnullable
    if (age != null) {
        age!!
    }


    var dogs = mapOf("Fido" to 8)
    println(dogs["abc"])

    // String Nullable
    var cats: String? = "Pissie"
    cats = null


}