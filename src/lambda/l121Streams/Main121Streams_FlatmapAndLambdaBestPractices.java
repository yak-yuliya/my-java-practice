package lambda.l121Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main121Streams_FlatmapAndLambdaBestPractices {
        public static void main(String[] args) {
            List<String> someBingoNumbers = Arrays.asList(
                    "N40", "N36",
                    "B12", "B6",
                    "G53", "G49", "G60", "G50", "g64",
                    "I26", "I17", "I29",
                    "O71");

            List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(number -> {
//            if(number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) -> System.out.println(s));
            someBingoNumbers
                    .stream()
                    .map(String::toUpperCase)
                    .filter(s->s.startsWith("G"))
                    .sorted()
                    .forEach(System.out::println);

            //1.
            System.out.println("1 -----------------------");

            Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
            Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
            Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
            System.out.println("-----------------------");
            System.out.println(concatStream
                    .distinct()
                    .peek(System.out::println)
                    .count());

            Employee john = new Employee("John Doe", 30);
            Employee jane = new Employee("Jane Deer", 25);
            Employee jack = new Employee("Jack Hill", 40);
            Employee snow = new Employee("Snow White", 22);

            Department hr = new Department("Human Resources");
            hr.addEmployee(jane);
            hr.addEmployee(jack);
            hr.addEmployee(snow);
            Department accounting = new Department("Accounting");
            accounting.addEmployee(john);

            List<Department> departments = new ArrayList<>();
            departments.add(hr);
            departments.add(accounting);

            System.out.println("2 -----------------------");

            //2.
            // flatMap- is a function, that returns a stream,
            //we come from 1 department object to 3 employee objects
            //it is called flatMap, because it is often used to flatten nested lists
            //we use it, when list is not a source, but the object, containing a list is a source
            //and we use a method to create a list of all the objects in that list

            departments.stream()
                    .flatMap(department -> department.getEmployees().stream())
                    .forEach(System.out::println);

            System.out.println("3 -----------------------");
            //3.
            //another cool method is Collect method
            //it is a terminal operations
            //it collects elements in the stream into another type of result
            //for example we can add all results to List or Set
            //we store elements of a stream in a list and then we print elements of that list

        List<String> sortedGNumbers1 = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(Collectors.toList());

            for(String s : sortedGNumbers1) {
                System.out.println(s);
            }

            //the difference is -  we have a list with which we can work, if we want

            sortedGNumbers1.toArray(new Object[sortedGNumbers1.size()]);

            System.out.println("4 -----------------------");
            //4.
            //lets say we want to collect it to ArrayList
            // we can use more specific method to do this

            List<String> sortedGNumbers2 = someBingoNumbers
                    .stream()
                    .map(String::toUpperCase)
                    .filter(s -> s.startsWith("G"))
                    .sorted()
                    .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
            //on previous line, the first item to collect is a supplier
            //Supplier creates objects, it will construct a new array list for us
            //::new means we want to pass to a constructor
            //seocnd argument - Accumulate
            // add all is a Combiner

            for(String s : sortedGNumbers2) {
                System.out.println(s);
            }

            System.out.println("5 -----------------------");
            //5.

            Map<Integer, List<Employee>> groupedByAge = departments.stream()
                    .flatMap(department -> department.getEmployees().stream())
                    .collect(Collectors.groupingBy(employee -> employee.getAge()));

            departments.stream()
                    .flatMap(department -> department.getEmployees().stream())
                    //first depamtment we pass as a parameter
                    .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                    //(e1, e2) two parameters
                    .ifPresent(System.out::println);

            System.out.println("this is youngest employee");

            //reduce - combines all items in a tream into a single result
            //there are 3 verions of this object
            //we use a stream to find the youngest employee in the company
            //we use version of reduce which expects 2 items and gives you a result
            //if present has optional result

            System.out.println("6 -----------------------");
            //6.

            Stream.of("ABC", "AC", "BAA", "CCccCC", "XY", "ST")
                    .filter(s -> {
                        System.out.println(s);
                        return s.length() == 3;
                    })
                    .count();
            //if we comment ouf .count, there will be no result printed
            //because nothing happens in a stream, if there is no terminal operation
            //it means


        }
    }

