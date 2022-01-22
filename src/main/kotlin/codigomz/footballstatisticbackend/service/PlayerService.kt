package codigomz.footballstatisticbackend.service

import codigomz.footballstatisticbackend.api.Sofascore
import codigomz.footballstatisticbackend.api.model.FootballPlayerStatisticsOverall
import codigomz.footballstatisticbackend.util.transform
import org.springframework.stereotype.Service

@Service
class PlayerService {

    fun getAttributes(id: Int, position: String) =
        Sofascore.getApi().getPlayerAttribute(id).execute().body()?.transform(position)

    fun lastRatings(id: Int, tid: Int, sid: Int) =
        Sofascore.getApi().getPlayerLastRatings(id, tid, sid).execute().body()?.transform()

    fun getPlayerStatistics(id: Int, sid: Int, tid: Int) =
        Sofascore.getApi().getPlayerStatisticsOverall(id= id, seasonId = sid,
            uniTournaId = tid).execute().body()?.statistics?: FootballPlayerStatisticsOverall.Statistics()

}