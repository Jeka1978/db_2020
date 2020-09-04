package date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {


    public Date convert(LocalDate date) {
        // todo finish this
        return null;
    }

    public LocalDateTime convert(Date date) {
        // todo finish this
        return null;
    }

        // 1981/02/30&18:20
    public static int daysBetween(String firstDate, String lastDate) {
        //JSR 310
        //todo finish this
        return 0;
    }

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/d");
        System.out.println();
    }


//    public static void main(String[] args) {
//
//
//
//        LocalTime now1 = LocalTime.now();
////        LocalDateTime.of(1932,12,12,12,12,12)
//        LocalDate now = LocalDate.now();
//        LocalDate yest = now.minusDays(1);
//        LocalDate date = now.withYear(2010);
//        String displayName = date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
//        System.out.println("displayName = " + displayName);
//
////        Duration
//        long between = ChronoUnit.DAYS.between(date, now);
//        System.out.println("between = " + between);
//
////
////        String str = "java";
////        str = str.toUpperCase();
////
////        Date date = new Date();
////        System.out.println("date = " + date.getYear());
//    }
}



