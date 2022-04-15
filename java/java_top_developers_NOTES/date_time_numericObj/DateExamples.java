package date_time_numericObj;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateExamples {
    public static void main(String[] args) {
//        LocalDate dateToday = LocalDate.now();
//        System.out.println(dateToday);
//
//        LocalTime timeNow = LocalTime.now();
//        System.out.println(timeNow);

//        LocalDateTime currDate = LocalDateTime.now();
//        System.out.println(currDate.toLocalDate() + " " + currDate.toLocalTime());
//
//        int year = currDate.getYear();
//        System.out.println(year);

//        Duration twoHours = Duration.ofHours(2);
//        Duration tenMinutes = Duration.ofMinutes(10);
//
//        long seconds = twoHours.minusMinutes(3).getSeconds();
//        System.out.println(seconds);


//        ZoneId london = ZoneId.of("Europe/London");
//        System.out.println(london);
//        LocalDateTime time = LocalDateTime.of(2021, Month.APRIL, 4, 16, 30);
//        ZonedDateTime londonTime = ZonedDateTime.of(time, london);
//        System.out.println(londonTime);


        Locale pl = new Locale("pl", "PL");
        Locale curr = Locale.getDefault();
        System.out.println(pl);
        System.out.println(curr);

        LocalDate date = LocalDate.of(2021, Month.MAY, 4);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMM yyyy", pl);
        String res = date.format(formatter);
        System.out.println(res);
    }
}
