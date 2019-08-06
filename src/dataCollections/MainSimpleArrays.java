package dataCollections;

public class MainSimpleArrays {

    public static void main(String[] args) {
//        //String[] scores = new Array[6]; //incorrect!!!!!
//
//        String[] friends = new String[3];
////null, null, null
//      //  System.out.println(friends);///[Ljava.lang.String;@266474c2
//
//        friends[0] = "Julie";
//      //  System.out.println("friends[0]: " + friends[0]);
//
//        friends[1] = "Elena";
//
//      //  System.out.println("friends[3]: " + friends[2]);//friends[3]: null
//
//        friends[2] = "Ben";
//
//
//        System.out.println(friends[friends.length - 1]);
//        //System.out.println(friends[3]); - out of index
//        //System.out.println(friends.getLast()); - not existing


//array literal

        //String[] friends = new {"Pasan", "Alena", "Ben"} //incorrect
        String[] friends =  {"Pasan", "Alena", "Ben"}; //correct

        String[] snacks;
//        snacks = {"nachos", "chips", "snickers", "pop corn"}; //does not work, it doesn´´ know the type!! why?

        snacks = new String[]{"nachos", "chips", "snickers", "pop corn"};





//
//
//
//        System.out.println("//////////////////////");
//
//        //to store ordered data in java
//        //array can point to any data: primitive or object
//
//        System.out.println("Array of primitives:");
//        //set of integers
//        //array is not resizable - once it is been set, its size cannot be changed
//        int[] ints = {7, 6, 9};
//        //or int inst[]
//        Arrays.sort(ints);
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }
//
//        System.out.println("Array of strings:");
//        String[] strings = {"Red", "Green", "Blue"};
//        Arrays.sort(strings);
//        for (String colour : strings) {
//            System.out.println(colour);
//        }
//
//        System.out.println("Setting an initial size");
//        //without declaring the values, you can set an initial size of an array
//        //number of items that i want to have available in the array
//        int[] sized = new int[10];
//        for (int i = 0; i < sized.length; i++) {
//            sized[i] = i * 100;
//        }
//
//        for (int value : sized) {
//            System.out.println(value);
//        }
//
//        System.out.println("Copying an array");
//        int[] copied = new int[5];
//        //initial array; beginning position, from where you need to copy;
//        // destination array; the beginning of dest array; the end of dest array
//        System.arraycopy(sized, 5, copied, 0, 5);
//        for (int value : copied) {
//            System.out.println(value);
//        }

    }
}
