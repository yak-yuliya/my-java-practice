package managingProgrammFlow;

import java.util.Scanner;

public class MainMethodsOverloading {

    //distinguish methods by number and data types of arguments

    public static void main(String[] args) {
        String s1 = getInput("Enter value 1:");
        String s2 = getInput("Enter value 2:");
        String s3 = getInput("Enter value 3:");

        double result = addValues(s1, s2);
        double result2 = addValues(s1, s2, s3);
        double result3 = addValues(s1, s2, s3, s1, s2, s3);

        System.out.println("The answer is: " + addValues(s1, s2));
        System.out.println("The answer for 3 valies is: " + addValues(s1, s2, s3));
        System.out.println("The answer for many valies is: " + addValues(s1, s2, s3, s1, s2, s3));
    }
    //both are static so that they can be called from static main method
    //both methods return something

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    //both methods shall have a different signature, so theat they can be distinguished one from another
    static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }

    // method name is dimmed out - from intellij that that method is not yet called anywhere in my code
    static double addValues(String s1, String s2, String s3) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        double result = d1 + d2 + d3;
        return result;
    }

    //that means that the user can pass as many values as they want
    // this method can be called with any number of arguments
    static double addValues(String... values) {
        double result = 0;
        for (String value : values) {
            double d = Double.parseDouble(value);
            // += means "add this to the existing value"
            result += d;
        }
        return result;
    }


}