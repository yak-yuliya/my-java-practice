import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainSubstringComparison5_changed {

    public static String[] getSmallestAndLargest(String s, int k) {
        String[] substrings = new String[s.length() - k + 1];

        for (int i = 0; i <= s.length() - k; i++) {
            // Add a substring of length 'k' to our array
            substrings[i] = s.substring(i, i + k);
        }

        // Sort array
        Arrays.sort(substrings);

        // Set first and last elements as smallest and largest
        String smallest = substrings[0];
        String largest = substrings[substrings.length - 1];

        for (int i = 0; i <= s.length() - k; i++) {
            // Add a substring of length 'k' to our array
            substrings[i] = s.substring(i, i + k);
            System.out.println(substrings[i]);
        }

        return substrings;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
        System.out.println("----------");

        List<String> lines = Arrays.asList(getSmallestAndLargest(s, k));
        List<String> result = getFilterOutput(lines, "123");
        for (String temp : result) {
            System.out.println("filtered output");
            System.out.println(temp);    //output : spring, node
        }

    }


    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"123".equals(line)) { // we dont like 123
                result.add(line);
            }
        }
        return result;
    }
}

