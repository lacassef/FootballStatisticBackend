package codigomz.footballstatisticbackend.util

import codigomz.footballstatisticbackend.api.Sofascore
import codigomz.footballstatisticbackend.model.*

fun getPeriodsGraph(teamId: Int): BettingPeriods {
    val lastMatches = Sofascore.getApi().
    getLastMatchesByTeamId(teamId, 0).execute().body()?.events?.filterNotNull()?.
    filter { (it.status?.code) == 100 }?.filter {
        it.tournament?.uniqueTournament?.hasEventPlayerStatistics == true
    }
    val pF = PeriodsFinale()
    val pFAgg = PeriodsFinale()
    val pG = PeriodsGraph()
    val goalP =GoalPeriods()
    val goalM = mutableListOf<Int>()
    val goalPAgg =GoalPeriods()
    val goalMAgg = mutableListOf<Int>()
    lastMatches?.mapNotNull { event ->
        event.id?.let {
            val g = Sofascore.getApi().getMatchGraph(it).execute().body()
                ?.toGraph()?: ScheduleGraph()
            PeriodIntermediario(g, event.homeTeam?.id == teamId)
        }
    }.orEmpty().forEach {
        it.graph.points.forEach{ point ->
           if((point.minute > 0).and(point.minute<=15)) {
               if ((it.home)&&(point.point>0)) pF.pOne.add(point.point)
               else if ((!it.home)&&(point.point<0)) pF.pOne.add(-1*point.point)
           }
            else if((point.minute > 15).and(point.minute<=30)) {
                if ((it.home)&&(point.point>0)) pF.pTwo.add(point.point)
                else if ((!it.home)&&(point.point<0)) pF.pTwo.add(-1*point.point)
            }
            else if((point.minute > 30).and(point.minute<=45.5)) {
                if ((it.home)&&(point.point>0)) pF.pThree.add(point.point)
                else if ((!it.home)&&(point.point<0)) pF.pThree.add(-1*point.point)
            }
            else if((point.minute > 45.5).and(point.minute<=60)) {
               if ((it.home)&&(point.point>0)) pF.pFour.add(point.point)
               else if ((!it.home)&&(point.point<0)) pF.pFour.add(-1*point.point)
           }
            else if((point.minute > 60).and(point.minute<=75)) {
               if ((it.home)&&(point.point>0)) pF.pFive.add(point.point)
               else if ((!it.home)&&(point.point<0)) pF.pFive.add(-1*point.point)
           }
            else if((point.minute > 75).and(point.minute<=90.5)) {
               if ((it.home)&&(point.point>0)) pF.pSix.add(point.point)
               else if ((!it.home)&&(point.point<0)) pF.pSix.add(-1*point.point)
           }
        }
    }
    lastMatches?.mapNotNull { event ->
        event.id?.let { id ->
            val inc = Sofascore.getApi().getMatchIncidents(id).execute().body()
                ?.toIncidents()
            goalM.addAll(inc?.filter {
                (it.isHome == (teamId == event.homeTeam?.id)) and ((it.code == 0)||(it.code == 1)) }
                ?.map { it.time }.orEmpty())
            goalMAgg.addAll(inc?.filter {
                    (!(it.isHome == (teamId == event.homeTeam?.id))) and
                            ((it.code == 0)||(it.code == 1)) }
                ?.map { it.time }.orEmpty())
        }
    }.orEmpty()
    goalP.pOne = goalM.count {
        (it > 0).and(it<=15)
    }
    goalP.pTwo = goalM.count {
        (it > 15).and(it<=30)
    }
    goalP.pThree = goalM.count {
        (it > 30).and(it<=45)
    }
    goalP.pFour = goalM.count {
        (it > 45).and(it<=60)
    }
    goalP.pFive = goalM.count {
        (it > 60).and(it<=75)
    }
    goalP.pSix = goalM.count {
        (it > 75).and(it<=90)
    }
    goalPAgg.pOne = goalMAgg.count {
        (it > 0).and(it<=15)
    }
    goalPAgg.pTwo = goalMAgg.count {
        (it > 15).and(it<=30)
    }
    goalPAgg.pThree = goalMAgg.count {
        (it > 30).and(it<=45)
    }
    goalPAgg.pFour = goalMAgg.count {
        (it > 45).and(it<=60)
    }
    goalPAgg.pFive = goalMAgg.count {
        (it > 60).and(it<=75)
    }
    goalPAgg.pSix = goalMAgg.count {
        (it > 75).and(it<=90)
    }
    pG.pOne = pF.pOne.filter { !it.isNaN() }.average()
    pG.pTwo = pF.pTwo.filter { !it.isNaN() }.average()
    pG.pThree = pF.pThree.filter { !it.isNaN() }.average()
    pG.pFour = pF.pFour.filter { !it.isNaN() }.average()
    pG.pFive = pF.pFive.filter { !it.isNaN() }.average()
    pG.pSix = pF.pSix.filter { !it.isNaN() }.average()
    return BettingPeriods(graph = pG, goals = goalP, goalsAgg = goalPAgg)
}
