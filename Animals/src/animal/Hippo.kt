package animal

import Animal

class Hippo: Animal() {
    override val image = "hippo.jpg"
    override val food = "трава"
    override val habitat = "вода"

    override fun makeNoise() {
        println("Гааааа! Гаааааа!")
    }

    override fun eat() {
        println("Бегимот ест $food.")
    }
}