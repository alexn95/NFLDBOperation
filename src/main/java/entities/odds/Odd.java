
        package entities.odds;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class Odd {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("EventID")
    @Expose
    private String eventID;
    @SerializedName("MoneyLineHome")
    @Expose
    private String moneyLineHome;
    @SerializedName("MoneyLineAway")
    @Expose
    private String moneyLineAway;
    @SerializedName("PointSpreadHome")
    @Expose
    private String pointSpreadHome;
    @SerializedName("PointSpreadAway")
    @Expose
    private String pointSpreadAway;
    @SerializedName("PointSpreadHomeLine")
    @Expose
    private String pointSpreadHomeLine;
    @SerializedName("PointSpreadAwayLine")
    @Expose
    private String pointSpreadAwayLine;
    @SerializedName("TotalNumber")
    @Expose
    private String totalNumber;
    @SerializedName("OverLine")
    @Expose
    private String overLine;
    @SerializedName("UnderLine")
    @Expose
    private String underLine;
    @SerializedName("DrawLine")
    @Expose
    private String drawLine;
    @SerializedName("LastUpdated")
    @Expose
    private String lastUpdated;
    @SerializedName("SiteID")
    @Expose
    private Integer siteID;
    @SerializedName("OddType")
    @Expose
    private String oddType;

    /**
     * No args constructor for use in serialization
     *
     */
    public Odd() {
    }

    /**
     *
     * @param pointSpreadHomeLine
     * @param overLine
     * @param moneyLineAway
     * @param pointSpreadHome
     * @param lastUpdated
     * @param iD
     * @param moneyLineHome
     * @param oddType
     * @param siteID
     * @param eventID
     * @param pointSpreadAwayLine
     * @param pointSpreadAway
     * @param totalNumber
     * @param underLine
     * @param drawLine
     */
    public Odd(String iD, String eventID, String moneyLineHome, String moneyLineAway, String pointSpreadHome, String pointSpreadAway, String pointSpreadHomeLine, String pointSpreadAwayLine, String totalNumber, String overLine, String underLine, String drawLine, String lastUpdated, Integer siteID, String oddType) {
        super();
        this.iD = iD;
        this.eventID = eventID;
        this.moneyLineHome = moneyLineHome;
        this.moneyLineAway = moneyLineAway;
        this.pointSpreadHome = pointSpreadHome;
        this.pointSpreadAway = pointSpreadAway;
        this.pointSpreadHomeLine = pointSpreadHomeLine;
        this.pointSpreadAwayLine = pointSpreadAwayLine;
        this.totalNumber = totalNumber;
        this.overLine = overLine;
        this.underLine = underLine;
        this.drawLine = drawLine;
        this.lastUpdated = lastUpdated;
        this.siteID = siteID;
        this.oddType = oddType;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getMoneyLineHome() {
        return moneyLineHome;
    }

    public void setMoneyLineHome(String moneyLineHome) {
        this.moneyLineHome = moneyLineHome;
    }

    public String getMoneyLineAway() {
        return moneyLineAway;
    }

    public void setMoneyLineAway(String moneyLineAway) {
        this.moneyLineAway = moneyLineAway;
    }

    public String getPointSpreadHome() {
        return pointSpreadHome;
    }

    public void setPointSpreadHome(String pointSpreadHome) {
        this.pointSpreadHome = pointSpreadHome;
    }

    public String getPointSpreadAway() {
        return pointSpreadAway;
    }

    public void setPointSpreadAway(String pointSpreadAway) {
        this.pointSpreadAway = pointSpreadAway;
    }

    public String getPointSpreadHomeLine() {
        return pointSpreadHomeLine;
    }

    public void setPointSpreadHomeLine(String pointSpreadHomeLine) {
        this.pointSpreadHomeLine = pointSpreadHomeLine;
    }

    public String getPointSpreadAwayLine() {
        return pointSpreadAwayLine;
    }

    public void setPointSpreadAwayLine(String pointSpreadAwayLine) {
        this.pointSpreadAwayLine = pointSpreadAwayLine;
    }

    public String getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(String totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getOverLine() {
        return overLine;
    }

    public void setOverLine(String overLine) {
        this.overLine = overLine;
    }

    public String getUnderLine() {
        return underLine;
    }

    public void setUnderLine(String underLine) {
        this.underLine = underLine;
    }

    public String getDrawLine() {
        return drawLine;
    }

    public void setDrawLine(String drawLine) {
        this.drawLine = drawLine;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getSiteID() {
        return siteID;
    }

    public void setSiteID(Integer siteID) {
        this.siteID = siteID;
    }

    public String getOddType() {
        return oddType;
    }

    public void setOddType(String oddType) {
        this.oddType = oddType;
    }

}