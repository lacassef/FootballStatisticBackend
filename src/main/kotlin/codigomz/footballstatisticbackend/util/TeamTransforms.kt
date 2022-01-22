package codigomz.footballstatisticbackend.util

import codigomz.footballstatisticbackend.api.model.FootballTeamLastMatches
import codigomz.footballstatisticbackend.model.Schedule
import codigomz.footballstatisticbackend.model.Team
import codigomz.footballstatisticbackend.model.Tournament

fun FootballTeamLastMatches.transform(): List<Schedule>? {
    return this.events?.filterNotNull()?.filter { (it.status?.code) == 100 }?.filter {
        it.tournament?.uniqueTournament?.hasEventPlayerStatistics == true
    }?.map {
        Schedule(
            id= it.id?:0, home = Team(it.homeTeam?.name?:"", it.homeTeam?.shortName?:"",
                it.homeScore?.normaltime?:0, it.homeTeam?.id?:0),
            away = Team(it.awayTeam?.name?:"", it.awayTeam?.shortName?:"",
                it.awayScore?.normaltime?:0, it.awayTeam?.id?:0),
            tournament = Tournament(name = it.tournament?.uniqueTournament?.name?:"",
                country = it.tournament?.uniqueTournament?.category?.name?:"",
                id = it.tournament?.uniqueTournament?.id?:0 ),
            status = it.status?.code?:0, date = getDayString(it.startTimestamp?:0),
            time = getTimeString(it.startTimestamp?:0),
            hasLines = it.hasEventPlayerStatistics?:false,
            customId = it.customId?:""
        )
    }
}