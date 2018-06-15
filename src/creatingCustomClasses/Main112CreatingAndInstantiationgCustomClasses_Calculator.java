package creatingCustomClasses;

import java.util.Scanner;

import static creatingCustomClasses.utilities.MathHelper.*;

public class Main112CreatingAndInstantiationgCustomClasses_Calculator {

    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation (+ - * /): ");

        double result = 0;

        try {
            switch (op) {
                case "+":
                    result = addValues(s1, s2);
                    break;
                case "-":
                    result = substractValues(s1, s2);
                    break;
                case "*":
                    result = multiplyValues(s1, s2);
                    break;
                case "/":
                    result = divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }
            System.out.println("The answer is " + result);
        } catch (Exception e) {
            System.out.println("Number formatting exceptions " + e.getMessage());
        }

    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}




