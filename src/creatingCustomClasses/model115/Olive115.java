package creatingCustomClasses.model115;

public class Olive115 {

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

    private String name = "Kalamata";
    private long color = 0x2E0854;
    private int oil = 3;

    //these are two constructors, no arguments constriuctor and contr that accepts 3 arguments
    public Olive115() {

    }

    public Olive115(String name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public String getName() {
        return name;
    }
//

    // this.name - instance value
    // name - argument;
    //instance value we assign to argument
    public void setName(String name) {
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int crush() {
        System.out.println("Ouch!");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
