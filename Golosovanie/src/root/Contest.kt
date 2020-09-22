package root

import root.pet.Pet
import root.vet.Vet

class Contest<T: Pet>(var vet: Vet<in T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0){
        if (score >= 0) scores.put(t, score)
    }

    fun getWiners(): MutableSet<T>{
        val max = scores.values.max()
        val winer: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores){
            if (score == max){
                winer.add(t)
            }
        }
        return winer
    }
}