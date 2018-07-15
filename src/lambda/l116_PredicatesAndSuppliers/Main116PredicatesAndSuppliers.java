package lambda.l116_PredicatesAndSuppliers;

import lambda.l115_Main115FunctionalInterfacesAndPredicates.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main116PredicatesAndSuppliers {
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

            printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
            printEmployeesByAge(employees, "\nEmployees 30 and under", employee ->employee.getAge() <= 30);

            //here intllij has created an anonimous class for us
            //with already overwritten boolean Test
            //all we need to do is to return an expression
            //and expression needs to be true for whatever we need

            printEmployeesByAge(employees, "\nEmployees younger than 25", new Predicate<Employee>() {
                @Override
                public boolean test(Employee employee) {
                    return employee.getAge() < 25;
                }
            });

            //lets add a predicate, which tests whether an integer is greater than 15

            IntPredicate greaterThan15 = i -> i > 15;
            IntPredicate lessThan100 = i -> i < 100;
            //this predicate doesnßt do anything, it shall be used somewhere
            IntPredicate lessThan3000 = i -> i < 3000;


            System.out.println(greaterThan15.test(10));
            int a = 20;
            System.out.println(greaterThan15.test(a + 5));

            //wow, this is really interesting writing!!!!
            //test will return true, if both predicates return true
            //and test will return false if at least one predicate will return false

            System.out.println(greaterThan15.and(lessThan100).test(50));
            System.out.println(greaterThan15.and(lessThan100).test(15));

            Random random = new Random();
            Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
            for(int i=0; i<10; i++) {
                System.out.println(randomSupplier.get());
            }


        }

        private static void printEmployeesByAge(List<Employee> employees,
                                                String ageText,
                                                Predicate<Employee> ageCondition) {

            System.out.println(ageText);
            System.out.println("==================");
            for(Employee employee : employees) {
                if (ageCondition.test(employee)) {
                    System.out.println(employee.getName());
                }
            }
        }
    }
    //we dont have to use lambda expressions, we can always use anonymous class

