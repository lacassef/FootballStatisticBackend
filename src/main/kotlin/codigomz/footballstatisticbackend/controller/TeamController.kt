package codigomz.footballstatisticbackend.controller

import codigomz.footballstatisticbackend.service.TeamService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/team") class TeamController(private val team: TeamService) {

    @GetMapping("/{id}/{tournament}/{season}/statistics") fun getPerformance(
        @PathVariable id: Int, @PathVariable tournament: Int, @PathVariable season: Int
    ) = team.getStatistics(id, tournament, season)

    @GetMapping("/{id}/last") fun getLastMatches(
        @PathVariable id: Int) = team.getLastMatches(id)
}