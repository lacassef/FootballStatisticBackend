package codigomz.footballstatisticbackend.model

data class ScheduleLineup(
    var home: TeamLineups = TeamLineups(),
    var away: TeamLineups = TeamLineups(),
    var confirmed: Boolean = false
)