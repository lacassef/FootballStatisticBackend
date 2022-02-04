package codigomz.footballstatisticbackend.model

data class Player(
    var country: String = "",
    var dateOfBirth: String = "",
    var name: String = "", var position: String = "A",
    var shirtNumber: Int = 0, var substitute: Boolean = false, var missing: Boolean = false,
    var missingReason: Int = 0, var id: Int = 0, var shortName: String = "",
    var statistics: Statistics = Statistics(),
){
    data class Statistics(
        var accurateCross: Int = 0,
        var accurateLongBalls: Int = 0,
        var accuratePass: Int = 0,
        var aerialWon: Int = 0,
        var blockedScoringAttempt: Int = 0,
        var duelWon: Int = 0,
        var fouls: Int = 0,
        var goalAssist: Int = 0,
        var goals: Int = 0,
        var interceptionWon: Int = 0,
        var keyPass: Int = 0,
        var minutesPlayed: Int = 0,
        var onTargetScoringAttempt: Int = 0,
        var rating: Double = 0.0,
        var savedShotsFromInsideTheBox: Int = 0,
        var saves: Int = 0,
        var totalClearance: Int = 0,
        var totalContest: Int = 0,
        var totalCross: Int = 0,
        var totalLongBalls: Int = 0,
        var totalOffside: Int = 0,
        var totalPass: Int = 0,
        var totalTackle: Int = 0,
        var touches: Int = 0,
        var wasFouled: Int = 0,
        var wonContest: Int = 0
    )
}
