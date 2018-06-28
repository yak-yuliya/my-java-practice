package workingWithInheritance.model112;

public abstract class Olive112 {

    private double volume;
    private boolean crushed = false;
    private OliveNameEnum112 name;
    private OliveColor112 color;
    private int oil;

    //these are two constructors, no arguments constriuctor and contr that accepts 3 arguments
    //then we change type here in the constructor method from:
    //public Olive117(String name, long color, int oil) {

    public Olive112(OliveNameEnum112 name, OliveColor112 color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveNameEnum112 getName() {
        return name;
    }

    //we change type in the argument that is passed in setName
    //old:
    //public void setName(String name)
    public void setName(OliveNameEnum112 name) {
        this.name = name;
    }

    public OliveColor112 getColor112() {
        return color;
    }

    public void setColor112(OliveColor112 color) {
        this.color = color;
    }

    public int crush() {
        //we add this in lesson for abstract classes:
        String msg = name + " from " + getOrigin() + ": " + oil + " units";
        System.out.println(msg);
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    //abstract classes cannot be instantiated directly, only its subclasses can be instantiated directly
    //very similar to interfaces, but give me little bit more flexibility
    //and whether to use abstract classes or interfaces is frequently a matter of choise of an application designer

    public abstract String getOrigin();

    //o - overrides from Object!!!!
    // i - overrides from Interface
    @Override
    public String toString() {
        return name.toString();
    }

}
