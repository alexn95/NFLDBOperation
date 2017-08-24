package utils;

import entities.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by alex on 15.08.2017.
 */
// Модель базы данных
public class BaseModel {
    private ArrayList<Game> games;

    private LinkedHashMap<String, Pick> picks;

    private ArrayList<Season> seasons;

    private ArrayList<Team> teams;

    private LinkedHashMap<String, Tick> ticks;

    private LinkedHashMap<String, TieBreak> tiebreaks;

    private LinkedHashMap<String, User> users;

    private ArrayList<Week> weeks;


    public BaseModel() {}

    public BaseModel(ArrayList<Game> games, LinkedHashMap<String, Pick> picks, ArrayList<Season> seasons, ArrayList<Team> teams, LinkedHashMap<String, Tick> ticks, LinkedHashMap<String, TieBreak> tieBreaks, LinkedHashMap<String, User> users, ArrayList<Week> weeks) {
        this.games = games;
        this.picks = picks;
        this.seasons = seasons;
        this.teams = teams;
        this.ticks = ticks;
        this.tiebreaks = tieBreaks;
        this.users = users;
        this.weeks = weeks;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public LinkedHashMap<String, Pick> getPicks() {
        return picks;
    }

    public ArrayList<Season> getSeasons() {
        return seasons;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public LinkedHashMap<String, Tick> getTicks() {
        return ticks;
    }

    public LinkedHashMap<String, TieBreak> getTiebreaks() {
        return tiebreaks;
    }

    public LinkedHashMap<String, User> getUsers() {
        return users;
    }

    public ArrayList<Week> getWeeks() {
        return weeks;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public void setPicks(LinkedHashMap<String, Pick> picks) {
        this.picks = picks;
    }

    public void setSeasons(ArrayList<Season> seasons) {
        this.seasons = seasons;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public void setTicks(LinkedHashMap<String, Tick> ticks) {
        this.ticks = ticks;
    }

    public void setTiebreaks(LinkedHashMap<String, TieBreak> tiebreaks) {
        this.tiebreaks = tiebreaks;
    }

    public void setUsers(LinkedHashMap<String, User> users) {
        this.users = users;
    }

    public void setWeeks(ArrayList<Week> weeks) {
        this.weeks = weeks;
    }
}
