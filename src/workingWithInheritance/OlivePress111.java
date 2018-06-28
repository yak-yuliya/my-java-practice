package workingWithInheritance;

import workingWithInheritance.model111.Olive;

import java.util.List;

public class OlivePress111 {

    // public method which will be called from anywhere from application and will return integer
    //it will receive an argument - a list of olives (from collection)

    //if you dont put static word - it is an instance method

    public int getOil(List<Olive> olives) {

        //we declare an integer value and we name it oil
        //we initialize it to a value of 0
        int totalOil = 0;

        //we create a for loop and we loop through the collection of olives
        //it is going to return a value and it is going to output a string
        for (Olive o : olives) {
            System.out.println(o.getName());
            totalOil += o.crush();
        }

        //return 0; - if it is still in process of development and we do not know what we will return later
        return totalOil;

    }
}
