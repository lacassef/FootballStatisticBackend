package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonProperty

data class FootballMatchHead2Head(
    @JsonProperty("events")
    var events: List<Event?>? = null
) {
    data class Event(
        @JsonProperty("awayRedCards")
        var awayRedCards: Int? = null,
        @JsonProperty("awayScore")
        var awayScore: AwayScore? = null,
        @JsonProperty("awayTeam")
        var awayTeam: AwayTeam? = null,
        @JsonProperty("changes")
        var changes: Changes? = null,
        @JsonProperty("coverage")
        var coverage: Int? = null,
        @JsonProperty("customId")
        var customId: String? = null,
        @JsonProperty("finalResultOnly")
        var finalResultOnly: Boolean? = null,
        @JsonProperty("hasEventPlayerHeatMap")
        var hasEventPlayerHeatMap: Boolean? = null,
        @JsonProperty("hasEventPlayerStatistics")
        var hasEventPlayerStatistics: Boolean? = null,
        @JsonProperty("hasGlobalHighlights")
        var hasGlobalHighlights: Boolean? = null,
        @JsonProperty("homeScore")
        var homeScore: HomeScore? = null,
        @JsonProperty("homeTeam")
        var homeTeam: HomeTeam? = null,
        @JsonProperty("id")
        var id: Int? = null,
        @JsonProperty("roundInfo")
        var roundInfo: RoundInfo? = null,
        @JsonProperty("slug")
        var slug: String? = null,
        @JsonProperty("startTimestamp")
        var startTimestamp: Int? = null,
        @JsonProperty("status")
        var status: Status? = null,
        @JsonProperty("time")
        var time: Time? = null,
        @JsonProperty("tournament")
        var tournament: Tournament? = null,
        @JsonProperty("winnerCode")
        var winnerCode: Int? = null
    ) {
        data class AwayScore(
            @JsonProperty("current")
            var current: Int? = null,
            @JsonProperty("display")
            var display: Int? = null,
            @JsonProperty("normaltime")
            var normaltime: Int? = null,
            @JsonProperty("period1")
            var period1: Int? = null,
            @JsonProperty("period2")
            var period2: Int? = null
        )

        data class AwayTeam(
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
            @JsonProperty("subTeams")
            var subTeams: List<Any?>? = null,
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

        data class Changes(
            @JsonProperty("changeTimestamp")
            var changeTimestamp: Int? = null,
            @JsonProperty("changes")
            var changes: List<String?>? = null
        )

        data class HomeScore(
            @JsonProperty("current")
            var current: Int? = null,
            @JsonProperty("display")
            var display: Int? = null,
            @JsonProperty("normaltime")
            var normaltime: Int? = null,
            @JsonProperty("period1")
            var period1: Int? = null,
            @JsonProperty("period2")
            var period2: Int? = null
        )

        data class HomeTeam(
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
            @JsonProperty("subTeams")
            var subTeams: List<Any?>? = null,
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

        data class RoundInfo(
            @JsonProperty("round")
            var round: Int? = null
        )

        data class Status(
            @JsonProperty("code")
            var code: Int? = null,
            @JsonProperty("description")
            var description: String? = null,
            @JsonProperty("type")
            var type: String? = null
        )

        data class Time(
            @JsonProperty("currentPeriodStartTimestamp")
            var currentPeriodStartTimestamp: Int? = null,
            @JsonProperty("injuryTime1")
            var injuryTime1: Int? = null,
            @JsonProperty("injuryTime2")
            var injuryTime2: Int? = null
        )

        data class Tournament(
            @JsonProperty("category")
            var category: Category? = null,
            @JsonProperty("id")
            var id: Int? = null,
            @JsonProperty("name")
            var name: String? = null,
            @JsonProperty("slug")
            var slug: String? = null,
            @JsonProperty("uniqueTournament")
            var uniqueTournament: UniqueTournament? = null
        ) {
            data class Category(
                @JsonProperty("alpha2")
                var alpha2: String? = null,
                @JsonProperty("flag")
                var flag: String? = null,
                @JsonProperty("id")
                var id: Int? = null,
                @JsonProperty("name")
                var name: String? = null,
                @JsonProperty("slug")
                var slug: String? = null,
                @JsonProperty("sport")
                var sport: Sport? = null
            ) {
                data class Sport(
                    @JsonProperty("id")
                    var id: Int? = null,
                    @JsonProperty("name")
                    var name: String? = null,
                    @JsonProperty("slug")
                    var slug: String? = null
                )
            }

            data class UniqueTournament(
                @JsonProperty("category")
                var category: Category? = null,
                @JsonProperty("hasEventPlayerStatistics")
                var hasEventPlayerStatistics: Boolean? = null,
                @JsonProperty("id")
                var id: Int? = null,
                @JsonProperty("name")
                var name: String? = null,
                @JsonProperty("slug")
                var slug: String? = null,
                @JsonProperty("userCount")
                var userCount: Int? = null
            ) {
                data class Category(
                    @JsonProperty("alpha2")
                    var alpha2: String? = null,
                    @JsonProperty("flag")
                    var flag: String? = null,
                    @JsonProperty("id")
                    var id: Int? = null,
                    @JsonProperty("name")
                    var name: String? = null,
                    @JsonProperty("slug")
                    var slug: String? = null,
                    @JsonProperty("sport")
                    var sport: Sport? = null
                ) {
                    data class Sport(
                        @JsonProperty("id")
                        var id: Int? = null,
                        @JsonProperty("name")
                        var name: String? = null,
                        @JsonProperty("slug")
                        var slug: String? = null
                    )
                }
            }
        }
    }
}