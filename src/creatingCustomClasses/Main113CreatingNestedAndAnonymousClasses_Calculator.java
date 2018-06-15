package creatingCustomClasses;

import java.util.Scanner;

import static creatingCustomClasses.utilities.MathHelper.*;

public class Main113CreatingNestedAndAnonymousClasses_Calculator {

    public static void main(String[] args) {

        //we can define classes, that are NESTED in other classes,
        // and those classes are only available to their PARENT CLASSES

        //instead of calling other method in this way, we want to create an instance of the calculator class
        //calculate();

        //we create an instance of a class
        // and we instantiate it with NEW and the constructor method!!!!!!!
        //notice that there is no explicit constructor defined in the code, but it is ok
        //the java compiler creates no arguments constructor method for me
        Main113CreatingNestedAndAnonymousClasses_Calculator calc = new Main113CreatingNestedAndAnonymousClasses_Calculator();
        calc.calculate();
    }
    //we removed STATIC from it
    //it is not static, it is INSTANCE METHOD NOW
// a method, that now must be called from an instance of a class!!!!!!! instead of from the class definition itself!!!!!!!


    protected void calculate() {
// we instanciate it with NEW
        InputHelper input = new InputHelper();
        String s1 = input.getInput("Enter a numeric value: ");
        String s2 = input.getInput("Enter a numeric value: ");
        String op = input.getInput("Choose an operation (+ - * /): ");

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
// we will make a nested class out of it
    //we will wrap this method insede a class


    // getInput is now an instance method of InputMethod class because we have removed static word
    private class InputHelper{
        public String getInput(String prompt) {
            System.out.println(prompt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
    }


}
