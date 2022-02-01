package codigomz.footballstatisticbackend.controller

import codigomz.footballstatisticbackend.service.BetService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/betting")  class BetController(val bet: BetService) {

    @GetMapping("/{id}/periods") fun getBettingPeriods(
        @PathVariable id: Int
    ) = bet.getBettingPeriod(id)
}
