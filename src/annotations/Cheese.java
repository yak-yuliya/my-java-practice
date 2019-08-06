package annotations;

public class Cheese {
    @Override
    public String toString(String something){  //method does not override mehod from its superclass
        return "String cheese!";
    }
//Using the @Override annotation on a method will force the compiler to check that the method properly ___overrides___________ a method from a super class.
}
