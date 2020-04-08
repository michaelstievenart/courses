package za.co.aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int = if (friendly) {
        volumeNeeded
    } else {
        volumeNeeded * 2
    }

    init {
        print("Called before any secondary constructors")
    }

    constructor(): this(true, 9) {
        println("secondary")
    }

}

fun fishExample() {
    val fish = Fish(true, 20)
    print("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}