typealias doubleConversion = (Double) -> Double

fun main() {

    val lam = {x: Int, y: Int -> x + y}
    val res = lam.invoke(22, 15)
    println(res)

    println(converting(20.0) { x: Double ->
        x * 1.8 + 32
    })
    println(converterFive { x: Int ->
        println("UPS!!!")
        x.toDouble()
    })

    println(getConversionLambda("CentigradeToFahrenheit")(2.5))

    println(converting(20.0, getConversionLambda("CentigradeToFahrenheit")))

    println(combine({ x: Double -> x * 5 }, { x: Double -> x * 2 })(10.0))

    val kgsToPounds = { x: Double -> x * 2.204623 }
    val poundsToUSTons = { x: Double -> x / 2000.0 }

    val kgsToUSTons = combine(kgsToPounds, poundsToUSTons)

    val usTons = kgsToUSTons(1000.0)
    println(usTons)
}

fun converting(x: Double, converter: doubleConversion): Double = converter(x)

fun converterFive(converter: (Int) -> Double): Double = converter(5)

fun getConversionLambda(str: String): doubleConversion{
    return when (str){
        "CentigradeToFahrenheit" -> { x: Double -> x * 1.8 + 32 }
        "KgsToPounds" -> { x: Double -> x * 2.204623 }
        "PoundsToUSTons" -> { x: Double -> x / 2000.0 }
        else -> { x: Double -> x }
    }
}

fun combine(lambda1: doubleConversion,
            lambda2: doubleConversion)
:doubleConversion = { x: Double -> lambda2(lambda1(x)) }