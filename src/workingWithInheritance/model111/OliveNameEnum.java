package workingWithInheritance.model111;

public enum OliveNameEnum {

    // we set a possible values as a simple list, separated with comma
    // just as with constants, the naming convention is to use uppercase
    //old:
    //    KALAMATA, LIGURIAN;
    // now to associate the identifier KALAMATA with a string
// we pass identifier declaration a literal string "kalamata" we want it to translate to
// one of the advantages of enum is that if you decide to add another value later on, you can do it in one place there

    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    //in order to fix the identifier of the enumeration value into a string
    //declare a string ariable

    private String name;

    //then create a constructor method for the enum
    // not public OlivenameEnum(String name) - because the constructor for the enum can be called by enum itself
    // so ou cant put public keyword on it
    //and we set it up to receive a String
    // and withing constructor we save a value to the current instance of enum

    OliveNameEnum(String name) {
        this.name = name;
    }

    // if we want in output to see "Kalamata" instead of KALAMATA, we want this String name to be displayed
   //for that we shall override toString method!!!!!!
    //every java class and enum has a toString method
    //the default toString simply translates the identifier
    //and we change a statement to return a name variable

    @Override
    public String toString() {
        return name;
    }
}
