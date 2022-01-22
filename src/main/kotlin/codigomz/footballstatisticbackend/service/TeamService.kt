package codigomz.footballstatisticbackend.service

import codigomz.footballstatisticbackend.api.Sofascore
import codigomz.footballstatisticbackend.util.transform
import org.springframework.stereotype.Service

@Service class TeamService {

    fun getLastMatches(id: Int) =
        Sofascore.getApi().getLastMatchesByTeamId(id, 0).execute().body()?.transform()

    fun getStatistics(id: Int, tournamentId: Int, seasonId: Int) =
        Sofascore.getApi().getTeamOverallStatisticsById(id, tournamentId, seasonId).execute().body()?.statistics
}