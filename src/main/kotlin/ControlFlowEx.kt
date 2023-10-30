import java.util.Scanner

fun main() {

    //if statement
    /*println("Enter your age")

    val sc = Scanner(System.`in`)

    val age = sc.nextInt()

    if (age >= 16) {
        println("Hurray!! You can apply for Driving License")
    }else{
        println("You need to be 16 to apply for Driving License")
    }*/

    //if expression
    val a = 34
    val b = 43

    val max = if (a > b) a else b
    println("Max of ${a} and ${b} is ${max}")


    //When expression
    val reader = Scanner(System.`in`)
    /*println("Enter a number")

    val num : Int = reader.nextInt()
    when (num%2) {
        0 -> println("$num is even")
        1 -> println("$num is odd")
    }*/

    //TO DO : Write the code to greet depending on the hour
    //0to11, Good Morning, 12to16 good afternoon, 17to20 good evening, 21t0o24 good night
    /*println("Enter the hour to greet")
    when (reader.nextInt()){
        in 0..11 -> println("Good Morning")
        in 12..16 -> println("Good AfterNoon")
        in 17..20 -> println("Good Evening")
        in 21..24 -> println("Good Night")
        else -> println("Invalid hour")
    }
    val items = listOf("apple", "banana", "kiwifruit")
    for ((index, item) in items.withIndex()) {
        println("item at $index is $item")
    }
*/

    var num = 10
    while (num >= 5){
        println(num)
        num--
    }

    do {
        println(num)
        num++
    } while (num <= 5)


    //continue
    for (n in 1..5){

        println("before continue loop... $n")
        if (n == 2 || n == 4)
            continue

        println("after continue loop... $n")
    }

    //break
    for (n2 in 1..10){

        println("before break, loop $n2")
        if (n2 == 5) {
            println("I am terminating")
            break
        }
        
    }

}