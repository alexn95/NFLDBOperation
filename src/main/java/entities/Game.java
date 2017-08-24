package entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Game {

@SerializedName("game_id")
@Expose
private String gameId;
@SerializedName("guests_score")
@Expose
private Integer guestsScore;
@SerializedName("guests_team_id")
@Expose
private String guestsTeamId;
@SerializedName("home_score")
@Expose
private Integer homeScore;
@SerializedName("home_team_id")
@Expose
private String homeTeamId;
@SerializedName("is_tie_breaker")
@Expose
private Boolean isTieBreaker;
@SerializedName("week_id")
@Expose
private String weekId;

/**
* No args constructor for use in serialization
* 
*/
public Game() {
}

/**
* 
* @param guestsTeamId
* @param weekId
* @param homeScore
* @param isTieBreaker
* @param guestsScore
* @param homeTeamId
* @param gameId
*/
public Game(String gameId, Integer guestsScore, String guestsTeamId, Integer homeScore, String homeTeamId, Boolean isTieBreaker, String weekId) {
super();
this.gameId = gameId;
this.guestsScore = guestsScore;
this.guestsTeamId = guestsTeamId;
this.homeScore = homeScore;
this.homeTeamId = homeTeamId;
this.isTieBreaker = isTieBreaker;
this.weekId = weekId;
}

public String getGameId() {
return gameId;
}

public void setGameId(String gameId) {
this.gameId = gameId;
}

public Integer getGuestsScore() {
return guestsScore;
}

public void setGuestsScore(Integer guestsScore) {
this.guestsScore = guestsScore;
}

public String getGuestsTeamId() {
return guestsTeamId;
}

public void setGuestsTeamId(String guestsTeamId) {
this.guestsTeamId = guestsTeamId;
}

public Integer getHomeScore() {
return homeScore;
}

public void setHomeScore(Integer homeScore) {
this.homeScore = homeScore;
}

public String getHomeTeamId() {
return homeTeamId;
}

public void setHomeTeamId(String homeTeamId) {
this.homeTeamId = homeTeamId;
}

public Boolean getIsTieBreaker() {
return isTieBreaker;
}

public void setIsTieBreaker(Boolean isTieBreaker) {
this.isTieBreaker = isTieBreaker;
}

public String getWeekId() {
return weekId;
}

public void setWeekId(String weekId) {
this.weekId = weekId;
}

public String getWinnerTeamId(){
    if (homeScore > guestsScore) return homeTeamId;
    if (homeScore < guestsScore) return guestsTeamId;
    return "-1";
}

}