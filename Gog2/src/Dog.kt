fun main() {
    var dog = Dog("Barsuk", 22, "Layka")
    dog.weight = -100
    println(dog.weightInKgs)
}

class Dog(val name: String, var weight_param: Int, breed_param: String){
    init {
        println("Собака $name успешно создана.")
    }

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()
    val weightInKgs: Double
        get() = weight / 2.2

    init {
        println("Порода $name это $breed")
    }
}