package root.Retailer

import root.pet.Dog

class DogRetailer: Retailer<Dog> {

    override fun sell(): Dog {
        return Dog("")
    }
}