package collections.c1CollectionsOverview.c9ImmutableClasses;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 8/12/2015.
 */
public class Location {

    //we have also made fields prival and final so that they cant be changed
    //final - makes it clear, while reading the code, that the feld shall not be changed
    //it also shows that we will not inadvertedly (неумышленно) change our fields at some time in a future
    //we didn t provide setters for id and descriptions fields
    //automatically generate getters and setters in intellij - bad idea
    //better is to provide setter if the class actually needs that
    //so if we want set the elements of our immutable class once and never change again, so this needs to be done in the constructor
    //

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    //was  public Location(int locationID, String description) {

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>(exits);
        this.exits.put("Q", 0);
    }

    //this was added to the constructor
    //instead of this we gonna have all the exists in an object constructed


//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    //get exists map,
    // rather than returning exits object directly, which would expose it for the potential to be changed externally
    // we have created a new hash map object, that contains all the elements of exits and return that
    //there is no chance to change an internal map now


    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
