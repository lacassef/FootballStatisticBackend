package codigomz.footballstatisticbackend.util

import codigomz.footballstatisticbackend.api.model.*
import codigomz.footballstatisticbackend.model.*

fun FootballEventsByDate.toSchedules(): List<Schedule>? {
    return this.events?.filterNotNull()?.filter {
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

fun FootballLiveMatches.toSchedules(): List<Schedule>? {
    return this.events?.filterNotNull()?.filter {
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
            hasLines = true,
            customId = it.customId?:""
        )
    }
}

fun FootballMatchById.toSchedule(): Schedule? {
    return this.event?.let {
        Schedule(
            id= it.id?:0, home = Team(it.homeTeam?.name?:"", it.homeTeam?.shortName?:"",
                it.homeScore?.normaltime?:0, it.homeTeam?.id?:0),
            away = Team(it.awayTeam?.name?:"", it.awayTeam?.shortName?:"",
                it.awayScore?.normaltime?:0, it.awayTeam?.id?:0),
            tournament = Tournament(name = it.tournament?.uniqueTournament?.name?:"",
                country = it.tournament?.uniqueTournament?.category?.name?:"",
                id = it.tournament?.uniqueTournament?.id?:0, season = it.season?.id?:0),
            status = it.status?.code?:0, date = getDayString(it.startTimestamp?:0),
            time = getTimeString(it.startTimestamp?:0),
            customId = it.customId?:""
        )
    }
}

fun FootballMatchStatistics.toStatistics(): ScheduleStatistics {
    val stats = ScheduleStatistics()
    stats.periods = this.statistics?.filterNotNull()?.map {
        getStatisticsPeriod(it)
    }.orEmpty()
    return stats
}

fun FootballMatchLineup.toFormation(): ScheduleLineup {
    val m = ScheduleLineup()
    m.confirmed = this.confirmed?:false
    m.home.formation = this.home?.formation?:""
    m.away.formation = this.away?.formation?:""
    m.home.players = this.home?.players?.filterNotNull()?.getHomePlayers()?: listOf()
    m.home.missingPlayers = this.home?.missingPlayers?.filterNotNull()?.getHomeMissingPlayers()?: listOf()
    m.away.players = this.away?.players?.filterNotNull()?.getAwayPlayers()?: listOf()
    m.away.missingPlayers = this.away?.missingPlayers?.filterNotNull()?.getAwayMissingPlayers()?: listOf()
    return m
}

fun FootbalMatchIncidents.toIncidents(): List<ScheduleIncidents> {
    return this.incidents?.filterNotNull()?.filter {
        it.confirmed ?: true
    }?.map {
        val incidents = ScheduleIncidents()
        incidents.isHome = it.isHome?:false
        incidents.awayScore = it.awayScore?:0
        incidents.homeScore = it.homeScore?:0
        incidents.player = it.player.transform()
        incidents.playerIn = it.playerIn.transform()
        incidents.playerOut = it.playerOut.transform()
        incidents.addedTime = it.addedTime?:0
        incidents.time = it.time?:0
        when(it.incidentType){
            "period" -> {
                if(it.text == "HT") incidents.code = 3
                else if(it.text == "FT") incidents.code = 4
            }
            "substitution" -> {
                incidents.code = 2
            }
            "card" -> {
                if(it.incidentClass == "yellow"){
                    incidents.code = 8
                } else if (it.incidentClass == "red") {
                    incidents.code = 10
                } else if (it.incidentClass == "yellowRed"){
                    incidents.code = 9
                }
            }
            "goal" -> {
                if(it.incidentClass == "penalty"){
                    incidents.code = 1
                } else if (it.incidentClass == "regular") {
                    incidents.code = 0
                } else if (it.incidentClass == "ownGoal"){
                    incidents.code = 7
                }
            }

        }
        incidents
    }.orEmpty().sortedBy { it.time }.reversed()
}

fun FootballMatchGraph.toGraph(): ScheduleGraph {
    val points = this.graphPoints?.filterNotNull()?.map {
        ScheduleGraphPoint(it.minute?:0.0, (it.value?:0.0).toDouble())
    }?.sortedBy { it.minute }.orEmpty()
    return ScheduleGraph(points)
}

fun FootballMatchHead2Head.toSchedules(): List<Schedule>? {
    return this.events?.filterNotNull()?.filter {
        it.tournament?.uniqueTournament?.hasEventPlayerStatistics == true
    }
        ?.map {
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