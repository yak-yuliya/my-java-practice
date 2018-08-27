package collections.c1CollectionsOverview.c3CollectionsListMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //we gonna look at reverse sort method Collections class provides
    //we will copy one list into another
    //lets change Seat class to public

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);

	    //we create a new array of seat objects
        //if we pass existing seat of our theater object, we will have a new list, containing all the seats
        //!!!!!!! ASK SOMEONE
        //this is called SHALLOW COPY
        //IT MEANS IF YOU CHANGE SOMETHING IN THE COPIED LIST, THE ITEMS ARE STILL SAME AS IN THE INITIAL LIST
        //it means we have 2 references, but same object
        //the deap copy - the elements are really copies, not just references

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        System.out.println("======================================================================");
        System.out.println("here we print List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);");
        printList(seatCopy);

        //reverse sort method Collections class provides
        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }


        //seats reverse copy of list and print both of them to see that they really point to the same object
        //they are separate array lists but they refer to the same object
        //
        Collections.reverse(seatCopy);
        System.out.println("Printing reverse (last item is on first position)");
        printList(seatCopy);
        Collections.shuffle(seatCopy);
        System.out.println("Printing shuffle (items in a random order)");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        //this will return min and max even if we use shuffle method
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

        //no idea what he explains here, why do we need this
        //he shows us some error
        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
        Collections.copy(newList, theatre.seats);
    }

    //we print seats list

    public static void printList(List<Theatre.Seat> list) {

        //what does it mean - ask someone!!!!!!!!!????????

        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("======================================================================");
    }

    //if you want to implement your own order, Collection class provides swap method
    //we pass array list and index positions of two items that we want to swap
    //

    public static void sortList(List<? extends Theatre.Seat> list) {
        for(int i=0; i<list.size() -1; i++) {
            for(int j=i+1; j<list.size(); j++) {
                //if items are not the same
                if(list.get(i).compareTo(list.get(j)) >0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }













}
