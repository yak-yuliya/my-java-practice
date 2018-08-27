import java.util.Scanner;

public class MainIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        Given an integer, , perform the following conditional actions:
//        If  is odd, print Weird
//        If  is even and in the inclusive range of 2 to 5, print Not Weird
//        If  is even and in the inclusive range of 6 to 20, print Weird
//        If  is even and greater than 20, print Not Weird

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String ans;
        if(N%2==1 || (N>=6 && N <= 20)){
            ans = "Weird";
        }else{
            ans = "Not Weird";
        }
        System.out.println(ans);
        scanner.close();


    }
}
