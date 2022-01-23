package codigomz.footballstatisticbackend.controller

import codigomz.footballstatisticbackend.service.MatchesService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/matches")
class MatchesController(private val matches: MatchesService) {

    @GetMapping("schedules/{time}") fun getSchedules(
        @PathVariable time: Long
    ) = matches.getSchedules(time)

    @GetMapping("/{id}") fun getSchedules(
        @PathVariable id: Int) = matches.getMatch(id)

    @GetMapping("/{id}/line") fun getScheduleLines(
        @PathVariable id: Int) = matches.getMatchLineUps(id)

    @GetMapping("/{id}/h2h") fun getLastMatches(
        @PathVariable id: String
    ) = matches.getHead2Head(id)

    @GetMapping("/{id}/graph") fun getSchedulePressure(
        @PathVariable id: Int) = matches.getMatchGraph(id)

    @GetMapping("/{id}/statistics") fun getScheduleStatistics(
        @PathVariable id: Int) = matches.getMatchStatistics(id)

    @GetMapping("/{id}/incidents") fun getScheduleIncidents(
        @PathVariable id: Int) = matches.getMatchIncidents(id)

    @GetMapping("/live") fun getLiveMatches(
        ) = matches.getLiveSchedules()
}