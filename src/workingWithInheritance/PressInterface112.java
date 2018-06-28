package workingWithInheritance;

import workingWithInheritance.model112.Olive112;

import java.util.List;

public interface PressInterface112 {
    //we copy method signature from OlivePress class
    public int getOil112(List<Olive112> olives);
    //we are not implementing a method here,
    //we are just saying that any class, that wants to implements this interface must have this method
    // the method name must be getOil,
    //it must return an integer
    //and it must accept a single argument list of olive objects


    //lets add a new method declaration in the interface
    public void setOil112(int oil);

}
