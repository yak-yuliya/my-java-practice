package lambda.l114_ScopeAndFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class Main114ScopeAndFunctionalProgramming {

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


        //!!!!!!lets add a lambda in an enhances for loop in a main method

        //effectively final means - it must be declared final or its value must never be changed

        //pack1. this is enhances for loop, it works
        //enhanced for loop
        //each time it runs, it gives different result, because a thread might run at a different times
        //so one time John will be printed first, another time - second, etc.
        //here employee is final, because every time it runs for, the local variable is created
        //it means that the variable is effectively final for each iteration
        //on each iteration a new employee is created and its result is effectively final:
        //assigned once and never changes

        System.out.println("pack1******************");

        for (Employee employee : employees) {
            System.out.println(employee.getName());
            // for every employee we will start a thread which prints the age
            new Thread(() -> System.out.println(employee.getAge())).start();
        }

        System.out.println("2******************");


        //2.
        for (int i = 0; i < employees.size(); i++) {
            Employee employee;
            employee = employees.get(i);
            System.out.println(employee.getName());
            new Thread(() -> System.out.println(employee.getAge())).start();
        }

        System.out.println("3******************");

        //3.
        for (Employee employee : employees) {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
            new Thread(() -> System.out.println(employee.getAge())).start();
        }

        System.out.println("4******************");

        //4.
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

    }



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

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {

    public String doSomething() {
        int i = 0;
//what about lamda variables, which we define inside of lambda expression?


        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression's class is " + getClass().getSimpleName());
            System.out.println("i in the lambda expression = " + i);
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        //can we use s1 and s2 outside of lambda, outside of closing block? no, intelliJ will complain
        //s1 = "Hello!";

        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
        return Main114ScopeAndFunctionalProgramming.doStringStuff(uc, "String1", "String2");

    }

    //in this code we are using a lambda for runnable
    public void printValue() {

        int number = 25;
        //no parameters
        //when the code runs, the code will sleep for 5 seconds, then it will print number value.
        //when the thread is sleeping, the Print value method will continue to execute and will exit
        //and that mean by the time the thread needs to put a number,
        //the local variable will no longer exist
        //so what will the thread print?


        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is " + number);
        }; //semicolon to complete a code block

        new Thread(r).start();
    }
}

// There are two ways to create a new thread of execution.
// One is to declare a class to be a subclass of Thread.
// This subclass should override the run method of class Thread.
// An instance of the subclass can then be allocated and started.
// For example, a thread that computes primes larger than a stated value could be written as follows:
//
//class PrimeThread extends Thread {
//    long minPrime;
//    PrimeThread(long minPrime) {
//        this.minPrime = minPrime;
//    }
//
//    public void run() {
//        // compute primes larger than minPrime
//              . . .
//    }
//}
//    The following code would then create a thread and start it running:
//
//        PrimeThread p = new PrimeThread(143);
//        p.start();
//        Суть в том, что мы переопределяем метод run класса Thread, который вызывается из метода start класса Thread, который мы и вызываем для запуска потока (исполнения нашей программы в новом потоке).
//
// The other way to create a thread is to declare a class that implements the Runnable interface.
// That class then implements the run method.
// An instance of the class can then be allocated,
// passed as an argument when creating Thread, and started.
// The same example in this other style looks like the following:
//
//class PrimeRun implements Runnable {
//    long minPrime;
//    PrimeRun(long minPrime) {
//        this.minPrime = minPrime;
//    }
//
//    public void run() {
//        // compute primes larger than minPrime
//              . . .
//    }
//}
//    The following code would then create a thread and start it running:
//
//        PrimeRun p = new PrimeRun(143);
//        new Thread(p).start();


//
//Runnable - это интерфейс описывающий метод Run,
// с помощью которого Вы можете передать в другой класс свой код для выполнения.
// И он никак не связан с Thread, в том смысле,
// что он не несёт никакой скрытой функциональности.
// Для выполнения какого-то кода в потоке класс Thread
// просто использует этот интерфейс как уровень абстракции.
// Ничего не мешает Вам использовать Runnable любым другим способом.
// Например, для передачи коллбека.
//
//Thread - это класс, который реализует поток и использует интерфейс Runnable для встраивания Вашего кода в поток.
//
