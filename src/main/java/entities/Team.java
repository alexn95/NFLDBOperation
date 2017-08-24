

package entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {

@SerializedName("name")
@Expose
private String name;
@SerializedName("team_id")
@Expose
private String teamId;

/**
* No args constructor for use in serialization
* 
*/
public Team() {
}

/**
* 
* @param name
* @param teamId
*/
public Team(String name, String teamId) {
super();
this.name = name;
this.teamId = teamId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getTeamId() {
return teamId;
}

public void setTeamId(String teamId) {
this.teamId = teamId;
}

}