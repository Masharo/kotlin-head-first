fun main() {
    println("POW!")

    println("\nNext")

    var x = 1
    println("Начальное значение x = $x")
    while (x < 4){
        println("Сейчас x = $x")
        x++
    }
    println("Конечное значение x = $x")

    println("\nNext")

    val value1 = 3
    val value2 = 4
    if (value1 > value2) println("$value1 больше чем $value2")
    else println("$value1 меньше чем $value2")

    println("\nNext")

    println(if (value1 > value2) "$value1 больше чем $value2" else "$value1 меньше чем $value2")
}