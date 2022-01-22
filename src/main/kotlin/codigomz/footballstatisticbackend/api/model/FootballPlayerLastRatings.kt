package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonProperty

data class FootballPlayerLastRatings(
    @JsonProperty("lastRatings")
    var lastRatings: List<LastRating?>? = null
) {
    data class LastRating(
        @JsonProperty("eventId")
        var eventId: Int? = null,
        @JsonProperty("isHome")
        var isHome: Boolean? = null,
        @JsonProperty("opponent")
        var opponent: Opponent? = null,
        @JsonProperty("rating")
        var rating: Double? = null,
        @JsonProperty("startTimestamp")
        var startTimestamp: Int? = null
    ) {
        data class Opponent(
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
}