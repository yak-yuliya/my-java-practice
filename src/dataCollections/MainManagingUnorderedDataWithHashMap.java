package dataCollections;

import java.util.HashMap;
import java.util.Map;

public class MainManagingUnorderedDataWithHashMap {

    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String DINNER = "dinner";

//psfs

    public static void main(String[] args) {



        //HashMap represents resizable unordered data collection
        //ArrayList represents resizable ordered data collection
        //Array is not resizable

        //HashMap is an implementation of interface map
        //each item in a map is a Key - Value pair
        // key is usually a String, and Value - number/String/or any other sort of object
        //we use diamond operator to declare the types of keys and values
        // we use concrete implementation of the Map interface and it is a HashMap


        Map<String, String> meals = new HashMap<>();

        //to add values we use method put
        meals.put(BREAKFAST, "Waffles");
        meals.put(LUNCH, "Gyros");
        meals.put("dinner", "Enchiladas");
        System.out.println(meals);

        System.out.println(meals.get("dinner"));//get key

        //remove
        String lunch = meals.remove("lunch");
        System.out.println(lunch); //boolean - whether the map contains this item

        boolean hasLunch = meals.containsKey("lunch");
        boolean hasGyros = meals.containsValue("Gyros");
        System.out.println(hasLunch + " " + hasGyros);


        int size = meals.size();
        System.out.println(size);


        //cannot contain duplicate keys
        meals.put("dinner", "Enchiladas");
        meals.put("dinner", "Pudding");//will everwrite

        System.out.println(meals);


        System.out.println(meals.get("diner"));//will return null. because of typos instead of using strings, we shall use constants, set to these values





//        Map<String, String> map = new HashMap<>();
//
//        //to add values we use method put
//        map.put("California", "Sacramento");
//        map.put("Oregon", "Salem");
//        map.put("Washington", "Olympia");
//        System.out.println(map);
//
//        map.put("Alaska", "Juneau");
//        System.out.println(map);
//        map.put("Ukraine", "Kiev");
//        System.out.println(map);
//
//        String capital = map.get("Ukraine");
//        System.out.println(capital);
//        String incorrect = map.get("Kiev");
//        System.out.println(incorrect);
//
//        map.remove("Ukraine");
//        System.out.println(map);




    }
}
