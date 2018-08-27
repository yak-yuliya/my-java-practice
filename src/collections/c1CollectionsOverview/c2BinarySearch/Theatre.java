package collections.c1CollectionsOverview.c2BinarySearch;

import java.util.*;

public class Theatre {
    private final String theatreName;

    //BINARY SEARCH IS A PART OF COLLECTIONS FREAMWORK


    //private List<Seat> seats = new ArrayList<>();
    //we will change this to Linked List
    //private List<Seat> seats = new LinkedList<>();
    //now let´s change a list to a Collection - lets make it even more generic to use any of collection class tp hold our seats
    //if we do it like this, we can implement any of collections classes, that implements this Collection interface (Set, List, Queue, Deque)
    //private Collection<Seat> seats = new LinkedList<>();
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }


    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        //we are passing null because we use inbuild comparison operator
        //BINARY SEARCH IS THE FASTEST WAY TO FIND THE ITEM IN SORTED LIST BY CHECKING THE ELEMENT
        //IN THE MIDPOINT OF THE LIST
        // IF THE MIDDLE ELEMENT IS GREATER THAN THE ITEM WE ARE LOOKING FOR,
        //IT PERFORMS THE BINARY SEARCH IN THE HALF LIST
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        //now we check for number than is greater than zero
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat (binary search)" + seatNumber);
            return false;
        }


        //we dont need this code any more - CODE FROM PREVIOUS LESSON
//        for (Seat seat : seats) {
//            System.out.println(".");
//            if (seat.getSeatNumber().equals(seatNumber))
//                requestedSeat = seat;
//            break;
//        }
//        if (requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();


    }

    // for testing
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    // when we added this implements Comparable, we have also rewritten
    //return this.seatNumber
// into
//return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    private class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        //this is added
        @Override
        public int compareTo(Seat seat) {
            //this is changed
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
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
