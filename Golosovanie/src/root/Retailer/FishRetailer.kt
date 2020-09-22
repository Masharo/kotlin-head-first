package root.Retailer

import root.pet.Fish

class FishRetailer: Retailer<Fish> {

    override fun sell(): Fish {
        return Fish("")
    }
}