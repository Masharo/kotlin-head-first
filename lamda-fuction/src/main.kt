fun main() {
    val groceries = listOf( Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
                                        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
                                        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
                                        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
                                        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2))

    println(groceries.maxBy { it.unitPrice }!!.name)
    println(groceries.minBy { it.unitPrice }!!.name)

    val sum = groceries.sumBy { it.quantity }
    val sumFinal = groceries.sumByDouble { it.quantity * it.unitPrice }

    println("$sum\n$sumFinal")

    val searchIceCream = groceries.filter { it.name == "Ice cream" }
    println(searchIceCream)

    val searchNotIceCream = groceries.filterNot { it.name == "Ice cream" }
    println(searchNotIceCream)

    val newList = groceries
            .filter { it.unitPrice > 3.0 }
            .map { it.unitPrice * 2 }
    println(newList)

    var itemForEach = ""
    groceries.forEach({ itemForEach += "${it.name} | " })
    println(itemForEach)

    groceries.forEach({ println(it.name) })

    println()

    val groupingGrocery = groceries.groupBy { it.category }
    groupingGrocery.forEach {
        println(it.key)
        it.value.forEach { println("   ${it.name}") }
    }


    println()
    val ints = listOf(1, 2, 3, 4, 5)
    val sumOfInts = ints.fold(0) { Sum, Ints -> Sum + Ints }
    val modOfInts = ints.fold(1) { Mod, Ints -> Mod * Ints }

    println("Операции с элементами: $ints \nСумма: $sumOfInts \nПроизведение: $modOfInts")

    println()
    val concatName = groceries.fold("") { str, item -> str + "${item.name} " }
    println(concatName)

    println()
    val freeMoney = groceries.fold(50.0) { result, item -> result - item.unitPrice * item.quantity }
    println(freeMoney)
}