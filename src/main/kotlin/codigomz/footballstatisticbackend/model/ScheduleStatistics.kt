package codigomz.footballstatisticbackend.model

data class ScheduleStatistics(
    var periods: List<StatisticsPeriod> = listOf()
){ data class StatisticsPeriod(
    var name: String = "", var home: TeamStatistics = TeamStatistics(),
    var away: TeamStatistics = TeamStatistics()
) {
    data class TeamStatistics(
        var possession: Int = 0, var totalShots: Int = 0, var shotsOnTarget: Int = 0,
        var blockedShots: Int = 0, var fouls: Int = 0, var yellowCard: Int = 0,
        var redCard: Int = 0, var bigChances: Int = 0, var bigChancesMissed: Int = 0,
        var shotsInsideTheBox: Int = 0, var shotsOutsideTheBox: Int = 0, var goalkeeperSaves: Int = 0,
        var offside: Int = 0, var totalPasses: Int = 0, var accuratePasses: Int = 0,
        var totalLongBalls: Int = 0, var accurateLongBalls: Int = 0, var totalCrosses: Int = 0,
        var accurateCrosses: Int = 0, var totalDribles: Int = 0, var accurateDribles: Int = 0,
        var duelsWon: Int = 0, var aerialDuelsWon: Int = 0, var tackles: Int = 0,
        var interceptions: Int = 0, var clearances: Int = 0, var cornerKicks: Int = 0
    )
}
}