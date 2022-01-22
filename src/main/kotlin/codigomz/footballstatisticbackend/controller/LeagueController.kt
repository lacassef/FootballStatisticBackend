package codigomz.footballstatisticbackend.controller

import codigomz.footballstatisticbackend.service.LeagueService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/league") class LeagueController(val league: LeagueService) {

    @GetMapping("/{tournament}/{season}/standings") fun getStandingsTotal(
       @PathVariable season: Int, @PathVariable tournament: Int
    ) = league.getStandingsTotal(tournament, season)

    @GetMapping("/{tournament}/{season}/standings/home") fun getStandingsHome(
        @PathVariable season: Int, @PathVariable tournament: Int
    ) = league.getStandingsHome(tournament, season)

    @GetMapping("/{tournament}/{season}/standings/away") fun getStandingsAway(
        @PathVariable season: Int, @PathVariable tournament: Int
    ) = league.getStandingsAway(tournament, season)

}