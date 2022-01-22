package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonProperty

data class FootballTeamOverallStatisticsBySeasonIdAndUniqueTournId(
    @JsonProperty("statistics")
    var statistics: Statistics? = null
) {
    data class Statistics(
        @JsonProperty("accurateCrosses")
        var accurateCrosses: Int? = null,
        @JsonProperty("accurateCrossesPercentage")
        var accurateCrossesPercentage: Double? = null,
        @JsonProperty("accurateFinalThirdPassesAgainst")
        var accurateFinalThirdPassesAgainst: Int? = null,
        @JsonProperty("accurateLongBalls")
        var accurateLongBalls: Int? = null,
        @JsonProperty("accurateLongBallsPercentage")
        var accurateLongBallsPercentage: Double? = null,
        @JsonProperty("accurateOppositionHalfPasses")
        var accurateOppositionHalfPasses: Int? = null,
        @JsonProperty("accurateOppositionHalfPassesAgainst")
        var accurateOppositionHalfPassesAgainst: Int? = null,
        @JsonProperty("accurateOppositionHalfPassesPercentage")
        var accurateOppositionHalfPassesPercentage: Double? = null,
        @JsonProperty("accurateOwnHalfPasses")
        var accurateOwnHalfPasses: Int? = null,
        @JsonProperty("accurateOwnHalfPassesAgainst")
        var accurateOwnHalfPassesAgainst: Int? = null,
        @JsonProperty("accurateOwnHalfPassesPercentage")
        var accurateOwnHalfPassesPercentage: Double? = null,
        @JsonProperty("accuratePasses")
        var accuratePasses: Int? = null,
        @JsonProperty("accuratePassesAgainst")
        var accuratePassesAgainst: Int? = null,
        @JsonProperty("accuratePassesPercentage")
        var accuratePassesPercentage: Double? = null,
        @JsonProperty("aerialDuelsWon")
        var aerialDuelsWon: Int? = null,
        @JsonProperty("aerialDuelsWonPercentage")
        var aerialDuelsWonPercentage: Double? = null,
        @JsonProperty("assists")
        var assists: Int? = null,
        @JsonProperty("averageBallPossession")
        var averageBallPossession: Int? = null,
        @JsonProperty("avgRating")
        var avgRating: Double? = null,
        @JsonProperty("awardedMatches")
        var awardedMatches: Int? = null,
        @JsonProperty("bigChances")
        var bigChances: Int? = null,
        @JsonProperty("bigChancesAgainst")
        var bigChancesAgainst: Int? = null,
        @JsonProperty("bigChancesCreated")
        var bigChancesCreated: Int? = null,
        @JsonProperty("bigChancesCreatedAgainst")
        var bigChancesCreatedAgainst: Int? = null,
        @JsonProperty("bigChancesMissed")
        var bigChancesMissed: Int? = null,
        @JsonProperty("bigChancesMissedAgainst")
        var bigChancesMissedAgainst: Int? = null,
        @JsonProperty("cleanSheets")
        var cleanSheets: Int? = null,
        @JsonProperty("clearances")
        var clearances: Int? = null,
        @JsonProperty("clearancesAgainst")
        var clearancesAgainst: Int? = null,
        @JsonProperty("clearancesOffLine")
        var clearancesOffLine: Int? = null,
        @JsonProperty("corners")
        var corners: Int? = null,
        @JsonProperty("cornersAgainst")
        var cornersAgainst: Int? = null,
        @JsonProperty("crossesSuccessfulAgainst")
        var crossesSuccessfulAgainst: Int? = null,
        @JsonProperty("crossesTotalAgainst")
        var crossesTotalAgainst: Int? = null,
        @JsonProperty("dribbleAttempts")
        var dribbleAttempts: Int? = null,
        @JsonProperty("dribbleAttemptsTotalAgainst")
        var dribbleAttemptsTotalAgainst: Int? = null,
        @JsonProperty("dribbleAttemptsWonAgainst")
        var dribbleAttemptsWonAgainst: Int? = null,
        @JsonProperty("duelsWon")
        var duelsWon: Int? = null,
        @JsonProperty("duelsWonPercentage")
        var duelsWonPercentage: Double? = null,
        @JsonProperty("errorsLeadingToGoal")
        var errorsLeadingToGoal: Int? = null,
        @JsonProperty("errorsLeadingToGoalAgainst")
        var errorsLeadingToGoalAgainst: Int? = null,
        @JsonProperty("errorsLeadingToShot")
        var errorsLeadingToShot: Int? = null,
        @JsonProperty("errorsLeadingToShotAgainst")
        var errorsLeadingToShotAgainst: Int? = null,
        @JsonProperty("fastBreakGoals")
        var fastBreakGoals: Int? = null,
        @JsonProperty("fastBreakShots")
        var fastBreakShots: Int? = null,
        @JsonProperty("fastBreaks")
        var fastBreaks: Int? = null,
        @JsonProperty("fouls")
        var fouls: Int? = null,
        @JsonProperty("freeKickGoals")
        var freeKickGoals: Int? = null,
        @JsonProperty("freeKickShots")
        var freeKickShots: Int? = null,
        @JsonProperty("goalsConceded")
        var goalsConceded: Int? = null,
        @JsonProperty("goalsFromInsideTheBox")
        var goalsFromInsideTheBox: Int? = null,
        @JsonProperty("goalsFromOutsideTheBox")
        var goalsFromOutsideTheBox: Int? = null,
        @JsonProperty("goalsScored")
        var goalsScored: Int? = null,
        @JsonProperty("groundDuelsWon")
        var groundDuelsWon: Int? = null,
        @JsonProperty("groundDuelsWonPercentage")
        var groundDuelsWonPercentage: Double? = null,
        @JsonProperty("headedGoals")
        var headedGoals: Int? = null,
        @JsonProperty("hitWoodwork")
        var hitWoodwork: Int? = null,
        @JsonProperty("hitWoodworkAgainst")
        var hitWoodworkAgainst: Int? = null,
        @JsonProperty("id")
        var id: Int? = null,
        @JsonProperty("interceptions")
        var interceptions: Int? = null,
        @JsonProperty("interceptionsAgainst")
        var interceptionsAgainst: Int? = null,
        @JsonProperty("keyPassesAgainst")
        var keyPassesAgainst: Int? = null,
        @JsonProperty("lastManTackles")
        var lastManTackles: Int? = null,
        @JsonProperty("leftFootGoals")
        var leftFootGoals: Int? = null,
        @JsonProperty("longBallsSuccessfulAgainst")
        var longBallsSuccessfulAgainst: Int? = null,
        @JsonProperty("longBallsTotalAgainst")
        var longBallsTotalAgainst: Int? = null,
        @JsonProperty("matches")
        var matches: Int? = null,
        @JsonProperty("offsides")
        var offsides: Int? = null,
        @JsonProperty("offsidesAgainst")
        var offsidesAgainst: Int? = null,
        @JsonProperty("oppositionHalfPassesTotalAgainst")
        var oppositionHalfPassesTotalAgainst: Int? = null,
        @JsonProperty("ownGoals")
        var ownGoals: Int? = null,
        @JsonProperty("ownHalfPassesTotalAgainst")
        var ownHalfPassesTotalAgainst: Int? = null,
        @JsonProperty("penaltiesCommited")
        var penaltiesCommited: Int? = null,
        @JsonProperty("penaltiesTaken")
        var penaltiesTaken: Int? = null,
        @JsonProperty("penaltyGoals")
        var penaltyGoals: Int? = null,
        @JsonProperty("penaltyGoalsConceded")
        var penaltyGoalsConceded: Int? = null,
        @JsonProperty("possessionLost")
        var possessionLost: Int? = null,
        @JsonProperty("redCards")
        var redCards: Int? = null,
        @JsonProperty("redCardsAgainst")
        var redCardsAgainst: Int? = null,
        @JsonProperty("rightFootGoals")
        var rightFootGoals: Int? = null,
        @JsonProperty("saves")
        var saves: Int? = null,
        @JsonProperty("shots")
        var shots: Int? = null,
        @JsonProperty("shotsAgainst")
        var shotsAgainst: Int? = null,
        @JsonProperty("shotsBlockedAgainst")
        var shotsBlockedAgainst: Int? = null,
        @JsonProperty("shotsFromInsideTheBox")
        var shotsFromInsideTheBox: Int? = null,
        @JsonProperty("shotsFromInsideTheBoxAgainst")
        var shotsFromInsideTheBoxAgainst: Int? = null,
        @JsonProperty("shotsFromOutsideTheBox")
        var shotsFromOutsideTheBox: Int? = null,
        @JsonProperty("shotsFromOutsideTheBoxAgainst")
        var shotsFromOutsideTheBoxAgainst: Int? = null,
        @JsonProperty("shotsOffTarget")
        var shotsOffTarget: Int? = null,
        @JsonProperty("shotsOffTargetAgainst")
        var shotsOffTargetAgainst: Int? = null,
        @JsonProperty("shotsOnTarget")
        var shotsOnTarget: Int? = null,
        @JsonProperty("shotsOnTargetAgainst")
        var shotsOnTargetAgainst: Int? = null,
        @JsonProperty("successfulDribbles")
        var successfulDribbles: Int? = null,
        @JsonProperty("tackles")
        var tackles: Int? = null,
        @JsonProperty("tacklesAgainst")
        var tacklesAgainst: Int? = null,
        @JsonProperty("totalAerialDuels")
        var totalAerialDuels: Int? = null,
        @JsonProperty("totalCrosses")
        var totalCrosses: Int? = null,
        @JsonProperty("totalDuels")
        var totalDuels: Int? = null,
        @JsonProperty("totalFinalThirdPassesAgainst")
        var totalFinalThirdPassesAgainst: Int? = null,
        @JsonProperty("totalGroundDuels")
        var totalGroundDuels: Int? = null,
        @JsonProperty("totalLongBalls")
        var totalLongBalls: Int? = null,
        @JsonProperty("totalOppositionHalfPasses")
        var totalOppositionHalfPasses: Int? = null,
        @JsonProperty("totalOwnHalfPasses")
        var totalOwnHalfPasses: Int? = null,
        @JsonProperty("totalPasses")
        var totalPasses: Int? = null,
        @JsonProperty("totalPassesAgainst")
        var totalPassesAgainst: Int? = null,
        @JsonProperty("yellowCards")
        var yellowCards: Int? = null,
        @JsonProperty("yellowCardsAgainst")
        var yellowCardsAgainst: Int? = null,
        @JsonProperty("yellowRedCards")
        var yellowRedCards: Int? = null
    )
}