fun main(){

    val num1: Int = 100
    val num2: Long = num1.toLong()
    println(num2)

    //TODO:Double to Int type casting
    val a: Double = 98.76545
    println("Converting Double to Int: "+a.toInt())

    //TODO:Int to Char type casting and vice versa
    val b: Int = 66
    println("Converting Int to Char: "+b.toChar())
    println("Converting Char to Int: "+('B'.code))

    val x: Long = 4533704708800999
    val y: Int = x.toInt()

    println("X is : ${x}")
    println("Y is : ${y}")
    val z: Long = 45337
    val w:Int = z.toInt()
    println("Z is : ${z}")
    println("W is : ${w}")

    

}