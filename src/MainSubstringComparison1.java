import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class MainSubstringComparison1 {

    public static String getSmallestAndLargestCompareTo(String s, int k) {
        String substring = s.substring(0, k);
        String smallest = substring;
        String largest = substring;

        for (int i = 1; i <= s.length() - k; i++) {
            // Create a substring of length 'k'
            substring = s.substring(i, i + k);

            // If current substring is lexicographically smaller than 'smallest'
            if (substring.compareTo(smallest) < 0) { //The method compareTo() is used for comparing two strings lexicographically. Each character of both the strings is converted into a Unicode value for comparison. If both the strings are equal then this method returns 0 else it returns positive or negative value. The result is positive if the first string is lexicographically greater than the second string else the result would be negative.
                smallest = substring;
            }

            // If current substring is lexicographically larger than 'largest'
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }
    //@inferred annotation - предполагаемый; прогнозный;

    public static String getSmallestAndLargestList(String s, int k) {
        Vector<String> substrings = new Vector<String>(); //The Vector class implements a growable array of objects.
        // Like an array, it contains components that can be accessed using an integer index.
        // However, the size of a Vector can grow or shrink as needed to accommodate adding and removing items
        // after the Vector has been created.

        for (int i = 0; i <= s.length() - k; i++) {
            // Add a substring of length 'k' to our list
            substrings.add( s.substring(i, i + k) );
        }

        // Sort list
        Collections.sort(substrings);

        // Set first and last elements as smallest and largest
        String smallest = substrings.get(0);
        String largest = substrings.get(substrings.size() - 1);

        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargestArray(String s, int k) {
        // Because each substring has length 'k', we know the number of possible substrings
        String[] substrings = new String[s.length() - k + 1];

        for (int i = 0; i <= s.length() - k; i++) {
            // Add a substring of length 'k' to our array
            substrings[i] =  s.substring(i, i + k);
        }

        // Sort array
        Arrays.sort(substrings);

        // Set first and last elements as smallest and largest
        String smallest = substrings[0];
        String largest = substrings[substrings.length - 1];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargestCompareTo(s, k));
        System.out.println(getSmallestAndLargestList(s, k));
        System.out.println(getSmallestAndLargestArray(s, k));
    }

}


//    We define the following terms:
//
//        Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
//        For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
//
//        A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
//        Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
//
//        Input Format
//
//        The first line contains a string denoting .
//        The second line contains an integer denoting .
//
//        Constraints
//
//        consists of English alphabetic letters only (i.e., [a-zA-Z]).
//        Output Format
//
//        Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
//
//        Sample Input 0
//
//        welcometojava
//        3
//        Sample Output 0
//
//        ava
//        wel
//        Explanation 0
//
//        String  has the following lexicographically-ordered substrings of length :
//
//        We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
//
//        The stub code in the editor then prints ava as our first line of output and wel as our second line of output.