package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonProperty

data class FootbalMatchIncidents(
    @JsonProperty("incidents")
    var incidents: List<Incident?>? = null
) {
    data class Incident(
        @JsonProperty("addedTime")
        var addedTime: Int? = null,
        @JsonProperty("awayScore")
        var awayScore: Int? = null,
        @JsonProperty("confirmed")
        var confirmed: Boolean? = null,
        @JsonProperty("homeScore")
        var homeScore: Int? = null,
        @JsonProperty("id")
        var id: Int? = null,
        @JsonProperty("incidentClass")
        var incidentClass: String? = null,
        @JsonProperty("incidentType")
        var incidentType: String? = null,
        @JsonProperty("isHome")
        var isHome: Boolean? = null,
        @JsonProperty("isLive")
        var isLive: Boolean? = null,
        @JsonProperty("length")
        var length: Int? = null,
        @JsonProperty("player")
        var player: Player? = null,
        @JsonProperty("playerIn")
        var playerIn: PlayerIn? = null,
        @JsonProperty("playerName")
        var playerName: String? = null,
        @JsonProperty("playerOut")
        var playerOut: PlayerOut? = null,
        @JsonProperty("reason")
        var reason: String? = null,
        @JsonProperty("text")
        var text: String? = null,
        @JsonProperty("time")
        var time: Int? = null
    ) {
        data class Player(
            @JsonProperty("firstName")
            var firstName: String? = null,
            @JsonProperty("id")
            var id: Int? = null,
            @JsonProperty("lastName")
            var lastName: String? = null,
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
        )

        data class PlayerIn(
            @JsonProperty("firstName")
            var firstName: String? = null,
            @JsonProperty("id")
            var id: Int? = null,
            @JsonProperty("lastName")
            var lastName: String? = null,
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
        )

        data class PlayerOut(
            @JsonProperty("firstName")
            var firstName: String? = null,
            @JsonProperty("id")
            var id: Int? = null,
            @JsonProperty("lastName")
            var lastName: String? = null,
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
        )
    }
}