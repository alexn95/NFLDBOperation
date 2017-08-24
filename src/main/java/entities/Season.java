
package entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Season {

@SerializedName("begin_date")
@Expose
private String beginDate;
@SerializedName("end_date")
@Expose
private String endDate;
@SerializedName("game_weeks")
@Expose
private Integer gameWeeks;
@SerializedName("season_id")
@Expose
private String seasonId;

/**
* No args constructor for use in serialization
* 
*/
public Season() {
}

/**
* 
* @param seasonId
* @param gameWeeks
* @param endDate
* @param beginDate
*/
public Season(String beginDate, String endDate, Integer gameWeeks, String seasonId) {
super();
this.beginDate = beginDate;
this.endDate = endDate;
this.gameWeeks = gameWeeks;
this.seasonId = seasonId;
}

public String getBeginDate() {
return beginDate;
}

public void setBeginDate(String beginDate) {
this.beginDate = beginDate;
}

public String getEndDate() {
return endDate;
}

public void setEndDate(String endDate) {
this.endDate = endDate;
}

public Integer getGameWeeks() {
return gameWeeks;
}

public void setGameWeeks(Integer gameWeeks) {
this.gameWeeks = gameWeeks;
}

public String getSeasonId() {
return seasonId;
}

public void setSeasonId(String seasonId) {
this.seasonId = seasonId;
}

}