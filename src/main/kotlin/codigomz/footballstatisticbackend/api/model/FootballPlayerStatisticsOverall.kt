package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonProperty

data class FootballPlayerStatisticsOverall(
    @JsonProperty("statistics")
    var statistics: Statistics? = null,
    @JsonProperty("team")
    var team: Team? = null
) {
    data class Statistics(
        @JsonProperty("accurateChippedPasses")
        var accurateChippedPasses: Int? = null,
        @JsonProperty("accurateCrosses")
        var accurateCrosses: Int? = null,
        @JsonProperty("accurateCrossesPercentage")
        var accurateCrossesPercentage: Double? = null,
        @JsonProperty("accurateFinalThirdPasses")
        var accurateFinalThirdPasses: Int? = null,
        @JsonProperty("accurateLongBalls")
        var accurateLongBalls: Int? = null,
        @JsonProperty("accurateLongBallsPercentage")
        var accurateLongBallsPercentage: Double? = null,
        @JsonProperty("accurateOppositionHalfPasses")
        var accurateOppositionHalfPasses: Int? = null,
        @JsonProperty("accurateOwnHalfPasses")
        var accurateOwnHalfPasses: Int? = null,
        @JsonProperty("accuratePasses")
        var accuratePasses: Int? = null,
        @JsonProperty("accuratePassesPercentage")
        var accuratePassesPercentage: Double? = null,
        @JsonProperty("aerialDuelsWon")
        var aerialDuelsWon: Int? = null,
        @JsonProperty("aerialDuelsWonPercentage")
        var aerialDuelsWonPercentage: Double? = null,
        @JsonProperty("aerialLost")
        var aerialLost: Int? = null,
        @JsonProperty("appearances")
        var appearances: Int? = null,
        @JsonProperty("assists")
        var assists: Int? = null,
        @JsonProperty("attemptPenaltyMiss")
        var attemptPenaltyMiss: Int? = null,
        @JsonProperty("attemptPenaltyPost")
        var attemptPenaltyPost: Int? = null,
        @JsonProperty("attemptPenaltyTarget")
        var attemptPenaltyTarget: Int? = null,
        @JsonProperty("bigChancesCreated")
        var bigChancesCreated: Int? = null,
        @JsonProperty("bigChancesMissed")
        var bigChancesMissed: Int? = null,
        @JsonProperty("blockedShots")
        var blockedShots: Int? = null,
        @JsonProperty("cleanSheet")
        var cleanSheet: Int? = null,
        @JsonProperty("clearances")
        var clearances: Int? = null,
        @JsonProperty("countRating")
        var countRating: Int? = null,
        @JsonProperty("crossesNotClaimed")
        var crossesNotClaimed: Int? = null,
        @JsonProperty("directRedCards")
        var directRedCards: Int? = null,
        @JsonProperty("dispossessed")
        var dispossessed: Int? = null,
        @JsonProperty("dribbledPast")
        var dribbledPast: Int? = null,
        @JsonProperty("duelLost")
        var duelLost: Int? = null,
        @JsonProperty("errorLeadToGoal")
        var errorLeadToGoal: Int? = null,
        @JsonProperty("errorLeadToShot")
        var errorLeadToShot: Int? = null,
        @JsonProperty("fouls")
        var fouls: Int? = null,
        @JsonProperty("freeKickGoal")
        var freeKickGoal: Int? = null,
        @JsonProperty("goalConversionPercentage")
        var goalConversionPercentage: Int? = null,
        @JsonProperty("goals")
        var goals: Int? = null,
        @JsonProperty("goalsAssistsSum")
        var goalsAssistsSum: Int? = null,
        @JsonProperty("goalsConceded")
        var goalsConceded: Int? = null,
        @JsonProperty("goalsConcededInsideTheBox")
        var goalsConcededInsideTheBox: Int? = null,
        @JsonProperty("goalsConcededOutsideTheBox")
        var goalsConcededOutsideTheBox: Int? = null,
        @JsonProperty("goalsFromInsideTheBox")
        var goalsFromInsideTheBox: Int? = null,
        @JsonProperty("goalsFromOutsideTheBox")
        var goalsFromOutsideTheBox: Int? = null,
        @JsonProperty("groundDuelsWon")
        var groundDuelsWon: Int? = null,
        @JsonProperty("groundDuelsWonPercentage")
        var groundDuelsWonPercentage: Double? = null,
        @JsonProperty("headedGoals")
        var headedGoals: Int? = null,
        @JsonProperty("highClaims")
        var highClaims: Int? = null,
        @JsonProperty("hitWoodwork")
        var hitWoodwork: Int? = null,
        @JsonProperty("id")
        var id: Int? = null,
        @JsonProperty("inaccuratePasses")
        var inaccuratePasses: Int? = null,
        @JsonProperty("interceptions")
        var interceptions: Int? = null,
        @JsonProperty("keyPasses")
        var keyPasses: Int? = null,
        @JsonProperty("leftFootGoals")
        var leftFootGoals: Int? = null,
        @JsonProperty("matchesStarted")
        var matchesStarted: Int? = null,
        @JsonProperty("minutesPlayed")
        var minutesPlayed: Int? = null,
        @JsonProperty("offsides")
        var offsides: Int? = null,
        @JsonProperty("ownGoals")
        var ownGoals: Int? = null,
        @JsonProperty("passToAssist")
        var passToAssist: Int? = null,
        @JsonProperty("penaltiesTaken")
        var penaltiesTaken: Int? = null,
        @JsonProperty("penaltyConceded")
        var penaltyConceded: Int? = null,
        @JsonProperty("penaltyConversion")
        var penaltyConversion: Int? = null,
        @JsonProperty("penaltyFaced")
        var penaltyFaced: Int? = null,
        @JsonProperty("penaltyGoals")
        var penaltyGoals: Int? = null,
        @JsonProperty("penaltySave")
        var penaltySave: Int? = null,
        @JsonProperty("penaltyWon")
        var penaltyWon: Int? = null,
        @JsonProperty("possessionLost")
        var possessionLost: Int? = null,
        @JsonProperty("possessionWonAttThird")
        var possessionWonAttThird: Int? = null,
        @JsonProperty("punches")
        var punches: Int? = null,
        @JsonProperty("rating")
        var rating: Double? = null,
        @JsonProperty("redCards")
        var redCards: Int? = null,
        @JsonProperty("rightFootGoals")
        var rightFootGoals: Int? = null,
        @JsonProperty("runsOut")
        var runsOut: Int? = null,
        @JsonProperty("savedShotsFromInsideTheBox")
        var savedShotsFromInsideTheBox: Int? = null,
        @JsonProperty("savedShotsFromOutsideTheBox")
        var savedShotsFromOutsideTheBox: Int? = null,
        @JsonProperty("saves")
        var saves: Int? = null,
        @JsonProperty("savesCaught")
        var savesCaught: Int? = null,
        @JsonProperty("savesParried")
        var savesParried: Int? = null,
        @JsonProperty("scoringFrequency")
        var scoringFrequency: Int? = null,
        @JsonProperty("setPieceConversion")
        var setPieceConversion: Int? = null,
        @JsonProperty("shotFromSetPiece")
        var shotFromSetPiece: Int? = null,
        @JsonProperty("shotsFromInsideTheBox")
        var shotsFromInsideTheBox: Int? = null,
        @JsonProperty("shotsFromOutsideTheBox")
        var shotsFromOutsideTheBox: Int? = null,
        @JsonProperty("shotsOffTarget")
        var shotsOffTarget: Int? = null,
        @JsonProperty("shotsOnTarget")
        var shotsOnTarget: Int? = null,
        @JsonProperty("successfulDribbles")
        var successfulDribbles: Int? = null,
        @JsonProperty("successfulDribblesPercentage")
        var successfulDribblesPercentage: Int? = null,
        @JsonProperty("successfulRunsOut")
        var successfulRunsOut: Int? = null,
        @JsonProperty("tackles")
        var tackles: Int? = null,
        @JsonProperty("tacklesWon")
        var tacklesWon: Int? = null,
        @JsonProperty("tacklesWonPercentage")
        var tacklesWonPercentage: Double? = null,
        @JsonProperty("totalAttemptAssist")
        var totalAttemptAssist: Int? = null,
        @JsonProperty("totalChippedPasses")
        var totalChippedPasses: Int? = null,
        @JsonProperty("totalContest")
        var totalContest: Int? = null,
        @JsonProperty("totalCross")
        var totalCross: Int? = null,
        @JsonProperty("totalDuelsWon")
        var totalDuelsWon: Int? = null,
        @JsonProperty("totalDuelsWonPercentage")
        var totalDuelsWonPercentage: Double? = null,
        @JsonProperty("totalLongBalls")
        var totalLongBalls: Int? = null,
        @JsonProperty("totalOppositionHalfPasses")
        var totalOppositionHalfPasses: Int? = null,
        @JsonProperty("totalOwnHalfPasses")
        var totalOwnHalfPasses: Int? = null,
        @JsonProperty("totalPasses")
        var totalPasses: Int? = null,
        @JsonProperty("totalRating")
        var totalRating: Double? = null,
        @JsonProperty("totalShots")
        var totalShots: Int? = null,
        @JsonProperty("totwAppearances")
        var totwAppearances: Int? = null,
        @JsonProperty("touches")
        var touches: Int? = null,
        @JsonProperty("type")
        var type: String? = null,
        @JsonProperty("wasFouled")
        var wasFouled: Int? = null,
        @JsonProperty("yellowCards")
        var yellowCards: Int? = null,
        @JsonProperty("yellowRedCards")
        var yellowRedCards: Int? = null
    )

    data class Team(
        @JsonProperty("disabled")
        var disabled: Boolean? = null,
        @JsonProperty("gender")
        var gender: String? = null,
        @JsonProperty("id")
        var id: Int? = null,
        @JsonProperty("name")
        var name: String? = null,
        @JsonProperty("nameCode")
        var nameCode: String? = null,
        @JsonProperty("national")
        var national: Boolean? = null,
        @JsonProperty("shortName")
        var shortName: String? = null,
        @JsonProperty("slug")
        var slug: String? = null,
        @JsonProperty("teamColors")
        var teamColors: TeamColors? = null,
        @JsonProperty("type")
        var type: Int? = null,
        @JsonProperty("userCount")
        var userCount: Int? = null
    ) {
        data class TeamColors(
            @JsonProperty("primary")
            var primary: String? = null,
            @JsonProperty("secondary")
            var secondary: String? = null,
            @JsonProperty("text")
            var text: String? = null
        )
    }
}