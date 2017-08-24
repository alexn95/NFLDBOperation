package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import entities.Week;
import entities.odds.ParentOdd;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by alex on 15.08.2017.
 */
//Клас для операций с json файлами
public class JsonUtil {
    private static final String FILENAME = "." + File.separator + "confidence-pool-test-export.json";
    private static final String ODDS_FILENAME = "." + File.separator + "odds.json";

    // возвращает объект базы данных считаный с файла FILENAME
    public static BaseModel parseJson() {
        BaseModel jsonFile;

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        try {
            jsonFile =  gson.fromJson(new FileReader(FILENAME), BaseModel.class);
        }catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            return null;
        }
        return jsonFile;
    }

    //Создает json файл и записывает объект в json файл с названием fileName
    public static void writeJson(Object object, String fileName){
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(object, writer);

        } catch (IOException e) {
            System.out.println("FILE NOT FOUND");
            return;
        }
    }
    //Возвращает объект odds
    public static ArrayList<ParentOdd> parseOddsJson() {
        ArrayList<ParentOdd> jsonFile;

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        try {
            jsonFile = gson.fromJson(new FileReader(ODDS_FILENAME), new TypeToken<ArrayList<ParentOdd>>(){}.getType());
        }catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            return null;
        }
        return jsonFile;
    }
}
