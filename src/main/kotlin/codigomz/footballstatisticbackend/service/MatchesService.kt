package codigomz.footballstatisticbackend.service

import codigomz.footballstatisticbackend.api.Sofascore
import codigomz.footballstatisticbackend.util.*
import org.springframework.stereotype.Service
import java.util.*

@Service
class MatchesService{

    fun getSchedules(timestamp: Long) = Sofascore.getApi().getMatchesByDate(year = getYear(timestamp),
    month = getMonth(timestamp), day = getDate(timestamp)).execute().body()?.toSchedules()?.
        filter { (it.date == getDayString(timestamp)) and ((it.status == 0) or (it.status == 100)
                or (it.status == 120) or (it.status == 110))  }.orEmpty()

    fun getNextSchedules() = Sofascore.getApi().getMatchesByDate(year = getYear(
        Date().time),
        month = getMonth(Date().time), day = getDate(Date().time)).execute().body()?.toSchedules().orEmpty()
        .filter {
            (it.hasLines) and (it.status == 0)
    }

    fun getLiveSchedules() =
        Sofascore.getApi().getLiveMatches().execute().body()?.toSchedules().orEmpty()

    fun getMatch(id: Int) =
        Sofascore.getApi().getMatchById(id).execute().body()?.toSchedule()

    fun getMatchStatistics(id: Int) =
        Sofascore.getApi().getMatchStatistics(id).execute().body()?.toStatistics()

    fun getMatchLineUps(id: Int) =
        Sofascore.getApi().getMatchLineups(id).execute().body()?.toFormation()

    fun getMatchIncidents(id: Int) =
        Sofascore.getApi().getMatchIncidents(id).execute().body()?.toIncidents()

    fun getMatchGraph(id: Int) =
        Sofascore.getApi().getMatchGraph(id).execute().body()?.toGraph()

    fun getHead2Head(id: String) = Sofascore.getApi().getMatchHead2Head(id).execute().
    body()?.toSchedules().orEmpty()
}
