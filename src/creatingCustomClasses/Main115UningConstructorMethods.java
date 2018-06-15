package creatingCustomClasses;

import creatingCustomClasses.model115.Olive115;

import java.util.ArrayList;
import java.util.List;

public class Main115UningConstructorMethods {

    public static void main(String[] args) {


        //when you create an instance of a class, you tyically use its construuctor methods
        //in this code we are calling a constructor method 3 times

            List<Olive115> olives = new ArrayList<>();
//            Olive115 olive1 = new Olive115("Kalamata", 0x2E0854, 5);
//            olives.add(olive1);
//            Olive115 olive2 = new Olive115("Ligurian", 0x000000, 2);
//            olives.add(olive2);
//            Olive115 olive3 = new Olive115("Kalamata", 0x2E0854, 5);
//            olives.add(olive3);

            //or

        olives.add(new Olive115("Kalamata", 0x2E0854, 5));
        olives.add(new Olive115("Kalamata", 0x2E0854, 5));
        olives.add(new Olive115("Ligurian", 0x000000, 2));
        olives.add(new Olive115("Ligurian", 0x000000, 2));
        olives.add(new Olive115("Ligurian", 0x000000, 2));
        olives.add(new Olive115("Ligurian", 0x000000, 2));


            OlivePress115 press = new OlivePress115();
            int totalOil = press.getOil(olives);
            System.out.println("Total olive oil: " + totalOil);


    }
}
