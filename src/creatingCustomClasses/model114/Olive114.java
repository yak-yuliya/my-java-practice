package creatingCustomClasses.model114;

public class Olive114 {

    // common java vocabulary
    // a model class defines your data model
    //for the test 114

    //this class does not have an explicit constructor method, but thats fine
    //because the java compilor creates it for me

    //if you dont put static word - it is an instance method
    //class, that is designed to encapsulate data, such as our model class, typically will have instance methods, known as getters and setters
    //getter - accessor method, simply return the value
    //setter - modifier method, receive an argument
    //this - to distinguish a variable, that is member of an instance from the argument (String name as a method "input" themod)
    // to fully incapsulate it and make sure no other part of application has access to it we make these variables private
    //    public String name = "Kalamata";
    //    public long color = 0x2E0854;
    //    public int oil = 3;
    //now the only access to them is through the getters and setters

    public String name = "Kalamata";
    public long color = 0x2E0854;
    public int oil = 3;


}
