package root.Retailer

import root.pet.Cat

class CatRetailer: Retailer<Cat> {

    override fun sell(): Cat {
        return Cat("")
    }
}