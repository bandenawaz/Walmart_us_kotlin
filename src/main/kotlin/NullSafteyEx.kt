fun main(){

    var result: String? = "Success!"
    

    //List donot accepting null values
    val nonNullableList: List<Int> = listOf(1, 2, 3, 4)

    val nullableList:List<Int?> = listOf(1, 2, 3, 4)

    //Safe cast Operator in Kotlin
    //val safeCastVariable: Int? = originalVariable as? Int

    val resultLength = if (result != null) {

        result.length
    } else{
        -1
    }

    println(resultLength)

    println(result?.length)

    //Elvis Operator ?:
    val length = result?.length ?: -1
    println(length)

    //Not-null assertion Operator  !!
    var newString: String? = null
    //newString = null

    val lng = newString!!.length

}