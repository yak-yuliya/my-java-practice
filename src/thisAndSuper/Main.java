package thisAndSuper;

public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.name);
        System.out.println(p.accessEmployeeVariables());


        Employee e = new Employee();
        System.out.println(e.name + e.address);


        Employee e2 = new Employee("Yuliya");
        System.out.println(e2.name + e2.address);


        Employee e3 = new Employee("Yuliya", "House");
        System.out.println(e3.name + e3.address);


        Employee prog = new Programmer("Helena");
        System.out.println(prog.name + prog.address);

        Programmer prog2 = new Programmer();
        System.out.println(prog2.name + prog2.address);

        Programmer jp = new Programmer("Julia");
        jp.printName("Anna");

        JuniorProgrammer jp2 = new JuniorProgrammer("Irina");
        jp2.printName("Olga");

    }
}
