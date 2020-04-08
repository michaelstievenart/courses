package za.co.aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark() : AquariumFish(), FishAction {
    override val color: String get() = "gray"
    override fun eat() {
        println("Eats fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor) :
    FishAction by PrintingFishAction("Eats algae"),
    FishColor by fishColor

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color: String
        get() = "gold"
}

object RedColor : FishColor {
    override val color: String
        get() = "red"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }

}