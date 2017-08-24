import entities.Week;
import utils.BaseModel;
import utils.JsonUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by alex on 15.08.2017.
 */
public class Main{

    private static final String FILENAME = "." + File.separator + "resultFile.json";
//    private static final String SOURCE_FILENAME = "." + File.separator + "confidence-pool-test-export.json";

    public static void main(String[] args) {
        ArrayList<Week> weeks = Date.moveTo(35);
        JsonUtil.writeJson(weeks,FILENAME);
    }
}
