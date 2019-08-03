package oop.innerClasses.part1;

public class Main {
    public static void main(String[] args) {

        //SO THE CORRECT WAY IS: WE REFERENCE OUTER CLASS FIRST

        Gearbox mcLaren = new Gearbox(6);

        //this is how we create an onject of Gear class
        //to create an instance of Gear class we need to use Gearbox
        //and have such a syntax, because Gear is an inner class of Gearbox
        //mcLaren.new - we use mcLaren Gearbox instance that we have created

        //THEN WE INITIALISE IT

        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));

        //we cannot crate Gear box object without an instance of Gearbox class
        // we will have an error here, that Gearbox IS NOT AN ENCLOSING CLASS
        //Gearbox.Gear second = new Gearbox.Gear(2, 15.4);

        //we also cannot do following, this also will nor work
        //we might this that this might work, but it doesnt
        //Gearbox.Gear third = new mcLaren.Gear(3, 17.8);


        //OTHER THING TO KEEP IN MIND, THAT INNER CLASS CAN BE PRIVATE


        // gear can be private anyway, so instances shall be created by outer class
        //we dont want normally people to directly access anyway
        // if it is private, this line will not work
//        Gearbox.Gear2 firstFromPrivateClass = mcLaren.new Gear2(pack1, 12.3);
//        System.out.println(first.driveSpeed(1000));

        Gearbox audi = new Gearbox(6);
        audi.addGear(1, 5.3);
        audi.addGear(2, 10.5);
        audi.addGear(3, 12.3);
        audi.operateClutch(true);
        audi.changeGear(1);
        audi.operateClutch(false);






    }
}
