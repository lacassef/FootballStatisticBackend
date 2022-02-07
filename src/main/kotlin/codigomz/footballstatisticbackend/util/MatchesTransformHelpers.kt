package codigomz.footballstatisticbackend.util

import codigomz.footballstatisticbackend.api.model.FootbalMatchIncidents
import codigomz.footballstatisticbackend.api.model.FootballMatchLineup
import codigomz.footballstatisticbackend.api.model.FootballMatchStatistics
import codigomz.footballstatisticbackend.model.Player
import codigomz.footballstatisticbackend.model.ScheduleStatistics

fun getStatisticsPeriod(statistic: FootballMatchStatistics.Statistic): ScheduleStatistics.StatisticsPeriod {
    val period = ScheduleStatistics.StatisticsPeriod()
    period.name = statistic.period?:"Desc"
    statistic.groups?.filterNotNull()?.forEach { group ->
        group.statisticsItems?.filterNotNull()?.forEach{ item ->
            when(item.name){
                "Ball possession" ->{
                    period.home.possession = item.home?.
                    substringBefore("%")?.trim()?.toInt()?:0
                    period.away.possession = item.away?.
                    substringBefore("%")?.trim()?.toInt()?:0
                }
                "Shots on target" ->{
                    period.home.shotsOnTarget = item.home?.toInt()?:0
                    period.away.shotsOnTarget = item.away?.toInt()?:0
                }
                "Total shots" ->{
                    period.home.totalShots = item.home?.toInt()?:0
                    period.away.totalShots = item.away?.toInt()?:0
                }
                "Blocked shots" ->{
                    period.home.blockedShots = item.home?.toInt()?:0
                    period.away.blockedShots = item.away?.toInt()?:0
                }
                "Fouls" ->{
                    period.home.fouls = item.home?.toInt()?:0
                    period.away.fouls = item.away?.toInt()?:0
                }
                "Yellow cards" ->{
                    period.home.yellowCard = item.home?.toInt()?:0
                    period.away.yellowCard = item.away?.toInt()?:0
                }
                "Red cards" ->{
                    period.home.redCard = item.home?.toInt()?:0
                    period.away.redCard = item.away?.toInt()?:0
                }
                "Big chances" ->{
                    period.home.bigChances = item.home?.toInt()?:0
                    period.away.bigChances = item.away?.toInt()?:0
                }
                "Big chances missed" ->{
                    period.home.bigChancesMissed = item.home?.toInt()?:0
                    period.away.bigChancesMissed = item.away?.toInt()?:0
                }
                "Shots inside box" ->{
                    period.home.shotsInsideTheBox = item.home?.toInt()?:0
                    period.away.shotsInsideTheBox = item.away?.toInt()?:0
                }
                "Shots outside box" ->{
                    period.home.shotsOutsideTheBox = item.home?.toInt()?:0
                    period.away.shotsOutsideTheBox = item.away?.toInt()?:0
                }
                "Goalkeeper saves" ->{
                    period.home.goalkeeperSaves = item.home?.toInt()?:0
                    period.away.goalkeeperSaves = item.away?.toInt()?:0
                }
                "Offsides" ->{
                    period.home.offside = item.home?.toInt()?:0
                    period.away.offside = item.away?.toInt()?:0
                }
                "Corner kicks" ->{
                    period.home.cornerKicks = item.home?.toInt()?:0
                    period.away.cornerKicks = item.away?.toInt()?:0
                }
                "Passes" ->{
                    period.home.totalPasses = item.home?.toInt()?:0
                    period.away.totalPasses = item.away?.toInt()?:0
                }
                "Accurate passes" ->{
                    period.home.accuratePasses = item.home?.substringBefore("(")
                        ?.trim()?.toInt()?:0
                    period.away.accuratePasses = item.away?.substringBefore("(")
                        ?.trim()?.toInt()?:0
                }
                "Long balls" ->{
                    period.home.totalLongBalls = item.home?.substringAfter("/")
                        ?.substringBefore("(")?.trim()?.toInt()?:0
                    period.away.totalLongBalls = item.away?.substringAfter("/")
                        ?.substringBefore("(")?.trim()?.toInt()?:0
                    period.home.accurateLongBalls = item.home?.substringBefore("/")?.trim()?.toInt()?:0
                    period.away.accurateLongBalls = item.away?.substringBefore("/")?.trim()?.toInt()?:0
                }
                "Crosses" ->{
                    period.home.totalCrosses = item.home?.substringAfter("/")
                        ?.substringBefore("(")?.trim()?.toInt()?:0
                    period.away.totalCrosses = item.away?.substringAfter("/")
                        ?.substringBefore("(")?.trim()?.toInt()?:0
                    period.home.accurateCrosses = item.home?.substringBefore("/")?.trim()?.toInt()?:0
                    period.away.accurateCrosses = item.away?.substringBefore("/")?.trim()?.toInt()?:0
                }
                "Dribbles" ->{
                    period.home.totalDribles = item.home?.substringAfter("/")
                        ?.substringBefore("(")?.trim()?.toInt()?:0
                    period.away.totalDribles = item.away?.substringAfter("/")
                        ?.substringBefore("(")?.trim()?.toInt()?:0
                    period.home.accurateDribles = item.home?.substringBefore("/")?.trim()?.toInt()?:0
                    period.away.accurateDribles = item.away?.substringBefore("/")?.trim()?.toInt()?:0
                }
                "Duels won" ->{
                    period.home.duelsWon = item.home?.toInt()?:0
                    period.away.duelsWon = item.away?.toInt()?:0
                }
                "Aerials won" ->{
                    period.home.aerialDuelsWon = item.home?.toInt()?:0
                    period.away.aerialDuelsWon = item.away?.toInt()?:0
                }
                "Tackles" ->{
                    period.home.tackles = item.home?.toInt()?:0
                    period.away.tackles = item.away?.toInt()?:0
                }
                "Interceptions" ->{
                    period.home.interceptions = item.home?.toInt()?:0
                    period.away.interceptions = item.away?.toInt()?:0
                }
                "Clearances" ->{
                    period.home.clearances = item.home?.toInt()?:0
                    period.away.clearances = item.away?.toInt()?:0
                }
            }
        }
    }
    return period
}

