import java.util.*;

//        Input Format
//        A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY   format.
//        Output Format
//        Output the correct day in capital letters.

public class MainDateAndTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.nextLine();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));

        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeInMillis());

        GregorianCalendar calendar = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, 2, Locale.ENGLISH).toUpperCase());
    }


    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");

    public static String getDay(String day, String month, String year) {

        int y = Integer.parseInt(year); //parseInt mehtod converts string to integer.
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);

        Calendar c = Calendar.getInstance();
        c.set(y, m - 1, d);

        int p = c.get(Calendar.DAY_OF_WEEK);
        String s = days.get(p - 1); //Because in java.util.Calendar, month started with 0.
        return s;
    }


//import java.io .*;
//import java.util .*;
//import java.text .*;
//import java.math .*;
//import java.util.regex .*;

//    public class Solution {
//            public static String getDay(String day, String month, String year) {
//                Calendar cal = Calendar.getInstance();
//                cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
//                int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//                String Day[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
//                return(Day[dayOfWeek-1]); }


//import java.time.LocalDate;
//import java.util.*;

//    public class Solution {

    //       public static void main(String[] args) {
    //           Scanner in = new Scanner(System.in);
    //         int month = in.nextInt();
    //        int day = in.nextInt();
    //        int year = in.nextInt();
    //        in.close();
    //        LocalDate dt = LocalDate.of(year, month, day);
    //         System.out.print(dt.getDayOfWeek());
    //      }
    //   }

}
