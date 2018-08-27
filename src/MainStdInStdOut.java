import java.util.Scanner;

public class MainStdInStdOut {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble(); //Double: 3.1415
        scanner.nextLine(); //this will print whole string and not just first word //This method returns the rest of the current line, excluding any line separator at the end.
        String myString = scanner.nextLine();
        String myString2 = scanner.next();
        scanner.close();

        System.out.println("myInt is: " + myInt);
        System.out.println("myDouble is: " + myDouble);
        System.out.println("myString is: " + myString);
        System.out.println("myString2 is: " + myString2);

    }
}
