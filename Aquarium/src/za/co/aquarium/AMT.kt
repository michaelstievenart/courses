package za.co.aquarium

import za.co.aquarium.service.FishFeedingService
import za.co.aquarium.service.TankStockingService

fun main(args: Array<String>) {
    val fishFeedingService = FishFeedingService()
    val tankStockingService = TankStockingService()
    fishFeedingService.feed()
}
