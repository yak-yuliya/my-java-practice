package creatingCustomClasses;

import creatingCustomClasses.model114.Olive114;

import java.util.ArrayList;
import java.util.List;

public class Main114StoringDataInInstanceVariables {

    public static void main(String[] args) {

//array list Olive, we instantiate it with new
        //this is a collection
        List<Olive114> olives = new ArrayList<>();

        // we declare one of the olives
        Olive114 olive1 = new Olive114();
        //then we add an olive to the list
        olives.add(olive1);

        Olive114 olive2 = new Olive114();
        olives.add(olive2);

        Olive114 olive3 = new Olive114();
        olives.add(olive3);

        // we declare an instance of OlivePress class
        //to the getOil method we pass in our olives collection
        OlivePress114 press = new OlivePress114();
        press.getOil(olives);

    }
}
