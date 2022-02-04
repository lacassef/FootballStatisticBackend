package codigomz.footballstatisticbackend.model

data class BettingPeriods(
    var graph: PeriodsGraph = PeriodsGraph(), var goals: GoalPeriods = GoalPeriods(),
    var goalsAgg: GoalPeriods = GoalPeriods()
)