fun List<FootballMatchLineup.Home.Player>.getHomePlayers(): List<Player> {
    return this.map{
        val pl = Player()
        pl.id = it.player?.id?:0
        pl.name = it.player?.name?:""
        pl.avgRating = it.avgRating?:0.0
        pl.shortName = it.player?.shortName?:""
        pl.shirtNumber = it.shirtNumber?:0
        pl.substitute = it.substitute?:true
        pl.position = it.position?:"A"
        pl.statistics = it.statistics?.toStatistics()?:Player.Statistics()
        pl
    }
}

fun FootbalMatchIncidents.Incident.Player?.transform(): Player {
    val pl = Player()
    pl.name = this?.name?:""
    pl.shortName = this?.shortName?:""
    pl.position = this?.position?:""
    pl.id = this?.id?:0
    return pl
}

fun FootbalMatchIncidents.Incident.PlayerIn?.transform(): Player {
    val pl = Player()
    pl.name = this?.name?:""
    pl.shortName = this?.shortName?:""
    pl.position = this?.position?:""
    pl.id = this?.id?:0
    return pl
}

fun FootbalMatchIncidents.Incident.PlayerOut?.transform(): Player {
    val pl = Player()
    pl.name = this?.name?:""
    pl.shortName = this?.shortName?:""
    pl.position = this?.position?:""
    pl.id = this?.id?:0
    return pl
}

fun List<FootballMatchLineup.Home.MissingPlayer>.getHomeMissingPlayers(): List<Player> {
    return this.map{
        val pl = Player()
        pl.id = it.player?.id?:0
        pl.name = it.player?.name?:""
        pl.shortName = it.player?.shortName?:""
        if(it.type == "doubtful") pl.missingReason = 99 else pl.missingReason = it.reason?:-1
        pl.missing = true
        pl
    }
}

fun List<FootballMatchLineup.Away.Player>.getAwayPlayers(): List<Player> {
    return this.map {
        val pl = Player()
        pl.id = it.player?.id?:0
        pl.avgRating = it.avgRating?:0.0
        pl.shortName = it.player?.shortName?:""
        pl.name = it.player?.name ?: ""
        pl.shirtNumber = it.shirtNumber ?: 0
        pl.substitute = it.substitute ?: true
        pl.position = it.position ?: "A"
        pl.statistics = it.statistics?.toStatistics()?:Player.Statistics()
        pl
    }
}

