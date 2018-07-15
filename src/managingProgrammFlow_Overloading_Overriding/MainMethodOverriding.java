package managingProgrammFlow_Overloading_Overriding;

public class MainMethodOverriding {
    //overriding - defining a method in a child class that already exists in parent class
    //with same signature (same name, same arguments)
    //marked with @Override

    //we cannot override static methods!!!!
    //only instance methods can be overriden

    //method is overriden if following rules aplied:
    //- same name and same arguments
    //-return type can be subclass of the return type in parent class
    //- cannot have lower access modifier
    //example:
    //parent method is protected, private metod in child class is not allowed!!!
    //parent method is protected, public metod in child class is allowed!!!

    //only inherited methods can be overriden, it mean only in child class
    //constructors and private methods cannot be overriden
    //final metods cannot be overriden at all
    //subclass can use super.methodname() to call a superclass version of a overriden method!!!!!#



}
