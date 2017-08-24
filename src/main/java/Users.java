import entities.User;
import utils.BaseModel;
import utils.JsonUtil;
import utils.Personality;

import java.io.File;
import java.text.NumberFormat;
import java.util.LinkedHashMap;

/**
 * Created by alex on 17.08.2017.
 */
public class Users {
    private static final String RESULT_FILENAME = "." + File.separator + "resultUsers.json";

    //создает userCount пользователей
    //возвращает объект бд с пользователями
    public static BaseModel createUser(Integer userCount){
        NumberFormat format = NumberFormat.getNumberInstance();
        format.setMinimumIntegerDigits(3);

        LinkedHashMap<String,User> resultUsers = new LinkedHashMap<>();

        for (int i = 0; i < userCount; i ++) {
            User tempUser = new User("autId", "exampleMail@gmail.com", Personality.getPersonality(),
                    "https://lh3.googleusercontent.com/-XdUIqdMkCWA/AAAAAAAAAAI/AAAAAAAAAAA/4252rscbv5M/photo.jpg",
                    "user","id00" + format.format( i + 1));
            resultUsers.put("id00" + format.format(i + 1), tempUser);
        }

        BaseModel baseModel = JsonUtil.parseJson();
        baseModel.setUsers(resultUsers);
        return baseModel;
    }

}
