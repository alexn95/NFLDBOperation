package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import entities.TieBreak;
import entities.Week;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by alex on 15.08.2017.
 */
//Клас для операций с json файлами
public class JsonUtil {
    private static final String FILENAME = "." + File.separator + "confidence-pool-test-export.json";

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
}
