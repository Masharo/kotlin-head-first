import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    var arr = arrayOf(Programmer("petty", 21), null, Programmer("nikita", 22))
    for (i in arr){
        println(i?.name ?: "Это null")
    }

    val FIO = arrayOf("Kutemba", "Mchanga", null)
    for (i in FIO){
        i?.let {
            println(it)
        }
    }

    println()

    val w: Wolf? = Wolf()
    if (w != null) {
        w.eat()
    }

    val x = w?.hunger
    println("The value of x is $x")

    val y = w?.hunger ?: -1
    println("The value of y is $y")

    val myWolf = MyWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    getAlphaWolf()?.let { it.eat() }

    myFunction("5")
    myFunction("dsfds")

    try {
        setWorkRatePercentage(999)
    }catch (e: ExceptionPercent){
        println(e.except)
    }

}

fun getAlphaWolf() : Wolf? {
    return Wolf()
}

fun myFunction(str: String){
    startMyFunction()

    val x = str.toIntOrNull() ?: 0
    println(x)

    str.toIntOrNull()?.let{
        println("Это не нулл")
    }

    try {
        val tr = str.toInt()
    }catch (e: NumberFormatException){
        println("Except: $e")
        //e.printStackTrace()
    }finally {
        endMyFunction()
    }
}

fun setWorkRatePercentage(value: Int){
    if (value !in 0..100){
        throw ExceptionPercent("Не в промежутке от 0 до 100\nValue is not located in range of 0 to 100")
    }
}

fun endMyFunction() = println("Конец выполнения MyFunction")

fun startMyFunction() = println("Начало выполнения MyFunction")