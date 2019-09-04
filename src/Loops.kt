fun main(args: Array<String>) {


    //For loops
    for(x in 1..10){
        println(x)
    }

    println()

    for (yprime in 5..8){
        println(yprime)
    }

    var favCandies = listOf("Snickers", "Mars chocolates","M&Ms chocolate")

    println()
    for (candy in favCandies){
        println(candy)
    }

    // loop through the number 1 to 200 print out all odd numbers
    for (x in 1..200){
        if(x % 2 == 1){
            println(x)
        }
    }
}