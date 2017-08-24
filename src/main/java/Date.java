import entities.Week;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import utils.BaseModel;
import utils.JsonUtil;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by alex on 16.08.2017.
 */
public class Date {

    //Сдвгает даты из таблицы Weeks на shift дней
    public static ArrayList<Week> moveTo(Integer shift){
        DateTimeFormatter format = DateTimeFormat.forPattern("YYYY-MM-dd'T'HH:mm:ssZZ");
        BaseModel db = JsonUtil.parseJson();
        ArrayList<Week> resultWeeks = new ArrayList<Week>();

        DateTime beginDate;
        DateTime endDate;
        DateTime freezingDateTime ;

        DateTimeFormat.mediumDateTime();
        DateTime summerTime = new DateTime("2017-11-05");

        resultWeeks.add(null);

        for (Week week: db.getWeeks()){
            if (week == null) continue;

            beginDate = new DateTime(week.getBeginDate(), DateTimeZone.forOffsetHours(-4)).plusDays(shift);
            endDate = new DateTime(week.getEndDate(), DateTimeZone.forOffsetHours(-4)).plusDays(shift);
            freezingDateTime = new DateTime(week.getBeginDate(), DateTimeZone.forOffsetHours(-4)).plusDays(shift).minusSeconds(2);
            if (beginDate.isAfter(summerTime)) {
                beginDate = beginDate.withZone(DateTimeZone.forOffsetHours(-5));
                beginDate = beginDate.plusHours(1);
            }
            if (endDate.isAfter(summerTime)){
                endDate = endDate.withZone(DateTimeZone.forOffsetHours(-5));
                endDate = endDate.plusHours(1);
            }

            if (freezingDateTime.isAfter(summerTime)){
                freezingDateTime = freezingDateTime.withZone(DateTimeZone.forOffsetHours(-5));
                freezingDateTime = freezingDateTime.plusHours(1);
            }

            if (beginDate.getHourOfDay() == 1) {
                beginDate = beginDate.minusHours(1);
            }
            if (endDate.getHourOfDay() == 0){
                endDate = endDate.minusHours(1);
            }

            if (freezingDateTime.getHourOfDay() == 0){
                freezingDateTime = freezingDateTime.minusHours(1);
            }

            resultWeeks.add(new Week(format.print(beginDate), format.print(endDate), format.print(freezingDateTime),
                    week.getSeasonId(), week.getWeekId(), week.getWeekNumber()));

        }

        return resultWeeks;


    }
}
