package codigomz.footballstatisticbackend.util

import codigomz.footballstatisticbackend.api.Sofascore
import codigomz.footballstatisticbackend.model.*

fun getPeriodsGraph(teamId: Int) {
    val lastMatches = Sofascore.getApi().
    getLastMatchesByTeamId(teamId, 0).execute().body()?.events?.filterNotNull()?.
    filter { ((it.status?.code) == 100) or ((it.status?.code) == 120) or ((it.status?.code) == 110) }
        ?.filter {
        it.tournament?.uniqueTournament?.hasEventPlayerStatistics == true
    }

}
