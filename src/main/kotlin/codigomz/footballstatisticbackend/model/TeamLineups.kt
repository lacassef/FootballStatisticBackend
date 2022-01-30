package codigomz.footballstatisticbackend.model

data class TeamLineups(
    var players: List<Player> = listOf(),
    var missingPlayers: List<Player> = listOf(),
    var formation: String = "", var lines: MutableList<Int> = mutableListOf()
)