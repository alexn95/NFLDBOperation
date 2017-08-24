package utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by alex on 02.08.2017.
 */
//Возвращает случайные имя и фамилию
public class Personality {
    private static List<String> names = Arrays.asList("Harry","Oliver","Jack","Charlie","Thomas","Jacob","Alfie","Riley","William","James","Amelia","Olivia","Jessica"
            ,"Emily","Lily","Ava","Sophie","Mia","Isabella","Bob","Michael","Joshua","Matthew","Daniel");
    private static List<String> sureNames = Arrays.asList("Smith","Johnson","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson"
            ,"White","Harris","Martin","Thompson","Garcia","Martinez","Robinson","Clark","Rodriguez","Lewis","Lee","alker");



    public static String getPersonality(){
        Random random = new Random();

//        return "Test User";
        return names.get(random.nextInt(names.size() - 1)) + " " + sureNames.get(random.nextInt(sureNames.size() - 1));

    }

}
