package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class FootballMatchStatistics(
    @JsonProperty("statistics")
    var statistics: List<Statistic?>? = null
) {
    data class Statistic(
        @JsonProperty("groups")
        var groups: List<Group?>? = null,
        @JsonProperty("period")
        var period: String? = null
    ) {
        data class Group(
            @JsonProperty("groupName")
            var groupName: String? = null,
            @JsonProperty("statisticsItems")
            var statisticsItems: List<StatisticsItem?>? = null
        ) {
            data class StatisticsItem(
                @JsonProperty("away")
                var away: String? = null,
                @JsonProperty("compareCode")
                var compareCode: Int? = null,
                @JsonProperty("home")
                var home: String? = null,
                @JsonProperty("name")
                var name: String? = null
            )
        }
    }
}