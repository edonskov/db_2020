package date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {


    public static Date convert(LocalDate date) {
        return Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDateTime convert(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

        // 1981/02/30&18:20
    public static int daysBetween(String firstDate, String lastDate) throws ParseException {
        SimpleDateFormat parser = new SimpleDateFormat("yyyy/MM/dd&hh:mm");
        LocalDateTime date1 = convert(parser.parse(firstDate));
        LocalDateTime date2 = convert(parser.parse(lastDate));
        return (int) Duration.between(date1.toInstant(ZoneOffset.UTC),date2.toInstant(ZoneOffset.UTC)).getSeconds() / 86400;
    }



    public static void main(String[] args) throws ParseException {

        System.out.println(LocalDate.now());
        System.out.println(convert(LocalDate.now()));
        System.out.println(convert(new Date()));
        System.out.println(daysBetween("1981/01/30&17:20", "1981/02/30&16:20"));

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

