package creatingCustomClasses.utilities;

public class MathHelper {

    //in this way, when we put these methods in a separate class, we make it easier to call it from other places of the application
    // we could have put it in the same package, but one commot practise is to out it to subpackage
    // this is a custom class - library of methods that we can call from anywhere

// it is public and all of its methods are public

    public static double addValues (String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result1 = d1 + d2;
        return result1;
    }

    public static double substractValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result2 = d1 - d2;
        return result2;
    }

    public static double multiplyValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result3 = d1 * d2;
        return result3;
    }

    public static double divideValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result4 = d1 / d2;
        return result4;
    }

}
