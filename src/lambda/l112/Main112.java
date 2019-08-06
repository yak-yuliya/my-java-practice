package lambda.l112;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main112 {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });


        //here is our lambda!!!!
        //three parts which lambda consists of:
        //pack1. argument list, 2 parameters in our case (Employee employee1, Employee employee2)
        //2. arrow token
        //3. the body
        //lambda here is an argument, we split it on two lines

        Collections.sort(employees, (Employee employee1, Employee employee2) ->
        employee1.getName().compareTo(employee2.getName()));

// we can rewrite the upper lines in
//        Collections.sort(employees, (employee1, employee2) ->
//                employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

