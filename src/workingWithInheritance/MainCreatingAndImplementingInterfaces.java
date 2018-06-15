package workingWithInheritance;

public class MainCreatingAndImplementingInterfaces {

    private double volume;
    private boolean crushed = false;

    public double getVolume() {
        double c;
        c = 0;
        return c;
    }

    public void setVolume() {
        //
    }

    public void crush() {
        this.crushed = true;
    }

    public static void main(String[] args) {



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


    }
}
