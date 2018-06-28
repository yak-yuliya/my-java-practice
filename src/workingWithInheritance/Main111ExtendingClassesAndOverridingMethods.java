package workingWithInheritance;

import workingWithInheritance.model111.Kalamata;
import workingWithInheritance.model111.Ligurian;
import workingWithInheritance.model111.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main111ExtendingClassesAndOverridingMethods {

    public static void main(String[] args) {

// insterad of passing a long value as a color, i am instead using a new enumeration, named OliveColor


        List<Olive> olives = new ArrayList<>();

        //onstead of creating a new instance of the Olive class, instead of this
        //olives.add(new Olive(OliveNameEnum.KALAMATA, OliveColor.PURPLE, 3));
        //we will write this:
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        OlivePress111 press = new OlivePress111();
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");
    }
}
