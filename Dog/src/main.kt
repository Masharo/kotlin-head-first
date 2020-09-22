fun main() {
    val dog = Dog("Chappi", "Terer")
    println(dog.name)
    println(dog.weight)
    dog.bark()
    dog.weight = 25
    println(dog.weight)
    dog.bark()
    println()

    val moreGog = arrayOf(Dog("Baron", "Mixed", 16), Dog("Laura", "Poodle"))

    for (i in moreGog){
        println(i.name)
        i.bark()
        println()
    }
}

class Dog(val name: String, val breed: String, var weight: Int = 10){
    fun bark(){
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}