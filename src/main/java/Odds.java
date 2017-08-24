import entities.Game;
import entities.Team;
import entities.odds.Odd;
import entities.odds.ParentOdd;
import utils.BaseModel;
import utils.JsonUtil;
import utils.Teams;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by alex on 24.08.2017.
 */
public class Odds {


    private static final String FILENAME = "." + File.separator + "resultFile.json";

    //создает odds на указанные недели
    //1 неделя odds копируется из файла odds.json
    //из файла odds.json берется первая odds и на основе ее создаются все odds с изменениями команд и случайными коэффициентов
    public static ArrayList<ParentOdd> createOdds(int startWeek, int endWeek){
        ArrayList<ParentOdd> odds = JsonUtil.parseOddsJson();
        ArrayList<ParentOdd> resultOdds = new ArrayList<>();
        BaseModel db = JsonUtil.parseJson();
        for (ParentOdd odd: odds){
            if (odd.getDetails().equals("NFL Regular Season - Week #1")){
                resultOdds.add(odd);
            }
        }
        Random random = new Random();
        ParentOdd exampleParrendOdd = odds.get(0);
        Odd exampleOdd = exampleParrendOdd.getOdds().get(0);

        int id = 0;
        for (Game game: db.getGames()){
            if (game == null) continue;
            if (Integer.parseInt(game.getWeekId()) < endWeek && Integer.parseInt(game.getWeekId()) > startWeek){
                Odd odd = new Odd(exampleOdd.getID(),exampleOdd.getEventID(),exampleOdd.getMoneyLineHome(),exampleOdd.getMoneyLineAway(),
                        exampleOdd.getPointSpreadHome(),exampleOdd.getPointSpreadAway(),exampleOdd.getPointSpreadHomeLine(),
                        exampleOdd.getPointSpreadAwayLine(), exampleOdd.getTotalNumber(), exampleOdd.getOverLine(), exampleOdd.getUnderLine(),
                        exampleOdd.getDrawLine(), exampleOdd.getLastUpdated(),exampleOdd.getSiteID(),exampleOdd.getOddType());
                ArrayList<Odd> tempOdds = new ArrayList<>();
                tempOdds.add(odd);
                ParentOdd parentOdd = new ParentOdd(exampleParrendOdd.getiD(),exampleParrendOdd.getHomeTeam(),exampleParrendOdd.getAwayTeam(),
                        exampleParrendOdd.getSport(), exampleParrendOdd.getMatchTime(), tempOdds, exampleParrendOdd.getDetails(),
                        exampleParrendOdd.getHomeROT(), exampleParrendOdd.getAwayROT());

                parentOdd.setiD("id00" + id++);
                parentOdd.setHomeTeam(Teams.getTeamById(db.getTeams(),Integer.parseInt(game.getHomeTeamId())).getName());
                parentOdd.setAwayTeam(Teams.getTeamById(db.getTeams(),Integer.parseInt(game.getGuestsTeamId())).getName());
                parentOdd.setDetails("NFL Regular Season - Week #" + game.getWeekId());
                double pointSpread = random.nextInt(10);
                String pointSpreadAway = "";
                String pointSpreadHome = "";
                if (random.nextBoolean()){
                    pointSpread += 0.5;
                }

                if (random.nextBoolean()){
                    pointSpreadAway = String.valueOf(pointSpread);
                    pointSpreadHome = String.valueOf(-pointSpread);
                } else {
                    pointSpreadAway = String.valueOf(-pointSpread);
                    pointSpreadHome = String.valueOf(pointSpread);
                }
                parentOdd.getOdds().get(0).setPointSpreadAway(pointSpreadAway);
                parentOdd.getOdds().get(0).setPointSpreadHome(pointSpreadHome);

                resultOdds.add(parentOdd);
            }
        }
        return resultOdds;
    }

}
