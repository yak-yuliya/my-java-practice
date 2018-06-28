package creatingCustomClasses.model116;

public class Olive116 {

    // we will add constants - one for each time of oil i want to support
    // and then i refer to that constants in my main class

    // each constant will be PUBLIC AND STATIC so we will refer to a constant from a class declaration
    //strong naming convention for constants - they shall always to be uppercase

    public static final String KALAMATA = "KALAMATA";
    public static final String LIGURIAN = "Ligurian";

    //NOW WE CAN REPLACE IT HERE AS A DEFAult value of the olive class
    //because the compilor recognises it as an identifier

    private String name = KALAMATA;
    private long color = 0x2E0854;
    private int oil = 3;

    //these are two constructors, no arguments constriuctor and contr that accepts 3 arguments
    public Olive116() {

    }

    public Olive116(String name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public String getName() {
        return name;
    }

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
