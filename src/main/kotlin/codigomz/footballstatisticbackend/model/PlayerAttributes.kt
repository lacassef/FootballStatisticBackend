package codigomz.footballstatisticbackend.model

data class PlayerAttributes(
    var player: Attributes = Attributes(), var average: Attributes = Attributes()
){
    data class Attributes(var attacking: Int = 0,
                          var creativity: Int = 0,
                          var defending: Int = 0,
                          var position: String = "",
                          var tactical: Int = 0,
                          var saves: Int = 0,
                          var anticipation: Int = 0,
                          var ballDistribution: Int = 0,
                          var aerial: Int = 0,
                          var technical: Int = 0)
}
