package codigomz.footballstatisticbackend.service

import codigomz.footballstatisticbackend.api.Sofascore
import codigomz.footballstatisticbackend.util.toTable
import org.springframework.stereotype.Service

@Service class LeagueService {

    fun getStandingsTotal(tid: Int, sid: Int) =
        Sofascore.getApi().getLeagueStandingsTotal(tid, sid).execute().body()?.toTable()

    fun getStandingsHome(tid: Int, sid: Int) =
        Sofascore.getApi().getLeagueStandingsHome(tid, sid).execute().body()?.toTable()

    fun getStandingsAway(tid: Int, sid: Int) =
        Sofascore.getApi().getLeagueStandingsAway(tid, sid).execute().body()?.toTable()
}