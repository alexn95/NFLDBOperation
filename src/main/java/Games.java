import entities.Game;
import utils.BaseModel;
import utils.JsonUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by alex on 17.08.2017.
 */
public class Games {

    //Устанавливает результаты игры до endWeek недели включительно
    //возвращает объект таблицы games
    public static ArrayList<Game> setResult(Integer endWeek){
        BaseModel db = JsonUtil.parseJson();
        ArrayList<Game> games = db.getGames();

        for (Game game: games){
            if (game == null) continue;
            if (Integer.parseInt(game.getWeekId()) <= endWeek){
                Random randNumber = new Random();
                game.setGuestsScore(randNumber.nextInt(30) + 15);
                game.setHomeScore(randNumber.nextInt(30) + 15);
                if (game.getGuestsScore() == game.getHomeScore()){
                    game.setHomeScore(game.getHomeScore() + 1);
                }
            } else {
                game.setHomeScore(-1);
                game.setGuestsScore(-1);
            }

        }
        return games;

    }
}
