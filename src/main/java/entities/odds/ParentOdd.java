        package entities.odds;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

        import java.util.ArrayList;

public class ParentOdd {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("HomeTeam")
    @Expose
    private String homeTeam;
    @SerializedName("AwayTeam")
    @Expose
    private String awayTeam;
    @SerializedName("Sport")
    @Expose
    private Integer sport;
    @SerializedName("MatchTime")
    @Expose
    private String matchTime;
    @SerializedName("Odds")
    @Expose
    private ArrayList<Odd> odds;
    @SerializedName("Details")
    @Expose
    private String details;
    @SerializedName("HomeROT")
    @Expose
    private String homeROT;
    @SerializedName("AwayROT")
    @Expose
    private String awayROT;

    /**
     * No args constructor for use in serialization
     */
    public ParentOdd() {
    }

    public ParentOdd(String iD, String homeTeam, String awayTeam, Integer sport, String matchTime, ArrayList<Odd> odds, String details, String homeROT, String awayROT) {
        this.iD = iD;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.sport = sport;
        this.matchTime = matchTime;
        this.odds = odds;
        this.details = details;
        this.homeROT = homeROT;
        this.awayROT = awayROT;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setSport(Integer sport) {
        this.sport = sport;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public void setOdds(ArrayList<Odd> odds) {
        this.odds = odds;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setHomeROT(String homeROT) {
        this.homeROT = homeROT;
    }

    public void setAwayROT(String awayROT) {
        this.awayROT = awayROT;
    }

    public String getiD() {
        return iD;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public Integer getSport() {
        return sport;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public ArrayList<Odd> getOdds() {
        return odds;
    }

    public String getDetails() {
        return details;
    }

    public String getHomeROT() {
        return homeROT;
    }

    public String getAwayROT() {
        return awayROT;
    }
}