package dataCollections;

import java.util.HashMap;
import java.util.Map;

public class MainManagingUnorderedDataWithHashMap {

    public static void main(String[] args) {
        //HashMap represents resizable unordered data collection
        //ArrayList represents resizable ordered data collection
        //Array is not resizable

        //HashMap is an implementation of interface map
        //each item in a map is a Key - Value pair
        // key is usually a String, and Value - number/String/or any other sort of object
        //we use diamond operator to declare the types of keys and values
        // we use concrete implementation of the Map interface and it is a HashMap
        Map<String, String> map = new HashMap<>();

        //to add values we use method put
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

        map.put("Alaska", "Juneau");
        System.out.println(map);
        map.put("Ukraine", "Kiev");
        System.out.println(map);

        String capital = map.get("Ukraine");
        System.out.println(capital);
        String incorrect = map.get("Kiev");
        System.out.println(incorrect);

        map.remove("Ukraine");
        System.out.println(map);


    }
}
