package workingWithVariables;

public class Mail111PrimitiveVariables {

    public static void main(String args[]) {
        //there are major data types in java: promitives and objects
        //promitives are used to store numbers, individual characters and boolean values
        //stored in the fastest available memory
        //manes for primities are all in a lowwer case//
        //COMPLEX OBLECT DATA TZPES START WITH CAPITAL VALUE
        // STRING IS NOT A PRIMITIVE!!!! STRING IS A COMPLEX OBJECT
        // all variables (primitives and objects) must be data typed, when they are declared
        //java is a statically typed language, java script - dinamically typed
        //camel case - upper case character in the middle: myVariable
        //int myVar = 5; Data Type int, Identifier myVar, value 5
        //data types take that amount of memory:
        //all primitive values are signed, meaning that the ranges go from negative to positive numbers
        //byte data type stored 8 bits of memory 128 127
        // short 16  -32 000 +32 000
        //int 32 -2 000 000 000  +2 000 000 000 billion (most commongly used)
        //long 64 -9*e18 +9*e18
        //fraction values float 32, double (most commonly used) 64
        //each primitive has a helper class - part of a java runtime library
        //each of this classes can be used for conversion from one data type to another
        //and to format values
        //helper class for byte is Byte, for int is Integer
        //each of helper classes is part of jaa.lang.*: java.land.Double
        //helper classes are alvais awailable without you having to add a special declaration

        double doubleValue = 156.5d; //can be float or double, but we show that it is double

        //we will convert a doubleValue to abother primitive type, that´´ why we make an object from it!!!!!
        //we declare an instance of Double class and pass in the primitive value
        //now we have a helper object, representing that value
        //and we can have a byte object, representing that value
        //we have a helper object here
        Double doubleObj = new Double(doubleValue);

        //we can have a byte object
        //if necessary, this method will trancate any fractional value
        byte byteValue = doubleObj.byteValue();

        //i can also have equivaalent values, cast as other numeric types
        int intValue = doubleObj.intValue();
        float floatValue = doubleObj.floatValue();
        //to cast to String value@
        String stringValue = doubleObj.toString();

        //all numeric primitives have default values, and they have default value 0
        int myInt2 = 0;
        System.out.println("This is " + myInt2);


    }
}
