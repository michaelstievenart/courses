package za.co.aquarium.service

class TankStockingService {

    fun canAddFish(
        tankSize: Double,
        currentFish: List<Int>,
        fishSize: Int = 2,
        hasDecorations: Boolean = true
    ) : Boolean {
        val tankCapacity = if (hasDecorations) tankSize * 0.80 else tankSize
        val currentFishCapacity = currentFish.sum()

        return currentFishCapacity + fishSize <= tankCapacity
    }
}