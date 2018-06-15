import workingWithObjects.DateTimeToPlay;
import workingWithObjects.Vehicle;

public class Main {

    public static void main(String[] args) {


        Vehicle v1 = new Vehicle();
        v1.setName("BMW");
        v1.setModel("M3");
        v1.setLitres(6);

        Vehicle v2 = new Vehicle();
        v2.setName("Audi");
        v2.setModel("A6");
        v2.setLitres(10);

        Vehicle v3 = (Vehicle) v2;

        String var1 = "1000"; // Casting to integer
        int var2 = Integer.parseInt(var1); //1st method
        int var3 = 0;
        // Convert.string2int(var1, var3); //2nd method
        //int var4 = (Integer) var1; //Object conversion method
        System.out.println(v2);
        System.out.println(v1);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println();


        String str1 = "Hello";
        String str2 = "hello";
        StringComparison obj1 = new StringComparison();
        obj1.StringComparisonNotTheBest(str1, str2);
//        StringComparison obj2 = new StringComparison();
        obj1.StringComparisonBetter(str1, str2);
        String str3 = "Hello ";
        String str4 = "World";
        String str5 = "Hello world";
        obj1.StringComparisonBetter(str3 + str4, str5);
        String str6 = "Some long string with spaces      ";
        String str7 = "with spaces";
        obj1.ParsingStrings(str6, str7);
        StringComparison obj2 = new StringComparison();
        obj2.IndexOf(str6, "long");
        StringComparison obj3 = new StringComparison();
        obj3.Substring(str6, 11);
        obj3.Trim("Trimmed string: " + str6);
        System.out.println(str6.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str3.hashCode());
        System.out.println((str4 + str5).hashCode());
        System.out.println(str6.toUpperCase());
        System.out.println(str1.replaceAll("o", "O"));
        System.out.println();
        System.out.println();


        DateTimeToPlay dateTimeToPlay = new DateTimeToPlay();
        dateTimeToPlay.whatIsADatyToday();
        dateTimeToPlay.gregorianCalender();


    }
}
