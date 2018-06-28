package workingWithInheritance;

import workingWithInheritance.model112.Kalamata112;
import workingWithInheritance.model112.Ligurian112;
import workingWithInheritance.model112.Olive112;

import java.util.ArrayList;
import java.util.List;

public class Main112CreatingAndImplementingInterfaces {
    // Java supports simple inheritance
    // Each class can extend only one direct superclass
    // Classes can implement multiple interfaces

    // Inheritance relationship can be described as
    // Parent-Child
    // Base - Derived
    // Superclass - Subclass - the most commonly used in Java world

    // Polymorphysm means that the oblect can be addressed as either its supertype or its native or subtype
    // List is interface, ArrayList implements an interface List
    // I can declare an object as a List, but then instantiate it as ArrayList
    // it is an ArrayList, but it is also a List

    // we can write methods, that accepts sypertype as argument
    // and then you can take an object that is natively an instance of the subtype and pass it to that method
    // and that allows us to create a code that is highly flexible and very very reusable

    // you can think of the method that accepts a supertype as an argument as a contract of a sort
    //it is saying: as long as this objects extends the superclass, i will accept it, because that is a guarantee that
    // the subclass will implement the functionality that i am looking for
    // this is known as contract based programmimng

    // superclass. if it is not FINAL, it can be extended
    // all fields and methods of superclass can be inherited, unless thez are marked as PRIVATE
    // THE MOST COMMON PRACTISE: mark fields private and then create GETTERS and SETTERS and make them public
    //and make other custom methods as thez are needed and mark them PUBLIC or PROTECTED to allow them to be called from other methods of the application
    public static void main(String[] args) {

// insterad of passing a long value as a color, i am instead using a new enumeration, named OliveColor


        List<Olive112> olives = new ArrayList<>();

        //onstead of creating a new instance of the Olive class, instead of this
        //olives.add(new Olive(OliveNameEnum.KALAMATA, OliveColor.PURPLE, 3));
        //we will write this:
        olives.add(new Kalamata112());
        olives.add(new Kalamata112());
        olives.add(new Ligurian112());
        olives.add(new Ligurian112());
        olives.add(new Ligurian112());
        olives.add(new Ligurian112());


        //we change the type of press from OlivePress112 to PressInterface112
        //we are saying it is an instance of this interface
        //!!!!!!!!!!!
        PressInterface112 press = new OlivePress112();
        press.setOil112(5);
        int totalOil = press.getOil112(olives);

        System.out.println("You got " + totalOil + " units of oil");


        //it is common in java to see interfaces instanciated directly
        // but when you do that you have to implement all your code yourself
        // another instance of PressInterface112
        // intellij add implementation all of abstract methods of this class
        //this sort of code is very common in the world of andriod
        //interfaces are used in android for even handling, call back
//commented because we not gonna use this now:

//        PressInterface112 p2 = new PressInterface112() {
//            @Override
//            public int getOil112(List<Olive112> olives) {
//                return 0;
//            }
//
//            @Override
//            public void setOil112(int oil) {
//
//            }
//        }
    }
}
