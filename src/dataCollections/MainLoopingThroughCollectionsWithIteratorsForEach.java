package dataCollections;

import java.util.*;

public class MainLoopingThroughCollectionsWithIteratorsForEach {

    public static void main(String[] args) {

        System.out.println("Ordered data:");
        List<String> list = new ArrayList();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println("toString output");
        System.out.println(list);
        System.out.println("");

        System.out.println("ArrayList iterator");
        //iterator is similar to other collection interface, and that it takes generic anottation
        // string - indicates what kind of data you are looping on
        // then i call the list object and its iterator method
        // and that returns a reference to an iterator obect that i can use to loop through the list
        // in order to loop through the data that using an iterator you use 2 methods
        //a method that return a boolean is called hasnext
        //that indicates whether there is available data in object you are looping throug
        //and then another method named next, that moved to the next available object and return the reference code

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        System.out.println("");

        //exactly the same result, but we do not need an additional object, that iterator requires
        //more memory efficient and takes less code
        System.out.println("ArrayList ForEach");
        for (String value : list) {
            System.out.println(value);
        }
        System.out.println("");


        //doesn´t exist in android version of java and earlier versions of java
        //println method accepts a string
        //i am passing an object and the compiler says: each of the items in the list is string
        //so it then calls a method for you and passes the lsting in
        //in java 8 it is the most efficient, not in performance, but in amount of code you have to write

        System.out.println("Java 8 method reference");
        list.forEach(System.out::println);
        System.out.println("");


        //you can also loop in unordered data
        System.out.println("Unordered data");
        Map<String, String> map = new HashMap<>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);
        System.out.println("");

        //here the uniqueness is guarantied
        //we create a Set and set the data type types of the items to String
        //keyset method returns a set
        //next we create an iterator and set a generic data type as string
        System.out.println("HashMap iterator");
        Set<String> keys = map.keySet();
        Iterator<String> iterator1= keys.iterator();
        while (iterator1.hasNext()){
            String key= iterator1.next();
            System.out.println("The capitaol of " + key + " is " + map.get(key));
        }
        System.out.println("");

        System.out.println("HashMap ForEach");
        for (String key : keys) {
            System.out.println("The capitaol of " + key + " is " + map.get(key));
        }
        System.out.println("");
        System.out.println("");
    }
}
