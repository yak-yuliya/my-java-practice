package lambda.l119Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main119Streams {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

        List<String> gNumbers = new ArrayList<>();

        System.out.println("pack1 ==================");

        // pack1.
        someBingoNumbers.forEach(number -> {
            if (number.toUpperCase().startsWith("G")) {
                gNumbers.add(number);
                System.out.println(number);
            }
        });

        System.out.println("2 ==================");
        //2. here we are soring elements
        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));

        //3.
        System.out.println("3 ==================");

        gNumbers.forEach((String s) -> System.out.println(s));
        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("4 ==================");

        //4. we can replace all of the above with one line!!!!
        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                //this will be valid as well
                //.map(s->s.toUpperCase)
                .filter(s -> s.startsWith("G"))
                //filter method wants a predicate, not a function
                //it takes a parameter and returns true/false value
                //resulting stream will contain items for which predicate returned true
                .sorted()
                .forEach(System.out::println);

        //map method accepts a function, and function ccepts pack1 argument and returns a value
        //String object we use to map the method
        //similar lines
        //String upperString = myString.toUpperCase();
        //String upperString = toUpperCase(myString);

        System.out.println("5 ==================");
        //5. my example
        Stream.of("a1", "a2","a3")
                .findFirst()
                .ifPresent(System.out::println);

        //stream method will be always a first call we make
    }
}
