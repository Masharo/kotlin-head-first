fun main() {
    val people = input()
    val pc = kotlin.random.Random.nextInt(3) + 1
    val win = winer(people, pc)

    println("$win \nВы выбрали ${intToString(people)}\nКомпьютер выбрал ${intToString(pc)}")
}

fun input(): Int {
    var input: Int

    while (true) {
        print("1. Камень\n2. Ножницы\n3. Бумага\nВыберите вариант ")
        try {
            input = readLine()!!.toInt()
            if (input > 0 && input < 4) break
            else println("Возможные варианты 1, 2, 3")
        }catch (e: Exception){
            println("Ошибка $e")
        }
    }
    return input
}

fun intToString(value: Int): String {
    val result: String

    when (value){
        1 -> result = "Камень"
        2 -> result = "Ножницы"
        else -> result = "Бумагу"
    }
    return result
}

fun winer(v1: Int, v2: Int): String = if (v1 + 1 == v2 || v1 - 2 == v2) "Вы выйграли"
else if (v1 == v2) "Никто не победил" else "Компьютер выйграл"