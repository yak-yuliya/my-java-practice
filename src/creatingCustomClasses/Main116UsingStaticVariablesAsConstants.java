package creatingCustomClasses;

import creatingCustomClasses.model116.Olive116;

import java.util.ArrayList;
import java.util.List;

public class Main116UsingStaticVariablesAsConstants {

    public static void main(String[] args) {
        //consztant - a variable, whose value cant be cnahed
        // java developers create constants using FINAL keyword
        // final - applied to variable, means that its value only can be set once
        // in 115 we were setting the names of oils with simple strings
        //that works fine, but it is problematic, because it is easy to missspell it
        // so lets add constants to the olive class
        // the difference with 155 - is an ease of use and robustness of code
        //because now we use the constance, we cannot misspell the string so easily

        List<Olive116> olives = new ArrayList<>();

        // old code: olives.add(new Olive116("Kalamata", 0x2E0854, 5));
        //we replace all references of "Kalamata" string with constances
        olives.add(new Olive116(Olive116.KALAMATA, 0x2E0854, 5));
        olives.add(new Olive116(Olive116.KALAMATA, 0x2E0854, 5));
        olives.add(new Olive116(Olive116.LIGURIAN, 0x000000, 2));
        olives.add(new Olive116(Olive116.LIGURIAN, 0x000000, 2));
        olives.add(new Olive116(Olive116.LIGURIAN, 0x000000, 2));
        olives.add(new Olive116(Olive116.LIGURIAN, 0x000000, 2));


        OlivePress116 press = new OlivePress116();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);


    }
}
