package codigomz.footballstatisticbackend.util

import codigomz.footballstatisticbackend.api.model.FootballLeagueStandingsAway
import codigomz.footballstatisticbackend.api.model.FootballLeagueStandingsHome
import codigomz.footballstatisticbackend.api.model.FootballLeagueStandingsTotal
import codigomz.footballstatisticbackend.model.Standings

fun FootballLeagueStandingsTotal.toTable(): Standings {
    val st = Standings()
    st.rows = this.standings?.filterNotNull()?.firstOrNull()?.rows?.filterNotNull()?.map {
        val row = Standings.StandingRow()
        row.draws = it.draws?:0
        row.losses = it.losses?:0
        row.position = it.position?:0
        row.wins = it.wins?:0
        row.points = it.points?:0
        row.promotion = it.promotion?.text?:""
        row.scored = it.scoresFor?:0
        row.scoredAgainst = it.scoresAgainst?:0
        row
    }.orEmpty()
    return st
}

fun FootballLeagueStandingsHome.toTable(): Standings {
    val st = Standings()
    st.rows = this.standings?.filterNotNull()?.firstOrNull()?.rows?.filterNotNull()?.map {
        val row = Standings.StandingRow()
        row.draws = it.draws?:0
        row.losses = it.losses?:0
        row.position = it.position?:0
        row.wins = it.wins?:0
        row.points = it.points?:0
        row.promotion = it.promotion?.text?:""
        row.scored = it.scoresFor?:0
        row.scoredAgainst = it.scoresAgainst?:0
        row
    }.orEmpty()
    return st
}

fun FootballLeagueStandingsAway.toTable(): Standings {
    val st = Standings()
    st.rows = this.standings?.filterNotNull()?.firstOrNull()?.rows?.filterNotNull()?.map {
        val row = Standings.StandingRow()
        row.draws = it.draws?:0
        row.losses = it.losses?:0
        row.position = it.position?:0
        row.wins = it.wins?:0
        row.points = it.points?:0
        row.promotion = it.promotion?.text?:""
        row.scored = it.scoresFor?:0
        row.scoredAgainst = it.scoresAgainst?:0
        row
    }.orEmpty()
    return st
}