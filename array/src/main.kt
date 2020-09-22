import sun.security.ec.point.ProjectivePoint

fun main() {
    array()
    list()
    headFirst()
}

fun headFirst(){
    println("Start Head First")
    var mut = mutableListOf("Tea", "Eggs", "Milk")
    val lis = listOf("Cookies", "Sugar", "Eggs")

    println("Mutable list: $mut")
    println("List: $lis")

    mut.addAll(lis)
    println("New mutable list: $mut")

    if (mut.contains("Tea")){
        mut.set(mut.indexOf("Tea"), "Coffee")
    }

    mut.sort()
    println("Mutable sorted: $mut")

    mut.reverse()
    println("Mutable resorted: $mut")
    println()

    val se = setOf("Sue", "Jim", "Sue", "Nick", "Nick")
    println("Set: $se")
    println()

    val mutS = mut.toMutableSet()
    println("Mutable set: $mutS")

    val newSet = setOf("Chives", "Spinach", "Milk")
    mutS.addAll(newSet)
    println("New mutable set: $mutS")

    mut = mutS.toMutableList()
    println("New mutable list: $mut")
    println()

    val ma = mapOf("Name" to "Nikita", "Last name" to "Tokarev", "Middle name" to "Andreevich")
    println(ma.entries)
    println()

    val r1 = Reciple("Ce r1")
    val r2 = Reciple("Ce r2")
    val r3 = Reciple("Ce r3")
    val r4 = Reciple("Ce r4")
    val r5 = Reciple("Ce r5")

    val rMap = mutableMapOf("Reciple 1" to r1, "Reciple 2" to r2, "Reciple 3" to r3)
    println("rMap: $rMap")

    val rMapNext = mapOf("Reciple 4" to r4, "Reciple 5" to r5)
    rMap.putAll(rMapNext)
    println("rMap: $rMap")

    if (rMap.containsKey("Recipe1")) {
        println("Recipe1 is: ${rMap.getValue("Recipe1")}")
    }

    println("End Head First")
}

fun array(){
    println("Array start")

    val arr = arrayOf(3, 1, 2, 9, 0, 4, 3, 2)

    println("Есть ли 1: ${arr.contains(1)}")
    println("Сумма: ${arr.sum()}")
    println("MAX: ${arr.max()}")
    println("min: ${arr.min()}")
    println("Среднее: ${arr.average()}")

    println("Array end\n")
}

fun list(){
    println("List start")

    val li = listOf("Nikita", "Tokarev", "Andreevich")
    for (i in li) println(i)

    val lim = mutableListOf("Nikita", "Tokarev")
    lim.add("Andreevich2")
    for (i in lim) println(i)

    println(li.size)
    println("List end")
}

data class Reciple(var name: String)