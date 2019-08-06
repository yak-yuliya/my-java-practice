package lambda.l115_Main115FunctionalInterfacesAndPredicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate; //this package was added in Java 8
// function interface contains 30 functional interfaces

// function contains functional interfaces, that are ment to be used with lambda expressions
//interfaces do not do anything specific, thez represent the structure, commonly used in java


public class Main115FunctionalInterfacesAndPredicates {
    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        //pack1. when we call forEach, it iterates over the list
        //consumer accepts pack1 parameter in, nothing out
        //lambda takes one object - employee, it does something and doesnt return anything, it matches with the Consumer
        //on each iteration, it calls Consumer method, passing pack1 employee object as the parameter
        //the employees name and age are printed in console and nothing is returned
        //the employee is consumed and iterator moves to the next employee

        System.out.println("pack1 ==================");

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

        //2. code without lambda expression
        System.out.println("2 ==================");
        System.out.println("Employees over 30:");
        for (Employee employee : employees) {
            if (employee.getAge() > 30) {
                System.out.println(employee.getName());
            }
        }

        System.out.println("3 ==================");

        //3.
        employees.forEach(employee -> {
            if (employee.getAge() > 30) {
                System.out.println(employee.getName());
            }
        });

        employees.forEach(employee -> {
            if (employee.getAge() <= 30) {
                System.out.println(employee.getName());
            }
        });


        System.out.println("4 ==================");
        //lets move that code to a method and pass a boolean parameter
        //for example we can pass True if it is >30 and False if it is <=30
        //here it is a perfect example to use a predicate which is build in function package
        //it accepts a predicate, which returns a boolean value
        //we can replace forEach which we are using with predicates

        //predicates lambdas are just lambdas expressions, that match the Predicate interface

        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "\nEmployees 30 and under", employee -> employee.getAge() <= 30);

    }


    //predicate usage
    //we cannot use ForEach loop because it expects Consumer
    //instead we will use Enhanced For loop
    //if Test method returns True, Name of employee will be printed

    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition) {

        System.out.println(ageText);
        System.out.println(" Predicates usage ==================");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }


}


