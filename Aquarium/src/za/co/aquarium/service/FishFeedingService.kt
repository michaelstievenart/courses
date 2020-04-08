package za.co.aquarium.service

import java.lang.RuntimeException
import java.util.*

class FishFeedingService {

    private val waterMonitoringService = WaterMonitoringService()

    fun feed() {
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")

        val shouldChangeWater = waterMonitoringService.shouldChangeWater(day)
        if (shouldChangeWater) {
            println("Change the water today")
        }

        dirtyProcessor()
    }

    fun swim(speed: String = "fast") {
        println("swimming $speed")
    }

    fun feedFish(dirty: Int) = dirty + 10

    private fun dirtyProcessor() {
        var currentDirtyValue = 20
        val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
        currentDirtyValue = updateDirty(currentDirtyValue, waterFilter)
        currentDirtyValue = updateDirty(currentDirtyValue, ::feedFish)
        currentDirtyValue = updateDirty(currentDirtyValue) { dirty -> dirty + 50 }
    }

    private fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }

    private fun fishFood(day: String): String {
        return when (day) {
            "Monday" -> "flakes"
            "Tuesday" -> "pellets"
            "Wednesday" -> "red worms"
            "Thursday" -> "granules"
            "Friday" -> "mosquitoes"
            "Saturday" -> "lettuce"
            "Sunday" -> "plankton"
            else -> "fasting"
        }
    }

    private fun randomDay(): String {
        val weekDays = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        return weekDays[Random().nextInt(7)]
    }

    private fun dayOfTheWeek() {
        val dayOfTheWeek = when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
            0 -> "Saturday"
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            else -> throw RuntimeException("Failed to find a valid day of the week")
        }
        println(dayOfTheWeek)
        //println("${ if (args[0].toInt() < 12) "Good Morning" else "Good Evening"} Kotlin")
    }
}