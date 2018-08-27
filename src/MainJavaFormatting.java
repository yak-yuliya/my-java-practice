import java.util.Scanner;

public class MainJavaFormatting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        String str = scan.nextLine();
//        int integ = scan.nextInt();
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {

            String str = scan.next();
            int integ = scan.nextInt();

            if (str.length() > 10) {
                str = str.substring(0, 10);
            }

            System.out.printf("%-15s%03d%n", str, integ);
            System.out.printf("%-15s%n", str);
            System.out.printf("|%20d|%n", integ); //Specifying a width:
            System.out.printf("|%-20d|%n", integ); //Left-justifying within the specified width:
            System.out.printf("|%020d|%n", integ);//Pad with zeros:
            System.out.printf("|%0+20d|%n", integ);//Print positive numbers with a “+”:
            System.out.printf("|%,20d|%n", integ);
            System.out.printf("|% d|%n", integ);
            System.out.printf("|%,d|%n", integ);//For the US locale, it is “,”:
            System.out.printf("|%(d|%n", integ);//Enclose negative numbers within parentheses (“()”) and skip the "-":
            System.out.printf("|%.5s|%n", "Hello World");//Specify Maximum Number of Characters
            System.out.printf("|%20.5s|%n", "Hello World");//Field Width and Maximum Number of Characters


        }
        System.out.println("================================");
        scan.close();

//        ("%-15s%03d%n", s1, x) % : used as a formatter.
//        '-' : minus sign used for left indentation of the string.
//        15s : here 15 denotes the string's minimum field width 15.
//        '0' : pads the extra 0s in the integer.
//        3d : here 3 denotes integer's minimum field width 3.
//                %n : prints the new line.

//        printf is an avanced version of print. It allows you to not only print, but format it aswell. This example alone shows some nifty tricks. Some others would be formatting the decimals.
//        If you have a decimal of 5.243012 and you only wanted the first 3 places, you can use
//        System.out.printf("You Decimal Number is %.3f",myDecimal);

//        %d = int
//        %s = String@
//        %f = float


    }
}
