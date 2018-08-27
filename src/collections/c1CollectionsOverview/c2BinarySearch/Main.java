package collections.c1CollectionsOverview.c2BinarySearch;

public class Main {

    //it was implemented in an inefficient way
    //because it goes through each element of array list
    //in order to have better performance, we need to implement Comparable interface
    //

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();
        if(theatre.reserveSeat("B13")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
