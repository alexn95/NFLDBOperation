package utils;

import entities.Team;

import java.util.ArrayList;

/**
 * Created by alex on 04.08.2017.
 */
public class Teams {

    public static Team getTeamById(ArrayList<Team> teams, int id){
        for (Team team: teams){
            if (team == null) continue;
            if (Integer.parseInt(team.getTeamId()) == id) return  team;
        }
        return  null;
    }
}
