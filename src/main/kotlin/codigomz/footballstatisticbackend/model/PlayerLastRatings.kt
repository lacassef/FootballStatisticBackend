package codigomz.footballstatisticbackend.model

data class PlayerLastRatings (
        var id: Int = 0,
        var isHome: Boolean = false,
        var opponent: Team = Team(),
        var rating: Double = 0.0,
        var date: String = "",
        var time: String = ""
        )