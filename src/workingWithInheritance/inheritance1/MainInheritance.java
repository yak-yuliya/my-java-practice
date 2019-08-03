package workingWithInheritance.inheritance1;

public class MainInheritance {

    public static void main(String[] args) {

        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);


        Car jeep = new Car("Jeep", "small", 4,4,4,true);
        jeep.printVehicleMethod(); //will return "Printed in Subclass Car!"

        jeep.printVehicleMethod2(); //will return "Printed in Superclass Vehicle!"


        //Within Subclass, the simple name printMethod() refers to the one declared in Subclass, which overrides the one in Superclass.
        // So, to refer to printMethod() inherited from Superclass,
        // Subclass must use a qualified name, using super as shown. Compiling and executing Subclass prints the following:
        //
        //Printed in Superclass.
        //Printed in Subclass



    }
}
