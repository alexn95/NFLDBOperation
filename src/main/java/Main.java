import entities.Game;
import entities.Pick;
import utils.JsonUtil;

import java.io.File;

/**
 * Created by alex on 15.08.2017.
 */
public class Main{

    private static final String FILENAME = "." + File.separator + "resultFile.json";
//    private static final String SOURCE_FILENAME = "." + File.separator + "confidence-pool-test-export.json";

    //для большенства методов необходим файл confidence-pool-test-export.json в корне проекта
    //из него берутся данные для операций
    public static void main(String[] args) {
        //примеры

        //создает файл resultWeeks.json
        //сдвиг даты на 10 дней вперед в файле resultWeeks.json
        JsonUtil.writeJson(Date.moveTo(10), "resultWeeks");

        //создает файл resultGames.json
        //устанавливает результаты игр на первые 5 недель в файле resultGames.json
        JsonUtil.writeJson(Games.setResult(5), "resultGames");

        //создает файл resultFile.json c базой данных, в которую добавлены пики и тайбрейкеры
        // на указанное количесвто недель для всех юзеров из бд
        JsonUtil.writeJson(Picks.createPicksAndTieBreak(5), FILENAME);
    }
}
