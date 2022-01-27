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
            customId = it.customId?:"", live = Schedule.Live(
                periodStart = (it.time?.currentPeriodStartTimestamp?:0)*1000L,
            period = getPeriod(it.status?.description?:"")), venue = Schedule.Venue(
            )
        )
    }
}

fun FootballLiveMatches.toSchedules(): List<Schedule>? {
    return this.events?.filterNotNull()?.filter {
        it.tournament?.uniqueTournament?.hasEventPlayerStatistics == true
    }?.map {
        Schedule(
            id= it.id?:0, home = Team(it.homeTeam?.name?:"", it.homeTeam?.shortName?:"",
                it.homeScore?.current?:0, it.homeTeam?.id?:0, it.homeScore?.period1?:0),
            away = Team(it.awayTeam?.name?:"", it.awayTeam?.shortName?:"",
                it.awayScore?.current?:0, it.awayTeam?.id?:0, it.awayScore?.period1?:0),
            tournament = Tournament(name = it.tournament?.uniqueTournament?.name?:"",
                country = it.tournament?.uniqueTournament?.category?.name?:"",
                id = it.tournament?.uniqueTournament?.id?:0 ),
            status = -1000, date = getDayString(it.startTimestamp?:0),
            time = getTimeString(it.startTimestamp?:0),
            hasLines = true,
            customId = it.customId?:"", live = Schedule.Live(
                periodStart = (it.time?.currentPeriodStartTimestamp?:0)*1000L,
                period = getPeriod(it.status?.description?:"")), venue = Schedule.Venue(
            )
        )
    }
}

fun FootballMatchById.toSchedule(): Schedule? {
    return this.event?.let {
        Schedule(
            id= it.id?:0, home = Team(it.homeTeam?.name?:"", it.homeTeam?.shortName?:"",
                it.homeScore?.normaltime?:0, it.homeTeam?.id?:0, it.homeScore?.period1?:0),
            away = Team(it.awayTeam?.name?:"", it.awayTeam?.shortName?:"",
                it.awayScore?.normaltime?:0, it.awayTeam?.id?:0, it.awayScore?.period1?:0),
            tournament = Tournament(name = it.tournament?.uniqueTournament?.name?:"",
                country = it.tournament?.uniqueTournament?.category?.name?:"",
                id = it.tournament?.uniqueTournament?.id?:0, season = it.season?.id?:0),
            status = it.status?.code?:0, date = getDayString(it.startTimestamp?:0),
            time = getTimeString(it.startTimestamp?:0),
            customId = it.customId?:"", live = Schedule.Live(
                periodStart = (it.time?.currentPeriodStartTimestamp?:0)*1000L,
                period = getPeriod(it.status?.description?:"")), venue = Schedule.Venue(
                city = it.venue?.city?.name?:"", stadium = it.venue?.stadium?.name?:""
                )
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
                when (it.text) {
                    "HT" -> incidents.code = 3
                    "FT" -> incidents.code = 4
                    "ET" -> incidents.code = 11
                    "PEN" -> incidents.code = 12
                }
            }
            "substitution" -> {
                incidents.code = 2
            }
            "card" -> {
                when (it.incidentClass) {
                    "yellow" -> {
                        incidents.code = 8
                    }
                    "red" -> {
                        incidents.code = 10
                    }
                    "yellowRed" -> {
                        incidents.code = 9
                    }
                }
            }
            "goal" -> {
                when (it.incidentClass) {
                    "penalty" -> {
                        incidents.code = 1
                    }
                    "regular" -> {
                        incidents.code = 0
                    }
                    "ownGoal" -> {
                        incidents.code = 7
                    }
                }
            }
            "penaltyShootout" -> {
                when(it.incidentClass){
                    "missed" -> incidents.code = 13
                    "scored" -> incidents.code = 14
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
                    it.homeScore?.normaltime?:0, it.homeTeam?.id?:0, it.homeScore?.period1?:0),
                away = Team(it.awayTeam?.name?:"", it.awayTeam?.shortName?:"",
                    it.awayScore?.normaltime?:0, it.awayTeam?.id?:0, it.awayScore?.period1?:0),
                tournament = Tournament(name = it.tournament?.uniqueTournament?.name?:"",
                    country = it.tournament?.uniqueTournament?.category?.name?:"",
                    id = it.tournament?.uniqueTournament?.id?:0 ),
                status = it.status?.code?:0, date = getDayString(it.startTimestamp?:0),
                time = getTimeString(it.startTimestamp?:0),
                hasLines = it.hasEventPlayerStatistics?:false,
                customId = it.customId?:"", live = Schedule.Live(
                    periodStart = (it.time?.currentPeriodStartTimestamp?:0)*1000L,
                    period = getPeriod(it.status?.description?:"")), venue = Schedule.Venue(
                )
            )
        }
}