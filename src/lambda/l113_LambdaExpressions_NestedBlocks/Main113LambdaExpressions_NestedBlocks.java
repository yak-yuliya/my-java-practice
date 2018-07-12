package lambda.l113_LambdaExpressions_NestedBlocks;

import java.util.ArrayList;
import java.util.List;

import static lambda.l113_LambdaExpressions_NestedBlocks.Main113LambdaExpressions_NestedBlocks.doStringStuff;

public class Main113LambdaExpressions_NestedBlocks {

    public static void main(String[] args) {
//        new Thread(()-> {
//            System.out.println("Printing from the Runnable");
//            System.out.println("Line 2");
//            System.out.format("This is line %d\n", 3);
//        }).start();

//IN THIS CLASS WE WILL SEE THAT LAMBDA EXPRESSIONS ARE TREATED LIKE NESTED BLOCKS

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
//
//        Collections.sort(employees, (employee1, employee2) ->
//                employee1.getName().compareTo(employee2.getName()));
//
//        for(Employee employee : employees) {
//            System.out.println(employee.getName());
//        }
//
////        Str ingStuff(new UpperConcat() {
////            @Override
////            public String upperAndConcat(String s1, String s2) {
////                return s1.toUpperCase() + s2.toUpperCase();
////            }
////        },
////        employees.get(0).getName(), employees.get(1).getName());
////        System.out.println(sillyString);

        UpperConcat uc = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

//        QUESTION this is so hard to understand!!!!!
        String sillyString = doStringStuff(new UpperConcat() {
                                               @Override
                                               public String upperAndConcat(String s1, String s2) {
                                                   return s1.toUpperCase() + s2.toUpperCase();
                                               }
                                           },
                employees.get(0).getName(), employees.get(1).getName());

        String sillyString2 = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());

        System.out.println("silly string2: " + sillyString2);
        System.out.println(uc); //QUESTION why this is not printed???
        System.out.println(sillyString2);

        //in the main mathod we create an instance of another class and call its method doSomething
        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println("another class: " + s);
        UpperConcat uc2 = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
        System.out.println(uc2);
        //end of the main method

    }

    //method accepts an object,that implements UpperConcat!!!!!!!!
    //and 2 strings that we want tp uppercase and concat
    //and it calls upperAndConcat method in interface to do a work
    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
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

//interface, contains method, that uppercases 2 strings and joins them
interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}



class AnotherClass {

    public String doSomething() {

        //variable outside of anonimous class, we shall make it final
        final int i = 0;
        //this example shows that if lambda has more than one statement, we have to use a RETURN keyword
        //it says to us that lambda expression is not a class
        //when  the code runs, an anonymous instance isnt created
        //instead the lambda is treated as a nested block of code and has the same scope as a nested block

//        UpperConcat uc = (s1, s2) -> {
//            System.out.println("The lambda expression's class is " + getClass().getSimpleName());
//            String result = s1.toUpperCase() + s2.toUpperCase();
//            return result;
//        };


        UpperConcat uc = new UpperConcat() {

            //below is an anonimous class if i understood correctly - but why? it looks like method!!!
            //if in an anonimous class we want to use a variable defined outside, we shall make it final - what is he talking here about?
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("i (withing anonimous class) = " + i);
                return s1.toUpperCase() + s2.toUpperCase();
            }
        };

        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
        // i++;
        System.out.println("i = " + i);
        return doStringStuff(uc, "String1", "String2");
    }
}







