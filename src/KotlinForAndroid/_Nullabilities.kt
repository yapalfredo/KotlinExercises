package KotlinForAndroid

fun main() {


    var name: String = "Abdul"
    //name = null  ---> won't work

    //Proper way of initializing nullable variable
    var nullableName: String? = "ICanBeNUlled"
    println(nullableName)
    //  println(nullableName.length)  ---> won't work on nullable
    //nullableName = null
    println(nullableName)


    //null check
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)


    //one way of writing the above code
    val l = if (nullableName != null) nullableName.length else -1

    //second method safe call operator?
    println(nullableName?.length)


    //Third method is Elvis operator
    val len = nullableName?.length ?: - 1
    val noName  = nullableName ?: "No one knows me..."

    println(noName)

    // !! --> only use this when you know that the value exists
   println(nullableName!!.length)
}