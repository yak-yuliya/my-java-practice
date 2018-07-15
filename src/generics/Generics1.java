package generics;

import java.util.ArrayList;

public class Generics1 {

    //we can replace parameters, we have created for a method
    //generics allow us create classes, interfaces and methods, that can take Types as parameners

    //lets see an array list, that doesnt uses generics

        public static void main(String[] args) {
            ArrayList<Integer> items = new ArrayList<>();
            items.add(1);
            items.add(2);
            items.add(3);
//        items.add("tim");
            items.add(4);
            items.add(5);
            //autoboxing happens here - it converts arrayList type into an integer automatically
            //it converts primitive type into an integer


            printDoubled(items);
        }

        private static void printDoubled(ArrayList<Integer> n) {
            for(int i : n) {
                System.out.println( i * 2);
            }
        }
    }

