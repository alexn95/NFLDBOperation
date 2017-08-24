import entities.Game;
import entities.Pick;
import utils.BaseModel;
import utils.JsonUtil;

import java.util.Map;

/**
 * Created by alex on 16.08.2017.
 */
public class UserWeekScore {

    //возвращает счет пользователя с id userId набранный за неделю weekId
    public static void getUserWeekScore(String userId, String weekId){
        BaseModel db = JsonUtil.parseJson();
        if (db == null) return;

        Integer score = 0;
        for (Map.Entry<String, Pick> pick : db.getPicks().entrySet()) {
            if (pick.getValue().getUserId().equals(userId) &&
                    pick.getValue().getWeekId().equals(weekId))
                for (Game game : db.getGames()) {
                    if (game == null) continue;
                    if (game.getGameId().equals(pick.getValue().getGameId())) {
                        if (game.getWinnerTeamId().equals(pick.getValue().getSelectedTeamId()))
                            score += pick.getValue().getPoint();
                        break;
                    }
                }

        }
        System.out.println(score);
    }
}
