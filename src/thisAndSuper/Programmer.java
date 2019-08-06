package thisAndSuper;

public class Programmer extends Employee {

//    String name = "Ivan";

    Programmer(){
//        name = "NoNameProgrammer";
//        address = "NoAddressProgrammer";
        super("NoNameProgrammer","NoAddressProgrammer" );
    }

    Programmer(String name) {
       // this();
        this.name = name;
    }

    Programmer(String name, String address) {
        this.address = address;
        this.name = name;
    }


    public String accessEmployeeVariables() {
        name = "Helena";
        return name;
    }

    public void printName (String name){
        System.out.println("Programmer name: " + super.name);
    }
}
