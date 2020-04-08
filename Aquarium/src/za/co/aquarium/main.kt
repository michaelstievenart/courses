package za.co.aquarium


fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val aquarium = Aquarium()
    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    val other = Aquarium(numberOfFish = 5)
    println("Volume: ${smallAquarium.volume}")
}
fun makeFish() {
    val shark = Shark()
    val plecostomus = Plecostomus()

    shark.eat()
    plecostomus.eat()
}
