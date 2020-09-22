package animal.canine

import animal.Canine

open class Wolf: Canine() {
    override val image = "wolf.jpg"
    override val food = "мясо"
    override val habitat = "лес"

    override fun makeNoise() {
        println("Вуууууф!")
    }

    override fun eat() {
        println("Волк ест $food.")
    }
}