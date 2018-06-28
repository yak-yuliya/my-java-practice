public  class ComparableInterface2 implements Comparable {
    //we want to compare objects for sorting or to see if objects are the same
    //compareTo
    // returns positive value if calling objects comes before the other object
    // =0 if two objects are equal
    // negative - if calling object comes before
    public static void main(String[] args) {
        ComparableInterface2 addr = new ComparableInterface2("23", "Karajangasse", "Jaegerstrasse",
                "Vienna", "Austria", "1200");
        System.out.println(addr);

        ComparableInterface2 addr2 = new ComparableInterface2("23", "Karajangasse", "Jaegerstrasse",
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

    public ComparableInterface2(String houseNum, String address1, String address2,
                                String city, String state, String zip) {
        houseNumber = houseNum;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zip;
    }

    public ComparableInterface2(String houseNum, String address1,
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

}
