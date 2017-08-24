

package entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Week {

@SerializedName("begin_date")
@Expose
private String beginDate;
@SerializedName("end_date")
@Expose
private String endDate;
@SerializedName("freezing_date_time")
@Expose
private String freezingDateTime;
@SerializedName("season_id")
@Expose
private String seasonId;
@SerializedName("week_id")
@Expose
private String weekId;
@SerializedName("week_number")
@Expose
private Integer weekNumber;

/**
* No args constructor for use in serialization
* 
*/
public Week() {
}

/**
* 
* @param freezingDateTime
* @param weekId
* @param weekNumber
* @param seasonId
* @param endDate
* @param beginDate
*/
public Week(String beginDate, String endDate, String freezingDateTime, String seasonId, String weekId, Integer weekNumber) {
super();
this.beginDate = beginDate;
this.endDate = endDate;
this.freezingDateTime = freezingDateTime;
this.seasonId = seasonId;
this.weekId = weekId;
this.weekNumber = weekNumber;
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

public String getFreezingDateTime() {
return freezingDateTime;
}

public void setFreezingDateTime(String freezingDateTime) {
this.freezingDateTime = freezingDateTime;
}

public String getSeasonId() {
return seasonId;
}

public void setSeasonId(String seasonId) {
this.seasonId = seasonId;
}

public String getWeekId() {
return weekId;
}

public void setWeekId(String weekId) {
this.weekId = weekId;
}

public Integer getWeekNumber() {
return weekNumber;
}

public void setWeekNumber(Integer weekNumber) {
this.weekNumber = weekNumber;
}

}