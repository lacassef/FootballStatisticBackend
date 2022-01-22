package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonProperty

data class FootballPlayerAttributeOverview(
    @JsonProperty("averageAttributeOverviews")
    var averageAttributeOverviews: List<AverageAttributeOverview?>? = null,
    @JsonProperty("playerAttributeOverviews")
    var playerAttributeOverviews: List<PlayerAttributeOverview?>? = null
) {
    data class AverageAttributeOverview(
        @JsonProperty("attacking")
        var attacking: Int? = null,
        @JsonProperty("creativity")
        var creativity: Int? = null,
        @JsonProperty("defending")
        var defending: Int? = null,
        @JsonProperty("id")
        var id: Int? = null,
        @JsonProperty("position")
        var position: String? = null,
        @JsonProperty("tactical")
        var tactical: Int? = null,
        @JsonProperty("saves")
        var saves: Int? = null,
        @JsonProperty("anticipation")
        var anticipation: Int? = null,
        @JsonProperty("ballDistribution")
        var ballDistribution: Int? = null,
        @JsonProperty("aerial")
        var aerial: Int? = null,
        @JsonProperty("technical")
        var technical: Int? = null,
        @JsonProperty("yearShift")
        var yearShift: Int? = null
    )

    data class PlayerAttributeOverview(
        @JsonProperty("attacking")
        var attacking: Int? = null,
        @JsonProperty("creativity")
        var creativity: Int? = null,
        @JsonProperty("defending")
        var defending: Int? = null,
        @JsonProperty("id")
        var id: Int? = null,
        @JsonProperty("position")
        var position: String? = null,
        @JsonProperty("tactical")
        var tactical: Int? = null,
        @JsonProperty("saves")
        var saves: Int? = null,
        @JsonProperty("anticipation")
        var anticipation: Int? = null,
        @JsonProperty("ballDistribution")
        var ballDistribution: Int? = null,
        @JsonProperty("aerial")
        var aerial: Int? = null,
        @JsonProperty("technical")
        var technical: Int? = null,
        @JsonProperty("yearShift")
        var yearShift: Int? = null
    )
}