fun List<FootballMatchLineup.Away.MissingPlayer>.getAwayMissingPlayers(): List<Player> {
    return this.map{
        val pl = Player()
        pl.id = it.player?.id?:0
        pl.shortName = it.player?.shortName?:""
        pl.name = it.player?.name?:""
        pl.missing = true
        if(it.type == "doubtful") pl.missingReason = 99 else pl.missingReason = it.reason?:0
        pl
    }
}

fun FootballMatchLineup.Home.Player.Statistics.toStatistics(): Player.Statistics {
    val st = Player.Statistics()
    st.accurateCross = this.accurateCross?:0
    st.accurateLongBalls = this.accurateLongBalls?:0
    st.accuratePass = this.accuratePass?:0
    st.aerialWon = this.aerialWon?:0
    st.blockedScoringAttempt = this.blockedScoringAttempt?:0
    st.duelWon = this.duelWon?:0
    st.fouls = this.fouls?:0
    st.goalAssist = this.goalAssist?:0
    st.goals = this.goals?:0
    st.interceptionWon = this.interceptionWon?:0
    st.keyPass = this.keyPass?:0
    st.minutesPlayed = this.minutesPlayed?:0
    st.onTargetScoringAttempt = this.onTargetScoringAttempt?:0
    st.rating = this.rating?:0.0
    st.savedShotsFromInsideTheBox = this.savedShotsFromInsideTheBox?:0
    st.saves = this.saves?:0
    st.totalClearance = this.totalClearance?:0
    st.totalContest = this.totalContest?:0
    st.totalCross = this.totalCross?:0
    st.totalLongBalls = this.totalLongBalls?:0
    st.totalOffside = this.totalOffside?:0
    st.totalPass = this.totalPass?:0
    st.totalTackle = this.totalTackle?:0
    st.touches = this.touches?:0
    st.wasFouled = this.wasFouled?:0
    st.wonContest = this.wonContest?:0
return st
}

fun FootballMatchLineup.Away.Player.Statistics.toStatistics(): Player.Statistics {
    val st = Player.Statistics()
    st.accurateCross = this.accurateCross?:0
    st.accurateLongBalls = this.accurateLongBalls?:0
    st.accuratePass = this.accuratePass?:0
    st.aerialWon = this.aerialWon?:0
    st.blockedScoringAttempt = this.blockedScoringAttempt?:0
    st.duelWon = this.duelWon?:0
    st.fouls = this.fouls?:0
    st.goalAssist = this.goalAssist?:0
    st.goals = this.goals?:0
    st.interceptionWon = this.interceptionWon?:0
    st.keyPass = this.keyPass?:0
    st.minutesPlayed = this.minutesPlayed?:0
    st.onTargetScoringAttempt = this.onTargetScoringAttempt?:0
    st.rating = this.rating?:0.0
    st.savedShotsFromInsideTheBox = this.savedShotsFromInsideTheBox?:0
    st.saves = this.saves?:0
    st.totalClearance = this.totalClearance?:0
    st.totalContest = this.totalContest?:0
    st.totalCross = this.totalCross?:0
    st.totalLongBalls = this.totalLongBalls?:0
    st.totalOffside = this.totalOffside?:0
    st.totalPass = this.totalPass?:0
    st.totalTackle = this.totalTackle?:0
    st.touches = this.touches?:0
    st.wasFouled = this.wasFouled?:0
    st.wonContest = this.wonContest?:0
    return st
}

fun getPeriod(period: String) =
    when(period){
        "1st half" -> 0
        "AP" -> -90
        "AET" -> -90
        "2nd half" -> 45
        "Ended" -> -90
        "Halftime" -> -45
        "1st extra" -> 90
        "Extra time halftime" -> -105
        "2nd extra" -> 105
        "Awaiting penalties" -> -120
        "Penalties" -> -999
        "Awaiting extra time" -> -99
        else -> -1
    }

fun getLinesNumber(formation: String): MutableList<Int> {
    val lines: MutableList<Int> = mutableListOf()
    lines.add(1)
    for (i in formation.trim().filter{it != '-'}){
        lines.add(Integer.valueOf(i.toString()))
    }
    return lines
}