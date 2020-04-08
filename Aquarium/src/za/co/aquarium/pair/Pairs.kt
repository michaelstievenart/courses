package za.co.aquarium.pair

class Pair {


    fun test () {
        val item1 = "1" to "1 value"
        val item2 = ("1" to "1 value") to ("2" to "2 value")
        val (tool, use) = item1

        val item3 = "1" to "2" to "3"
    }

}
