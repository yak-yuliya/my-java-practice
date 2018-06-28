package workingWithInheritance;

import workingWithInheritance.model112.Olive112;

import java.util.List;

public class OlivePress112 implements PressInterface112 {

    private int currentOil;

    // public method which will be called from anywhere from application and will return integer
    //it will receive an argument - a list of olives (from collection)

    //if you dont put static word - it is an instance method

    public int getOil112(List<Olive112> olives) {

        //we declare an integer value and we name it oil
        //we initialize it to a value of 0
        int totalOil = currentOil;

        //we create a for loop and we loop through the collection of olives
        //it is going to return a value and it is going to output a string
        for (Olive112 o : olives) {
            System.out.println(o.getName());
            totalOil += o.crush();
        }

        //return 0; - if it is still in process of development and we do not know what we will return later
        return totalOil;

        //press opt + return to open automatic "Implement methods" dialog

    }

    //if i forget to put Override - the different function might be implemented
    //sign to the left shows me that it is an implementation of an abstract!!!!!!!
    //helps me to make no mistake
    //setOil112(int oil, int agr2)
    @Override
    public void setOil112(int oil) {
        currentOil = oil;
    }
}
