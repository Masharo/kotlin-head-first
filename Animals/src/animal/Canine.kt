package animal

import Animal

abstract class Canine: Animal() {

    override fun roam() {
        println("Собака бродит.")
    }
}