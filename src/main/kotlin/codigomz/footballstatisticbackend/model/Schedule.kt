package codigomz.footballstatisticbackend.model

data class Schedule(
    var id: Int = 0, var home: Team = Team(), var away: Team = Team(),
    var date: String="", var time: String = "", var status: Int = 0,
    var tournament: Tournament = Tournament(), var hasLines: Boolean = false ,
    var customId: String = "", var live: Live = Live(), var venue: Venue = Venue()
){
    data class Live(
        var periodStart: Long = 0, var period: Int = 0
    )
    data class Venue(
        var city: String = "", var stadium: String = ""
    )
}
