package codigomz.footballstatisticbackend.util

import codigomz.footballstatisticbackend.api.model.FootballPlayerAttributeOverview
import codigomz.footballstatisticbackend.api.model.FootballPlayerLastRatings
import codigomz.footballstatisticbackend.model.PlayerAttributes
import codigomz.footballstatisticbackend.model.PlayerLastRatings
import codigomz.footballstatisticbackend.model.Team

fun FootballPlayerAttributeOverview.transform(playerPosition: String): PlayerAttributes {
    val pA = PlayerAttributes()

    this.playerAttributeOverviews?.filterNotNull()?.filter { it.position == playerPosition }
        ?.sortedBy { it.yearShift }?.firstOrNull()?.let { att ->
        with(pA.player){
             attacking = att. attacking  ?:0
             creativity = att. creativity  ?:0
             defending = att. defending  ?:0
             position = att. position  ?: ""
             tactical = att. tactical  ?:0
             saves = att. saves  ?:0
             anticipation = att. anticipation  ?:0
             ballDistribution = att. ballDistribution  ?:0
             aerial = att. aerial  ?:0
             technical = att. technical  ?:0
        }
    }
    this.averageAttributeOverviews?.filterNotNull()?.filter { it.position == playerPosition }
        ?.sortedBy { it.yearShift }?.firstOrNull()?.let { att ->
        with(pA.average){
            attacking = att. attacking  ?:0
            creativity = att. creativity  ?:0
            defending = att. defending  ?:0
            position = att. position  ?: ""
            tactical = att. tactical  ?:0
            saves = att. saves  ?:0
            anticipation = att. anticipation  ?:0
            ballDistribution = att. ballDistribution  ?:0
            aerial = att. aerial  ?:0
            technical = att. technical  ?:0
        }
    }
    return pA
}

fun FootballPlayerLastRatings.transform(): List<PlayerLastRatings>? {
    return this.lastRatings?.filterNotNull()?.map {
        val rat = PlayerLastRatings()
        rat.date = getDayString(it.startTimestamp?:0)
        rat.time = getTimeString(it.startTimestamp?:0)
        rat.rating = it.rating?:0.0
        rat.opponent = Team(name = it.opponent?.name?:"", shortName = it.opponent?.shortName?:"",
        id = it.opponent?.id?:0)
        rat.isHome = it.isHome?:false
        rat.id = it.eventId?:0
        rat
    }
}

