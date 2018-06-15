package workingWithObjects;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeToPlay {

    public static void whatIsADatyToday() {
        Date d = new Date();
        System.out.println(d);
    }

    public static void gregorianCalender() {
        GregorianCalendar gc = new GregorianCalendar(1982, 11, 2);
        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();
        System.out.println(gc);
        System.out.println(d2 + "\n" + " Months calculation start from 0!!!!");

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        LocalDate ld = LocalDate.now();
        LocalDateTime ldt = LocalDateTime.now();
        LocalTime lt = LocalTime.now();
        System.out.println(ld);
        System.out.println("Unix timestamp, as it is represented in some DBs" + ldt);
        System.out.println(lt);

        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        System.out.println(dtf.format(ld));
    }

}
