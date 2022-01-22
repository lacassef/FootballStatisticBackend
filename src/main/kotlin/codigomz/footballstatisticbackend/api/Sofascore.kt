package codigomz.footballstatisticbackend.api

import codigomz.footballstatisticbackend.api.model.*
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

object Sofascore {
    private val service = Retrofit.Builder().baseUrl("https://api.sofascore.com/api/v1/")
        .addConverterFactory(
            JacksonConverterFactory.create(
                ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            ))
        .build()
        .create(
            Api::
        class.java)
    fun getApi() = service
}

interface Api{
    //https://api.sofascore.com/api/v1/sport/football/scheduled-events/2021-09-19
    @GET("sport/football/scheduled-events/{year}-{month}-{day}")
    fun getMatchesByDate(@Path("year") year: String, @Path("month") month: String,
                         @Path("day") day: String): Call<FootballEventsByDate>

    //https://api.sofascore.com/api/v1/sport/football/events/live
    @GET("sport/football/events/live")
    fun getLiveMatches(): Call<FootballLiveMatches>

    //https://api.sofascore.com/api/v1/event/9576398
    @GET("event/{id}")
    fun getMatchById(@Path("id") id: Int): Call<FootballMatchById>

    //https://api.sofascore.com/api/v1/event/9576398/lineups
    @GET("event/{id}/lineups")
    fun getMatchLineups(@Path("id") id: Int): Call<FootballMatchLineup>

    //https://api.sofascore.com/api/v1/event/9540945/statistics
    @GET("event/{id}/statistics")
    fun getMatchStatistics(@Path("id") id: Int): Call<FootballMatchStatistics>

    //https://api.sofascore.com/api/v1/event/9605328/graph
    @GET("event/{id}/graph")
    fun getMatchGraph(@Path("id") id: Int): Call<FootballMatchGraph>

    //https://api.sofascore.com/api/v1/event/9540945/incidents
    @GET("event/{id}/incidents")
    fun getMatchIncidents(@Path("id") id: Int): Call<FootbalMatchIncidents>

    //https://api.sofascore.com/api/v1/team/2701/events/last/0
    @GET("team/{id}/events/last/{page}")
    fun getLastMatchesByTeamId(@Path("id") id: Int, @Path("page") page: Int):
            Call<FootballTeamLastMatches>

    //https://api.sofascore.com/api/v1/team/2701/unique-tournament/23/season/37475/statistics/overall
    @GET("team/{tid}/unique-tournament/{unid}/season/{sid}/statistics/overall")
    fun getTeamOverallStatisticsById(@Path("tid") teamId: Int, @Path("unid") uniqueTournId: Int,
                                     @Path("sid") seasonId: Int): Call<FootballTeamOverallStatisticsBySeasonIdAndUniqueTournId>

    //https://api.sofascore.com/api/v1/player/959820/unique-tournament/8/season/37223/last-ratings
    @GET("player/{id}/unique-tournament/{tid}/season/{sid}/last-ratings")
    fun getPlayerLastRatings(@Path("id") id: Int, @Path("tid") uniTournaId: Int,
                             @Path("sid") seasonId: Int): Call<FootballPlayerLastRatings>

    //https://api.sofascore.com/api/v1/player/959820/unique-tournament/8/season/37223/statistics/overall
    @GET("player/{id}/unique-tournament/{tid}/season/{sid}/statistics/overall")
    fun getPlayerStatisticsOverall(@Path("id") id: Int, @Path("tid") uniTournaId: Int,
                                   @Path("sid") seasonId: Int): Call<FootballPlayerStatisticsOverall>

    //https://api.sofascore.com/api/v1/player/3306/attribute-overviews
    @GET("player/{id}/attribute-overviews")
    fun getPlayerAttribute(@Path("id") id: Int): Call<FootballPlayerAttributeOverview>

    //https://api.sofascore.com/api/v1/event/BgbsEgb/h2h/events
    @GET("event/{cid}/h2h/events")
    fun getMatchHead2Head(@Path("cid") customId: String): Call<FootballMatchHead2Head>

    //https://api.sofascore.com/api/v1/unique-tournament/8/season/37223/standings/total
    @GET("unique-tournament/{unid}/season/{sid}/standings/total")
    fun getLeagueStandingsTotal(@Path("unid") uniTournId: Int, @Path("sid") seasonId: Int):
            Call<FootballLeagueStandingsTotal>

    //https://api.sofascore.com/api/v1/unique-tournament/8/season/37223/team-events/home
    @GET("unique-tournament/{unid}/season/{sid}/standings/home")
    fun getLeagueStandingsHome(@Path("unid") uniTournId: Int, @Path("sid") seasonId: Int):
            Call<FootballLeagueStandingsHome>

    //https://api.sofascore.com/api/v1/unique-tournament/8/season/37223/standings/away
    @GET("unique-tournament/{unid}/season/{sid}/standings/away")
    fun getLeagueStandingsAway(@Path("unid") uniTournId: Int, @Path("sid") seasonId: Int):
            Call<FootballLeagueStandingsAway>

}
