package entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pick {

@SerializedName("away")
@Expose
private String away;
@SerializedName("game_id")
@Expose
private String gameId;
@SerializedName("home")
@Expose
private String home;
@SerializedName("is_tie_breaker")
@Expose
private Boolean isTieBreaker;
@SerializedName("pick_id")
@Expose
private String pickId;
@SerializedName("point")
@Expose
private Integer point;
@SerializedName("selected_team_id")
@Expose
private String selectedTeamId;
@SerializedName("user_id")
@Expose
private String userId;
@SerializedName("week_id")
@Expose
private String weekId;

/**
* No args constructor for use in serialization
* 
*/
public Pick() {
}

/**
* 
* @param selectedTeamId
* @param point
* @param home
* @param away
* @param weekId
* @param isTieBreaker
* @param userId
* @param gameId
* @param pickId
*/
public Pick(String away, String gameId, String home, Boolean isTieBreaker, String pickId, Integer point, String selectedTeamId, String userId, String weekId) {
super();
this.away = away;
this.gameId = gameId;
this.home = home;
this.isTieBreaker = isTieBreaker;
this.pickId = pickId;
this.point = point;
this.selectedTeamId = selectedTeamId;
this.userId = userId;
this.weekId = weekId;
}

public String getAway() {
return away;
}

public void setAway(String away) {
this.away = away;
}

public String getGameId() {
return gameId;
}

public void setGameId(String gameId) {
this.gameId = gameId;
}

public String getHome() {
return home;
}

public void setHome(String home) {
this.home = home;
}

public Boolean getIsTieBreaker() {
return isTieBreaker;
}

public void setIsTieBreaker(Boolean isTieBreaker) {
this.isTieBreaker = isTieBreaker;
}

public String getPickId() {
return pickId;
}

public void setPickId(String pickId) {
this.pickId = pickId;
}

public Integer getPoint() {
return point;
}

public void setPoint(Integer point) {
this.point = point;
}

public String getSelectedTeamId() {
return selectedTeamId;
}

public void setSelectedTeamId(String selectedTeamId) {
this.selectedTeamId = selectedTeamId;
}

public String getUserId() {
return userId;
}

public void setUserId(String userId) {
this.userId = userId;
}

public String getWeekId() {
return weekId;
}

public void setWeekId(String weekId) {
this.weekId = weekId;
}

}