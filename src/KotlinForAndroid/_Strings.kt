package KotlinForAndroid

fun main() {

    //immutable
    val str = "may the force be with you"
    println(str)


    val str1 = "My dad said I was the funniest person on earth alive and \"Sexiest\" "
    println(str1)

    println()

    var rawMultiLineString = """A long time ago,
        |in a galaxy
        |far, far, away....
        |BUMM BUMM BUMMM""".trimMargin()

    println(rawMultiLineString)


    //looping through String
    println()
    for (char in str) {
        println(char)
    }

    //comparing variables
    val contentEquals = str.contentEquals(str1)
    println(contentEquals)

    //if variable contains
    val contains = str.contains("force",true)
    println(contains)

    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()
    println(uppercase)
    println(lowercase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4,13)
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "Green"
    val vehicle = "landspeeder"

    println("Ma name is $luke and my light saber color is $lightSaberColor and I drive $vehicle")
    println("My name is $luke and my name has ${luke.length} characters")
    println("My name is $luke and if all uppercaps it will be ${luke.toUpperCase()}")

}