public class ComparableInterface implements Comparable {
    //we want to compare objects for sorting or to see if objects are the same
    //compareTo
    // returns positive value if calling objects comes before the other object
    // =0 if two objects are equal
    // negative - if calling object comes before
    public static void main(String[] args) {
        ComparableInterface addr = new ComparableInterface("23", "Karajangasse", "Jaegerstrasse",
                "Vienna", "Austria", "1200");
        System.out.println(addr);

        ComparableInterface addr2 = new ComparableInterface("23", "Karajangasse", "Jaegerstrasse",
                "Vienna", "Austria", "1210");
        System.out.println(addr.compareTo(addr2));
        System.out.println(addr2.compareTo(addr));
    }

    private String houseNumber;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;

    public ComparableInterface(String houseNum, String address1, String address2,
                               String city, String state, String zip) {
        houseNumber = houseNum;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zip;
    }

    public ComparableInterface(String houseNum, String address1,
                               String city, String state, String zip) {
        houseNumber = houseNum;
        this.address1 = address1;
        this.address2 = "";
        this.city = city;
        this.state = state;
        this.zipcode = zip;
    }

    @Override
    public String toString() {
        if (address2.equals("")) {
            return (houseNumber + " "
                    + address1 + "\n" + city + ", " + state +
                    " " + zipcode);
        } else {
            return (houseNumber + " "
                    + address1 + "\n" + address2 + "\n" +
                    city + ", " + state + " " + zipcode);
        }
    }

    @Override
    public int compareTo(Object a) {
        //this compareTo method allows the programmer to sort addresses by zip
        //code
        //i am casting object that came in from the calling program - object a - as an ComparableInterface object
        // so i create a new address variable
        ComparableInterface addr = (ComparableInterface) a;

        //converting zip code to an integer value
        int zip1 = Integer.parseInt(this.zipcode);

        //i take another object - addr object and convert it to another integer
        int zip2 = Integer.parseInt(addr.zipcode);

        // now we compare them
        if (zip1 < zip2)
            return -1;
        else if (zip1 > zip2)
            return 1;

        /* if i want to compare more values
        if (state1 < state2)
            return -pack1;
        else if (state1 > state2)
            return pack1;

        if (city1 < city2)
            return -pack1;
        else if (city1 > city2)
            return pack1;
        */

        return 0;
    }

}
