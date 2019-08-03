package thisAndSuper;

class Employee {
    String name = "Julia";
    String address;

    Employee() {
        name = "NoName";
        address = "NoAddress";
    }

    Employee(String name) {
        //this();
        this.name = name;
    }

    Employee(String name, String address) {
        //this(name);
        this.name = name;
        this.address = address;
    }

    public void printName (String name){
        System.out.println("Employee name: " + name);
    }
}
