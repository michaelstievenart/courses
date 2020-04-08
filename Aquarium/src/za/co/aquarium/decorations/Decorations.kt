package za.co.aquarium.decorations

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    val d2 = Decorations("slate")
    val d3 = Decorations("slate")
    val d4 = Decorations2("1", "2", "3")

    val (rocks, wood, diver) = d4
    print(rocks)
    print(wood)
    print(diver)
}

data class Decorations(val rocks: String)
data class Decorations2(val rocks: String, val wood: String, val diver: String)


object MobyDick {
    val author = "Herman Melville"
}

enum class Color(val rgb: Int) {
    RED(0xFF000)
}

sealed class Seal

class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lin"
    }
}
