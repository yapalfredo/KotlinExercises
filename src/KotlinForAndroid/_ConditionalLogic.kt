package KotlinForAndroid

fun main() {

    //immutable
    val a = 2
    val b = 3

    if (a == b) {
        println("$a is equal to $b")
    } else if (a > b) {
        println("$a is greater than $b")
    } else {
        println("$b is greater than $a")
    }


    fun checkMyMood(mood : String){
        if (mood == "angry"){
            println("Angry")
        }else{
            println("Not angry")
        }
    }

    checkMyMood("Happy")



    val x = 0
    when(x){
        1 -> println("x is equal to 1")
        2 -> println("x is equal to 2")
        else -> println("x is not equal to 1 or 2")
    }
}