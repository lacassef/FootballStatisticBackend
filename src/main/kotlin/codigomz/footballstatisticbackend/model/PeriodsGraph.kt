package codigomz.footballstatisticbackend.model

import org.springframework.scheduling.support.ScheduledMethodRunnable

//periods
//1 - from 1'- 15'
//2 - from 16' - 30'
//3 - from 31' - 45'
//4 - from 46' - 60'
//5 - from 61' - 75'
//6 - from 76' - 90'

data class PeriodsGraph(
  var pOne: Double = 0.0, var pTwo: Double = 0.0, var pThree: Double = 0.0,
  var pFour: Double = 0.0, var pFive: Double = 0.0, var pSix: Double = 0.0
)

data class PeriodIntermediario(
    var graph: ScheduleGraph = ScheduleGraph(), var home: Boolean = false
)

data class PeriodsFinale(
    var pOne: MutableList<Double> = mutableListOf(), var pTwo: MutableList<Double> = mutableListOf(),
    var pThree: MutableList<Double> = mutableListOf(),
    var pFour: MutableList<Double> = mutableListOf(), var pFive: MutableList<Double> = mutableListOf(),
    var pSix: MutableList<Double> = mutableListOf()
)