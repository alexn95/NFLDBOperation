import entities.*;
import utils.BaseModel;
import utils.JsonUtil;
import utils.Teams;

import javax.swing.border.TitledBorder;
import java.io.File;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by alex on 16.08.2017.
 */
public class Picks {

    //выставляет ставки и тайберкеры всем пользователям из базы данных,
    //загруженной в проект до endWeek недели включительно
    //Возвращает объект базы данных с ставками и тайбрейками
    public static BaseModel createPicksAndTieBreak(Integer endWeek){
        BaseModel db = JsonUtil.parseJson();

        LinkedHashMap<String, Pick> resultPicks = new LinkedHashMap<>();
        LinkedHashMap<String, TieBreak> resultTieBreaks = new LinkedHashMap<>();

        LinkedHashMap<String,User> users = db.getUsers();
        ArrayList<Game> games = db.getGames();
        ArrayList<Team> teams = db.getTeams();

        int pickId = 0;
        int tieBreakerId = 1;
        Random random = new Random();

        for(Map.Entry<String, User> user: users.entrySet()){

            int point = 1;
            if (user.getValue().getMail() == null) continue;

            for (Game game: games) {
                if (game == null) continue;

                if (Integer.parseInt(game.getWeekId()) <= endWeek){
                    Team teamGuest = Teams.getTeamById(teams, Integer.parseInt(game.getGuestsTeamId()));
                    Team teamHome = Teams.getTeamById(teams, Integer.parseInt(game.getHomeTeamId()));
                    String selectedTeamId;
                    if (random.nextBoolean()){
                        selectedTeamId = teamGuest.getTeamId();
                    } else selectedTeamId = teamHome.getTeamId();

                    Pick tempPick = new Pick(teamGuest.getName(), game.getGameId(), teamHome.getName(), game.getIsTieBreaker(), "" + pickId, point, selectedTeamId, user.getKey(), game.getWeekId() );
                    resultPicks.put("" + pickId, tempPick);
                    pickId++;
                    point++;
                    if (game.getIsTieBreaker()) {
                        TieBreak tieBreak = new TieBreak(game.getGameId(), random.nextInt(60) + 30, "" + tieBreakerId , user.getKey(), game.getWeekId());
                        resultTieBreaks.put(String.valueOf(tieBreakerId),tieBreak);
                        tieBreakerId++;
                        point = 1;
                    }

                }
            }

        }
        BaseModel baseModel = db;
        baseModel.setPicks(resultPicks);
        baseModel.setTiebreaks(resultTieBreaks);
        return baseModel;
    }
}
