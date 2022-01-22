package codigomz.footballstatisticbackend.model

data class Schedule(
    var id: Int = 0, var home: Team = Team(), var away: Team = Team(),
    var date: String="", var time: String = "", var status: Int = 0,
    var tournament: Tournament = Tournament(), var hasLines: Boolean = false ,
    var customId: String = ""
)
