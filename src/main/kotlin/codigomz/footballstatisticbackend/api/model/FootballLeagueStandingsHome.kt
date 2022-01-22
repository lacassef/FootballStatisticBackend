package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonProperty

data class FootballLeagueStandingsHome(
    @JsonProperty("standings")
    var standings: List<Standing?>? = null
) {
    data class Standing(
        @JsonProperty("descriptions")
        var descriptions: List<Any?>? = null,
        @JsonProperty("id")
        var id: Int? = null,
        @JsonProperty("name")
        var name: String? = null,
        @JsonProperty("rows")
        var rows: List<Row?>? = null,
        @JsonProperty("tieBreakingRule")
        var tieBreakingRule: TieBreakingRule? = null,
        @JsonProperty("tournament")
        var tournament: Tournament? = null,
        @JsonProperty("type")
        var type: String? = null,
        @JsonProperty("updatedAtTimestamp")
        var updatedAtTimestamp: Int? = null
    ) {
        data class Row(
            @JsonProperty("descriptions")
            var descriptions: List<Any?>? = null,
            @JsonProperty("draws")
            var draws: Int? = null,
            @JsonProperty("id")
            var id: Int? = null,
            @JsonProperty("losses")
            var losses: Int? = null,
            @JsonProperty("matches")
            var matches: Int? = null,
            @JsonProperty("points")
            var points: Int? = null,
            @JsonProperty("position")
            var position: Int? = null,
            @JsonProperty("promotion")
            var promotion: Promotion? = null,
            @JsonProperty("scoresAgainst")
            var scoresAgainst: Int? = null,
            @JsonProperty("scoresFor")
            var scoresFor: Int? = null,
            @JsonProperty("team")
            var team: Team? = null,
            @JsonProperty("wins")
            var wins: Int? = null
        ) {
            data class Promotion(
                @JsonProperty("id")
                var id: Int? = null,
                @JsonProperty("text")
                var text: String? = null
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

        data class TieBreakingRule(
            @JsonProperty("id")
            var id: Int? = null,
            @JsonProperty("text")
            var text: String? = null
        )

        data class Tournament(
            @JsonProperty("category")
            var category: Category? = null,
            @JsonProperty("id")
            var id: Int? = null,
            @JsonProperty("name")
            var name: String? = null,
            @JsonProperty("priority")
            var priority: Int? = null,
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