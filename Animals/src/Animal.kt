import `interface`.Roamable

abstract class Animal: Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    open var hunger: Int = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam(){
        println("Животное ходит.")
    }

    open fun sleep(){
        println("Животное спит.")
    }
}