package za.co.aquarium.service

class WaterMonitoringService {

    fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = getDirtySensorReading()
    ): Boolean {
        return when {
            isTooHot(temperature) -> true
            isDirty(dirty) -> true
            isSunday(day) -> true
            else -> false
        }
    }

    private fun getDirtySensorReading() = 20
    private fun isTooHot(temperature: Int) = temperature > 30
    private fun isDirty(dirty: Int) = dirty > 30
    private fun isSunday(day: String) = day == "Sunday"
}