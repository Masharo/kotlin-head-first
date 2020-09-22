import root.Contest
import root.pet.Cat
import root.vet.Vet

fun main() {
    val cat = Vet<Cat>()
    val cont = Contest<Cat>(cat)

    cont.addScore(Cat("Misha"), 100)
    cont.addScore(Cat("Firo"), 100)
    cont.addScore(Cat("Lyalya"), 50)

    val win = cont.getWiners()

    for (i in win){
        println(i.name)
    }

    cat.treat(Cat("Lyalya"))
}