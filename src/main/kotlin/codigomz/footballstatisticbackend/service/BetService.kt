package codigomz.footballstatisticbackend.service

import codigomz.footballstatisticbackend.util.getPeriodsGraph
import org.springframework.stereotype.Service

@Service
class BetService {
    fun getBettingPeriod(teamId: Int) = getPeriodsGraph(teamId)
}