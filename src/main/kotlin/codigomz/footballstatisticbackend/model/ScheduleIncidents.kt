package codigomz.footballstatisticbackend.model

/**
 * codes:
 * 0 - golo normal
 * 1 - golo penalty
 * 2 - substituicao
 * 3 - primeiro tempo terminado
 * 4 - segundo tempo terminado
 * 5 - var cancelou golo
 * 6 - penalty falhado
 * 7 - autogolo
 * 8 - cartao amarelo
 * 9 - segundo cartao amarelo
 * 10 - cartao vermelho
 * 11 - prolongamento terminado
 * 12 - penalty terminado
 * 13 - cobranca de penalidade falhado
 * 14 - cobranca de penalidade acertado
 **/

data class ScheduleIncidents(
    var code: Int = -1, var awayScore: Int = 0, var homeScore: Int = 0,
    var time: Int = 0, var isHome: Boolean = false, var player: Player = Player(),
    var playerIn: Player = Player(), var playerOut: Player = Player(),
    var addedTime: Int = 0
)
