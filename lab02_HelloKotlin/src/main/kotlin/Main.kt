fun main(args: Array<String>) {
    var score = 60
    var grade = if (score >= 80) "A" else if (score >= 70) "B" else if (score >= 60) "C" else "F"

//    grade A-F
    if (score >= 80) {
        grade = "A"
    } else if (score >= 70) {
        grade = "B"
    } else if (score >= 60) {
        grade = "C"
    } else {
        grade = "F"
    }

    println("Grade: $grade")

    val language = "th"
    when {
        language == "th" -> println("Sawasdee")
        language == "en" -> println("Hello")
        language == "cn" -> println("Ni hao")
        language == "fr" -> println("Bonjour")
        language == "jp" -> println("Konnichiwa")
        else -> println("Don't know")
    }

//    anonymous function for calc circle
    val circleArea = fun(radius: Double): Double {
        return Math.PI * radius * radius
    }
    println("Circle Area: ${circleArea(5.0)}")
    println("Hello World ${sum(10, 20)}")

    // การเขียน loop แบบ for
//    ถ้าต้องการตั้ง step ให้ใส่ step หลังจาก until
    for (i in 1..10 step 2) {
        println(i)
    }
//    loop แบบ ลดลง
    for (i in 10 downTo 1) {
        println(i)
    }

val text : String = ""
println("sad: "+ text?.plus("a") )
}

val res = repeat(10) {
    println(readln())
}
// หากมีการ return ค่า ให้ใส่เป็น Unit
fun name(name: String) {
    println(name + " Tawan")
}
fun sum(a: Int, b: Int): Int {
    return a + b
}

// short-hand fun
fun sum2(a: Int, b: Int): Int = a + b