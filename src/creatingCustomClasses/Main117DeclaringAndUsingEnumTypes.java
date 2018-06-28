package creatingCustomClasses;

import creatingCustomClasses.model117.Olive117;
import creatingCustomClasses.model117.OliveNameEnum;

import java.util.ArrayList;
import java.util.List;

public class Main117DeclaringAndUsingEnumTypes {

            public static void main(String[] args) {

                List<Olive117> olives = new ArrayList<>();

                //enumerations - lists of possible values that we can use for any particular variable
                //enum class can be created as an own seperate code file or as a nested enum if it is
                //going to be used in one java class


                //this will produce an error:
                //olives.add(new Olive116(OliveNameEnum.KALAMATA, 0x2E0854, 5));
                //because an olive constructor is looking for a string

                olives.add(new Olive117(OliveNameEnum.KALAMATA, 0x2E0854, 5));
                olives.add(new Olive117(OliveNameEnum.KALAMATA, 0x2E0854, 5));
                olives.add(new Olive117(OliveNameEnum.LIGURIAN, 0x000000, 2));
                olives.add(new Olive117(OliveNameEnum.LIGURIAN, 0x000000, 2));
                olives.add(new Olive117(OliveNameEnum.LIGURIAN, 0x000000, 2));
                olives.add(new Olive117(OliveNameEnum.LIGURIAN, 0x000000, 2));


                OlivePress117 press = new OlivePress117();
                int totalOil = press.getOil(olives);
                System.out.println("Total olive oil: " + totalOil);


            }
        }

