package composition_encapsulation_polymorphism.composition1;

public class Main {

    //The composition is another mechanism provided by OOP
    // for reusing implementation.
    //
    //In a nutshell, composition allows us to model objects
    // that are made up of other objects, thus defining a “has-a”
    // relationship between them.
    //
    //Furthermore, the composition is the strongest form of association,
    // which means that the object(s) that compose or are contained
    // by one object are destroyed too when that object is destroyed.

    public static void main(String[] args) {
	    Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );
        thePC.getMotherboard().loadProgram("Windows pack1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
