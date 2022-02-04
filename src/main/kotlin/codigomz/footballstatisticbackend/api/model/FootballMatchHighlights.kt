package codigomz.footballstatisticbackend.api.model


import com.fasterxml.jackson.annotation.JsonProperty

data class FootballMatchHighlights(
    @JsonProperty("highlights")
    var highlights: List<Highlight?>? = null
) {
    data class Highlight(
        @JsonProperty("createdAtTimestamp")
        var createdAtTimestamp: Int? = null,
        @JsonProperty("doFollow")
        var doFollow: Boolean? = null,
        @JsonProperty("id")
        var id: Int? = null,
        @JsonProperty("mediaType")
        var mediaType: Int? = null,
        @JsonProperty("sourceUrl")
        var sourceUrl: String? = null,
        @JsonProperty("subtitle")
        var subtitle: String? = null,
        @JsonProperty("thumbnailUrl")
        var thumbnailUrl: String? = null,
        @JsonProperty("title")
        var title: String? = null,
        @JsonProperty("url")
        var url: String? = null
    )
}