package collections.c1CollectionsOverview;

import java.util.*;

//        char is one character.
//        String is zero or more characters.
//
//        char is a primitive type.
//        String is a class.
//        char c = 'a';
//        String s = "Hi!";
//char means single character. In java it is UTF-16 character. String can be thought as an array of chars.

public class Theatre {
    private final String theatreName;

    //list of the seats objects
    private List<Seat> seats = new ArrayList<>();
//    private Collection<Seat> seats = new LinkedList<>();
//    private Collection<Seat> seats = new ArrayList<>();
//    private Collection<Seat> seats = new HashMap<>();
//    private Collection<Seat> seats = new Map<>();
//    private Collection<Seat> seats = new LinkedList<>();

    //constructor, number of rows, number of seats
    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++) { //we create a seat for each of row
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum)); //create a seat obj,
                seats.add(seat);   //we add it to array list
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if(requestedSeat == null) {   //in case invalid seat, not valid, is requested
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }

    // for testing
    public void getSeats() { //we return the list of seats
        for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) { //constructor
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }



















}
