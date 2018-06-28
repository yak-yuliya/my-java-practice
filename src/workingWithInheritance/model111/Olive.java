package workingWithInheritance.model111;

public class Olive {

    private double volume;
    private boolean crushed = false;
    private workingWithInheritance.model111.OliveNameEnum name;
    private OliveColor color;
    private int oil;

    //these are two constructors, no arguments constriuctor and contr that accepts 3 arguments
    //then we change type here in the constructor method from:
    //public Olive117(String name, long color, int oil) {

    public Olive(OliveNameEnum name, OliveColor color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

        public OliveNameEnum getName() {
        return name;
    }

        //we change type in the argument that is passed in setName
        //old:
        //public void setName(String name)
        public void setName(OliveNameEnum name) {
        this.name = name;
    }

        public OliveColor getColor() {
        return color;
    }

        public void setColor(OliveColor color) {
        this.color = color;
    }

        public int crush() {
        System.out.println(name + ": " + oil + " units");
        return oil;
    }

        public void setOil(int oil) {
        this.oil = oil;
    }

    @Override
    public String toString() {
            return name.toString();
    }

}
