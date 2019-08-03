package collections.c1CollectionsOverview.c28LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {



    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i= linkedList.iterator(); //iterating through all elements, that are on array list or linked list
        //.iterator();  this method is part of linked list, comes with it automatically

        //i.hasNext it is an equivalent of typing i++
        //i.hasNext is just asking "is there any entry next?"
        //i.net - is actually MOVING to the next entry
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }

    /*boolean hasNext()
Returns true if the iteration has more elements. (In other words, returns true if next() would return an element rather than throwing an exception.)

E next()
Returns the next element in the iteration.
*/

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        //List iterator gives you some more flexibility than traditional iterator
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity); //it gives us a number
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0) {
                // new City should appear before this one
                // Brisbane  -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // move on next city
            }
        }

        stringListIterator.add(newCity);
        return false;//
    }
}

