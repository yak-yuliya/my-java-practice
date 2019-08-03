import java.util.*;

public class MainList {

    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN.
            Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter elements");
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }
        scanner.nextLine();
        System.out.println("enter amount of querries elements");
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {

            String action = scanner.next();
            if (action.equals("Insert")) {
                System.out.println("enter index, enter value");
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else //if (action.equals("Delete"))
            {
                System.out.println("enter index for deletion");
                int index2 = scanner.nextInt();
                list.remove(index2);
            }

        }
//        String action = scanner.nextLine();


        scanner.close();

//        System.out.println(list);
        for (Integer num : list) {
            System.out.print(num + " ");  // not   !!!!!!   System.out.printLN(num + " ");
        }
    }
}


//    Sample Input
//
//          5
//        12 0 pack1 78 12
//        2
//        Insert
//        5 23
//        Delete
//        0
//        Sample Output
//
//        0 pack1 78 12 23

//    Input Format
//
//    The first line contains an integer,  (the initial number of elements in ).
//        The second line contains  space-separated integers describing .
//        The third line contains an integer,  (the number of queries).
//        The  subsequent lines describe the queries, and each query is described over two lines:
//
//        If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
//        If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .