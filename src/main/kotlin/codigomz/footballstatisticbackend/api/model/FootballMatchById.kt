package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonProperty

data class FootballMatchById(
    @JsonProperty("event")
    var event: Event? = null
) {
    data class Event(
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
        @JsonProperty("defaultPeriodCount")
        var defaultPeriodCount: Int? = null,
        @JsonProperty("detailId")
        var detailId: Int? = null,
        @JsonProperty("fanRatingEvent")
        var fanRatingEvent: Boolean? = null,
        @JsonProperty("finalResultOnly")
        var finalResultOnly: Boolean? = null,
        @JsonProperty("hasGlobalHighlights")
        var hasGlobalHighlights: Boolean? = null,
        @JsonProperty("homeScore")
        var homeScore: HomeScore? = null,
        @JsonProperty("homeTeam")
        var homeTeam: HomeTeam? = null,
        @JsonProperty("id")
        var id: Int? = null,
        @JsonProperty("referee")
        var referee: Referee? = null,
        @JsonProperty("roundInfo")
        var roundInfo: RoundInfo? = null,
        @JsonProperty("season")
        var season: Season? = null,
        @JsonProperty("seasonStatisticsType")
        var seasonStatisticsType: String? = null,
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
        @JsonProperty("venue")
        var venue: Venue? = null,
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
            @JsonProperty("country")
            var country: Country? = null,
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
            data class Country(
                @JsonProperty("alpha2")
                var alpha2: String? = null,
                @JsonProperty("name")
                var name: String? = null
            )

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
            var changeTimestamp: Int? = null
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
            @JsonProperty("country")
            var country: Country? = null,
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
            data class Country(
                @JsonProperty("alpha2")
                var alpha2: String? = null,
                @JsonProperty("name")
                var name: String? = null
            )

            data class TeamColors(
                @JsonProperty("primary")
                var primary: String? = null,
                @JsonProperty("secondary")
                var secondary: String? = null,
                @JsonProperty("text")
                var text: String? = null
            )
        }

        data class Referee(
            @JsonProperty("country")
            var country: Country? = null,
            @JsonProperty("games")
            var games: Int? = null,
            @JsonProperty("id")
            var id: Int? = null,
            @JsonProperty("name")
            var name: String? = null,
            @JsonProperty("redCards")
            var redCards: Int? = null,
            @JsonProperty("sport")
            var sport: Sport? = null,
            @JsonProperty("yellowCards")
            var yellowCards: Int? = null,
            @JsonProperty("yellowRedCards")
            var yellowRedCards: Int? = null
        ) {
            data class Country(
                @JsonProperty("alpha2")
                var alpha2: String? = null,
                @JsonProperty("name")
                var name: String? = null
            )

            data class Sport(
                @JsonProperty("id")
                var id: Int? = null,
                @JsonProperty("name")
                var name: String? = null,
                @JsonProperty("slug")
                var slug: String? = null
            )
        }

        data class RoundInfo(
            @JsonProperty("round")
            var round: Int? = null
        )

        data class Season(
            @JsonProperty("id")
            var id: Int? = null,
            @JsonProperty("name")
            var name: String? = null,
            @JsonProperty("year")
            var year: String? = null
        )

        data class Status(
            @JsonProperty("code")
            var code: Int? = null,
            @JsonProperty("description")
            var description: String? = null,
            @JsonProperty("type")
            var type: String? = null
        )

        class Time

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

        data class Venue(
            @JsonProperty("city")
            var city: City? = null,
            @JsonProperty("country")
            var country: Country? = null,
            @JsonProperty("id")
            var id: Int? = null,
            @JsonProperty("stadium")
            var stadium: Stadium? = null
        ) {
            data class City(
                @JsonProperty("name")
                var name: String? = null
            )

            data class Country(
                @JsonProperty("alpha2")
                var alpha2: String? = null,
                @JsonProperty("name")
                var name: String? = null
            )

            data class Stadium(
                @JsonProperty("capacity")
                var capacity: Int? = null,
                @JsonProperty("name")
                var name: String? = null
            )
        }
    }
}