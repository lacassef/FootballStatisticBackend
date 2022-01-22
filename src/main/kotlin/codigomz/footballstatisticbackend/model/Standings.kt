package codigomz.footballstatisticbackend.model

data class Standings(
    var rows: List<StandingRow> = listOf()
){
    data class StandingRow(
        var draws: Int = 0, var wins: Int = 0, var losses: Int = 0, var position: Int = 0,
        var scored: Int = 0, var scoredAgainst: Int = 0, var promotion: String = "",
        var points: Int = 0
    )
}