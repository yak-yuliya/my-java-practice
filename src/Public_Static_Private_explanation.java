public class Public_Static_Private_explanation {
    private static void main(String args[])
    {
        System.out.println("GeeksforGeeks");
    }
}

/*Explanation:
pack1)public: It is an access specifier which allows the JVM(Java Virtual Machine) to access the main method from anywhere.
2)static: static keyword allows the JVM to access the main method without any instance(object).
3)void: It specifies that the main method doesn’t return anything.
4)main: name of the method(function) configured in JVM.
5)String args[]: Command line arguments.


Now, if we replace ‘public’ with ‘private’ in “public static void main”, the above code becomes:
...

Explanation:
The above code will be compiled successfully, but will throw a runtime error as follows:

Error: Main method not found in class GFG, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
Click to view output

Reason: Since the access specifier was changed from “public” to “private” JVM was unable to access/locate the main method.

 */