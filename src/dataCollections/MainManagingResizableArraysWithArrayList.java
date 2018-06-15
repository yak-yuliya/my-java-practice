package dataCollections;

import java.util.ArrayList;
import java.util.List;

public class MainManagingResizableArraysWithArrayList {

    public static void main(String[] args) {

//list and map can contain as many items as we want.
        //simple array can not
        //diamond operator - withong it we decrale the type of operator we want to have in a list
        //ArrayList<> - instead of creation a List as a constructor, we use implementing class or the concrete implementation of the class
        // constractor method of an ArrayList class, not the List interface
        // you can use constructor of List (interface) List<String> list = new List<>();
        //but then you will need to write all its code
        //arraylist - resizeable array, array is not resizable
        //you can create an arraylist with no values, and then the values will be added
        //if you already know how many items arraylist will have, you can pass an integer value
        //you don´t have to pass a data type of items again - ArrayList<>
        //this was introdiced in java7
        //pior to java7 you would write ArrayList<String>
        List<String> list = new ArrayList<>();

        //lets add some items to the list
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println(list);

        list.add("Alaska");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String state = list.get(1);
        System.out.println("The second state is: " + state);

//how to find an item in a list
        int pos = list.indexOf("Alaska");
        System.out.println("Alaska is at position: " + pos);
    }
}
