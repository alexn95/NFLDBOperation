package entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TieBreak {

    @SerializedName("game_id")
    @Expose
    private String gameId;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("tiebreak_id")
    @Expose
    private String tiebreakId;
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
    public TieBreak() {
    }

    /**
     *
     * @param weekId
     * @param tiebreakId
     * @param userId
     * @param gameId
     * @param score
     */
    public TieBreak(String gameId, Integer score, String tiebreakId, String userId, String weekId) {
        super();
        this.gameId = gameId;
        this.score = score;
        this.tiebreakId = tiebreakId;
        this.userId = userId;
        this.weekId = weekId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTiebreakId() {
        return tiebreakId;
    }

    public void setTiebreakId(String tiebreakId) {
        this.tiebreakId = tiebreakId;
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