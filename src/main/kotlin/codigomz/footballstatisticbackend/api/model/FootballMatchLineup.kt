package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonProperty

data class FootballMatchLineup(
    @JsonProperty("away")
    var away: Away? = null,
    @JsonProperty("confirmed")
    var confirmed: Boolean? = null,
    @JsonProperty("home")
    var home: Home? = null
) {
    data class Away(
        @JsonProperty("formation")
        var formation: String? = null,
        @JsonProperty("goalkeeperColor")
        var goalkeeperColor: GoalkeeperColor? = null,
        @JsonProperty("missingPlayers")
        var missingPlayers: List<MissingPlayer?>? = null,
        @JsonProperty("playerColor")
        var playerColor: PlayerColor? = null,
        @JsonProperty("players")
        var players: List<Player?>? = null
    ) {
        data class GoalkeeperColor(
            @JsonProperty("number")
            var number: String? = null,
            @JsonProperty("outline")
            var outline: String? = null,
            @JsonProperty("primary")
            var primary: String? = null
        )

        data class MissingPlayer(
            @JsonProperty("player")
            var player: Player? = null,
            @JsonProperty("reason")
            var reason: Int? = null,
            @JsonProperty("type")
            var type: String? = null
        ) {
            data class Player(
                @JsonProperty("country")
                var country: Country? = null,
                @JsonProperty("dateOfBirthTimestamp")
                var dateOfBirthTimestamp: Int? = null,
                @JsonProperty("firstName")
                var firstName: String? = null,
                @JsonProperty("id")
                var id: Int? = null,
                @JsonProperty("lastName")
                var lastName: String? = null,
                @JsonProperty("marketValueCurrency")
                var marketValueCurrency: String? = null,
                @JsonProperty("name")
                var name: String? = null,
                @JsonProperty("position")
                var position: String? = null,
                @JsonProperty("shortName")
                var shortName: String? = null,
                @JsonProperty("slug")
                var slug: String? = null,
                @JsonProperty("userCount")
                var userCount: Int? = null
            ) {
                data class Country(
                    @JsonProperty("alpha2")
                    var alpha2: String? = null,
                    @JsonProperty("name")
                    var name: String? = null
                )
            }
        }

        data class PlayerColor(
            @JsonProperty("number")
            var number: String? = null,
            @JsonProperty("outline")
            var outline: String? = null,
            @JsonProperty("primary")
            var primary: String? = null
        )

        data class Player(
            @JsonProperty("captain")
            var captain: Boolean? = null,
            @JsonProperty("jerseyNumber")
            var jerseyNumber: String? = null,
            @JsonProperty("player")
            var player: Player? = null,
            @JsonProperty("avgRating")
            var avgRating: Double? = null,
            @JsonProperty("position")
            var position: String? = null,
            @JsonProperty("shirtNumber")
            var shirtNumber: Int? = null,
            @JsonProperty("statistics")
            var statistics: Statistics? = null,
            @JsonProperty("substitute")
            var substitute: Boolean? = null
        ) {
            data class Player(
                @JsonProperty("country")
                var country: Country? = null,
                @JsonProperty("dateOfBirthTimestamp")
                var dateOfBirthTimestamp: Int? = null,
                @JsonProperty("firstName")
                var firstName: String? = null,
                @JsonProperty("id")
                var id: Int? = null,
                @JsonProperty("lastName")
                var lastName: String? = null,
                @JsonProperty("marketValueCurrency")
                var marketValueCurrency: String? = null,
                @JsonProperty("name")
                var name: String? = null,
                @JsonProperty("position")
                var position: String? = null,
                @JsonProperty("shortName")
                var shortName: String? = null,
                @JsonProperty("slug")
                var slug: String? = null,
                @JsonProperty("userCount")
                var userCount: Int? = null
            ) {
                data class Country(
                    @JsonProperty("alpha2")
                    var alpha2: String? = null,
                    @JsonProperty("name")
                    var name: String? = null
                )
            }

            data class Statistics(
                @JsonProperty("accurateCross")
                var accurateCross: Int? = null,
                @JsonProperty("accurateKeeperSweeper")
                var accurateKeeperSweeper: Int? = null,
                @JsonProperty("accurateLongBalls")
                var accurateLongBalls: Int? = null,
                @JsonProperty("accuratePass")
                var accuratePass: Int? = null,
                @JsonProperty("aerialLost")
                var aerialLost: Int? = null,
                @JsonProperty("aerialWon")
                var aerialWon: Int? = null,
                @JsonProperty("blockedScoringAttempt")
                var blockedScoringAttempt: Int? = null,
                @JsonProperty("challengeLost")
                var challengeLost: Int? = null,
                @JsonProperty("dispossessed")
                var dispossessed: Int? = null,
                @JsonProperty("duelLost")
                var duelLost: Int? = null,
                @JsonProperty("duelWon")
                var duelWon: Int? = null,
                @JsonProperty("fouls")
                var fouls: Int? = null,
                @JsonProperty("goalAssist")
                var goalAssist: Int? = null,
                @JsonProperty("goals")
                var goals: Int? = null,
                @JsonProperty("interceptionWon")
                var interceptionWon: Int? = null,
                @JsonProperty("keyPass")
                var keyPass: Int? = null,
                @JsonProperty("minutesPlayed")
                var minutesPlayed: Int? = null,
                @JsonProperty("onTargetScoringAttempt")
                var onTargetScoringAttempt: Int? = null,
                @JsonProperty("outfielderBlock")
                var outfielderBlock: Int? = null,
                @JsonProperty("penaltyConceded")
                var penaltyConceded: Int? = null,
                @JsonProperty("possessionLostCtrl")
                var possessionLostCtrl: Int? = null,
                @JsonProperty("rating")
                var rating: Double? = null,
                @JsonProperty("savedShotsFromInsideTheBox")
                var savedShotsFromInsideTheBox: Int? = null,
                @JsonProperty("saves")
                var saves: Int? = null,
                @JsonProperty("shotOffTarget")
                var shotOffTarget: Int? = null,
                @JsonProperty("totalClearance")
                var totalClearance: Int? = null,
                @JsonProperty("totalContest")
                var totalContest: Int? = null,
                @JsonProperty("totalCross")
                var totalCross: Int? = null,
                @JsonProperty("totalKeeperSweeper")
                var totalKeeperSweeper: Int? = null,
                @JsonProperty("totalLongBalls")
                var totalLongBalls: Int? = null,
                @JsonProperty("totalOffside")
                var totalOffside: Int? = null,
                @JsonProperty("totalPass")
                var totalPass: Int? = null,
                @JsonProperty("totalTackle")
                var totalTackle: Int? = null,
                @JsonProperty("touches")
                var touches: Int? = null,
                @JsonProperty("wasFouled")
                var wasFouled: Int? = null,
                @JsonProperty("wonContest")
                var wonContest: Int? = null
            )
        }
    }

    data class Home(
        @JsonProperty("formation")
        var formation: String? = null,
        @JsonProperty("goalkeeperColor")
        var goalkeeperColor: GoalkeeperColor? = null,
        @JsonProperty("missingPlayers")
        var missingPlayers: List<MissingPlayer?>? = null,
        @JsonProperty("playerColor")
        var playerColor: PlayerColor? = null,
        @JsonProperty("players")
        var players: List<Player?>? = null
    ) {
        data class GoalkeeperColor(
            @JsonProperty("number")
            var number: String? = null,
            @JsonProperty("outline")
            var outline: String? = null,
            @JsonProperty("primary")
            var primary: String? = null
        )

        data class MissingPlayer(
            @JsonProperty("player")
            var player: Player? = null,
            @JsonProperty("reason")
            var reason: Int? = null,
            @JsonProperty("type")
            var type: String? = null
        ) {
            data class Player(
                @JsonProperty("country")
                var country: Country? = null,
                @JsonProperty("dateOfBirthTimestamp")
                var dateOfBirthTimestamp: Int? = null,
                @JsonProperty("firstName")
                var firstName: String? = null,
                @JsonProperty("id")
                var id: Int? = null,
                @JsonProperty("lastName")
                var lastName: String? = null,
                @JsonProperty("marketValueCurrency")
                var marketValueCurrency: String? = null,
                @JsonProperty("name")
                var name: String? = null,
                @JsonProperty("position")
                var position: String? = null,
                @JsonProperty("shortName")
                var shortName: String? = null,
                @JsonProperty("slug")
                var slug: String? = null,
                @JsonProperty("userCount")
                var userCount: Int? = null
            ) {
                data class Country(
                    @JsonProperty("alpha2")
                    var alpha2: String? = null,
                    @JsonProperty("name")
                    var name: String? = null
                )
            }
        }

        data class PlayerColor(
            @JsonProperty("number")
            var number: String? = null,
            @JsonProperty("outline")
            var outline: String? = null,
            @JsonProperty("primary")
            var primary: String? = null
        )

        data class Player(
            @JsonProperty("captain")
            var captain: Boolean? = null,
            @JsonProperty("jerseyNumber")
            var jerseyNumber: String? = null,
            @JsonProperty("player")
            var player: Player? = null,
            @JsonProperty("avgRating")
            var avgRating: Double? = null,
            @JsonProperty("position")
            var position: String? = null,
            @JsonProperty("shirtNumber")
            var shirtNumber: Int? = null,
            @JsonProperty("statistics")
            var statistics: Statistics? = null,
            @JsonProperty("substitute")
            var substitute: Boolean? = null
        ) {
            data class Player(
                @JsonProperty("country")
                var country: Country? = null,
                @JsonProperty("dateOfBirthTimestamp")
                var dateOfBirthTimestamp: Int? = null,
                @JsonProperty("firstName")
                var firstName: String? = null,
                @JsonProperty("id")
                var id: Int? = null,
                @JsonProperty("lastName")
                var lastName: String? = null,
                @JsonProperty("marketValueCurrency")
                var marketValueCurrency: String? = null,
                @JsonProperty("name")
                var name: String? = null,
                @JsonProperty("position")
                var position: String? = null,
                @JsonProperty("shortName")
                var shortName: String? = null,
                @JsonProperty("slug")
                var slug: String? = null,
                @JsonProperty("userCount")
                var userCount: Int? = null
            ) {
                data class Country(
                    @JsonProperty("alpha2")
                    var alpha2: String? = null,
                    @JsonProperty("name")
                    var name: String? = null
                )
            }

            data class Statistics(
                @JsonProperty("accurateCross")
                var accurateCross: Int? = null,
                @JsonProperty("accurateLongBalls")
                var accurateLongBalls: Int? = null,
                @JsonProperty("accuratePass")
                var accuratePass: Int? = null,
                @JsonProperty("aerialLost")
                var aerialLost: Int? = null,
                @JsonProperty("aerialWon")
                var aerialWon: Int? = null,
                @JsonProperty("bigChanceCreated")
                var bigChanceCreated: Int? = null,
                @JsonProperty("bigChanceMissed")
                var bigChanceMissed: Int? = null,
                @JsonProperty("blockedScoringAttempt")
                var blockedScoringAttempt: Int? = null,
                @JsonProperty("challengeLost")
                var challengeLost: Int? = null,
                @JsonProperty("dispossessed")
                var dispossessed: Int? = null,
                @JsonProperty("duelLost")
                var duelLost: Int? = null,
                @JsonProperty("duelWon")
                var duelWon: Int? = null,
                @JsonProperty("fouls")
                var fouls: Int? = null,
                @JsonProperty("goalAssist")
                var goalAssist: Int? = null,
                @JsonProperty("goals")
                var goals: Int? = null,
                @JsonProperty("goodHighClaim")
                var goodHighClaim: Int? = null,
                @JsonProperty("hitWoodwork")
                var hitWoodwork: Int? = null,
                @JsonProperty("interceptionWon")
                var interceptionWon: Int? = null,
                @JsonProperty("keyPass")
                var keyPass: Int? = null,
                @JsonProperty("minutesPlayed")
                var minutesPlayed: Int? = null,
                @JsonProperty("onTargetScoringAttempt")
                var onTargetScoringAttempt: Int? = null,
                @JsonProperty("outfielderBlock")
                var outfielderBlock: Int? = null,
                @JsonProperty("possessionLostCtrl")
                var possessionLostCtrl: Int? = null,
                @JsonProperty("rating")
                var rating: Double? = null,
                @JsonProperty("savedShotsFromInsideTheBox")
                var savedShotsFromInsideTheBox: Int? = null,
                @JsonProperty("saves")
                var saves: Int? = null,
                @JsonProperty("shotOffTarget")
                var shotOffTarget: Int? = null,
                @JsonProperty("totalClearance")
                var totalClearance: Int? = null,
                @JsonProperty("totalContest")
                var totalContest: Int? = null,
                @JsonProperty("totalCross")
                var totalCross: Int? = null,
                @JsonProperty("totalLongBalls")
                var totalLongBalls: Int? = null,
                @JsonProperty("totalOffside")
                var totalOffside: Int? = null,
                @JsonProperty("totalPass")
                var totalPass: Int? = null,
                @JsonProperty("totalTackle")
                var totalTackle: Int? = null,
                @JsonProperty("touches")
                var touches: Int? = null,
                @JsonProperty("wasFouled")
                var wasFouled: Int? = null,
                @JsonProperty("wonContest")
                var wonContest: Int? = null
            )
        }
    }
}