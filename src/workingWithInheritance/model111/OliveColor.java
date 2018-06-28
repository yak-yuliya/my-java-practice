package workingWithInheritance.model111;

public enum OliveColor {

//enum has three options, each has assiciated name and long color value

    PURPLE("Purple",0x2E0854),BLACK("Black",0x000000),

    GREEN("Green",0x00FF00);

    String name;
    long color;

    // the constructor method receives both values and saves them

    OliveColor(String name, long color) {
        this.name = name;
        this.color = color;
    }

    // and the toString method returns just the name

    @Override
    public String toString() {
        return name;
    }
}
