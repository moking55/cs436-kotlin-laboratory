fun main() {
//  immutable variable
    val name: String = "Kotlin"
    val lastname = "Lang"

//  mutable variable
    var weight: Double = 2.5
    var age = 4
    age = 5

//  array declaration
    val FavoriteFruits = arrayOf("Apple", "Banana", "Orange")
    val FavoriteNumbers = arrayOfNulls<Int>(size = 3)
    val c = Array<String>(size = 5, init = { i -> "CSMJU ${i + 1}" })
    FavoriteNumbers[1] = 2; FavoriteNumbers[0] = 7

    for ((index, value) in FavoriteNumbers.withIndex()) {
        println("FavoriteNumbers[$index] = $value")
    }


//    simple lambda
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))

//  map declaration and usage
//    explain: https://www.programiz.com/kotlin-programming/map
    var x = mapOf(Pair("a", 1), Pair("b", 2), Pair("c", 3))
    println(x["b"])
//    var radius: String = readln()

    println(
        """
        Hello, $name!
        You are $age years old!
        Your weight is $weight kg.
    """.trimIndent()
    )
    println(FavoriteFruits)
//    println("Hello, $name! You are $age years old! Your weight is $weight kg.")
}

fun calcCircleArea(radius: Double): Double {
    return Math.PI * radius * radius
}