package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonProperty

data class FootballMatchGraph(
    @JsonProperty("graphPoints")
    var graphPoints: List<GraphPoint?>?,
    @JsonProperty("periodCount")
    var periodCount: Int?,
    @JsonProperty("periodTime")
    var periodTime: Any?
) {
    data class GraphPoint(
        @JsonProperty("minute")
        var minute: Double?,
        @JsonProperty("value")
        var value: Int?
    )
}