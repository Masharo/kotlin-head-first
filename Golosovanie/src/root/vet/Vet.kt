package root.vet

import root.pet.Pet

class Vet<T: Pet> {

    fun treat(t: T){
        println("Лечим животное ${t.name}")
    }
}