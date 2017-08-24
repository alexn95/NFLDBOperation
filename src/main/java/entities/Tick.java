

package entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tick {

@SerializedName("datetime")
@Expose
private String datetime;

/**
* No args constructor for use in serialization
* 
*/
public Tick() {
}

/**
* 
* @param datetime
*/
public Tick(String datetime) {
super();
this.datetime = datetime;
}

public String getDatetime() {
return datetime;
}

public void setDatetime(String datetime) {
this.datetime = datetime;
}

}