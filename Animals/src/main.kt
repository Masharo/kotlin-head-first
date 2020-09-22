import animal.Hippo
import animal.canine.Wolf

fun main() {
    val animals = arrayOf(Hippo(), Wolf())
    for (i in animals){
        i.roam()
        i.eat()
    }

    val vet = Vet()
    vet.giveShot(animals[0])
    vet.giveShot(animals[1])

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (i in roamables){
        i.roam()
        if (i is Animal) {
            i.eat()
        }
    }
}