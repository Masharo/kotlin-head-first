package root.Retailer

import root.pet.Pet

interface Retailer<T: Pet> {

    fun sell(): T
}