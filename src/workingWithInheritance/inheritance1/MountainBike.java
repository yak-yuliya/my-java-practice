package workingWithInheritance.inheritance1;

public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;

    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}


//Invocation of a superclass constructor must be the first line in the subclass constructor.!!!!!!

//The syntax for calling a superclass constructor is super();
//        or:
//        super(parameter list);
//With super(), the superclass no-argument constructor is called.
//With super(parameter list), the superclass constructor with a matching parameter list is called.