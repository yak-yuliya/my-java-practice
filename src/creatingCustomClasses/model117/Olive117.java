package creatingCustomClasses.model117;

public class Olive117 {
    //old code:
    //private String name = KALAMATA;

    //we change data type from String to OliveNameEnum
    //the enum becomes a type of its own

    private OliveNameEnum name = OliveNameEnum.KALAMATA;
    private long color = 0x2E0854;
    private int oil = 3;



    //these are two constructors, no arguments constriuctor and contr that accepts 3 arguments
    public Olive117() {

    }
    //then we change type here in the constructor method from:
    //public Olive117(String name, long color, int oil) {

    public Olive117(OliveNameEnum name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }
    //and the same (change type) thing in the return value of getName
    //old:
    //public String getName() {

    public OliveNameEnum getName() {
        return name;
    }

    //we change type in the argument that is passed in setName
    //old:
    //public void setName(String name)
    public void setName(OliveNameEnum name) {
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
