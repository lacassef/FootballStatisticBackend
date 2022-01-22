package codigomz.footballstatisticbackend.controller

import codigomz.footballstatisticbackend.service.PlayerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/player") class PlayerController(private val player: PlayerService) {

    @GetMapping("/{id}/{tournament}/{season}/performance") fun getPlayerPerformance(
        @PathVariable id:Int, @PathVariable season: Int, @PathVariable tournament: Int
    ) = player.getPlayerStatistics(id, season, tournament)

    @GetMapping("/{id}/{tournament}/{season}/ratings") fun getPlayerLastRating(
        @PathVariable id:Int, @PathVariable season: Int, @PathVariable tournament: Int
    ) = player.lastRatings(id, tournament, season)

    @GetMapping("/{id}/{position}/attributes") fun getPlayerAttributes(
        @PathVariable id:Int, @PathVariable position: String
    ) = player.getAttributes(id, position )

}