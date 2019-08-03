import java.util.Arrays;

/*String class doesn’t have any method that directly sort a string, but we can sort a string by applying other methods one after other.

        Method pack1(natural sorting) :

        Apply toCharArray() method on input string to create a char array for input string.
        Use Arrays.sort(char c[]) method to sort char array.
        Use String class constructor to create a sorted string from char array.
        Note : As we know that String is immutable in java, hence in third step we have to create a new string.

        Sort a String alphabetically */

public class SortString1 {
        // Method to sort a string alphabetically
        public static String sortString(String inputString)
        {
            // convert input string to char array
            char tempArray[] = inputString.toCharArray();

            // sort tempArray
            Arrays.sort(tempArray);

            // return new sorted string
            return new String(tempArray);
        }

        // Driver method
        public static void main(String[] args)
        {
            String inputString = "geeksforgeeks";
            String outputString = sortString(inputString);

            System.out.println("Input String : " + inputString);
            System.out.println("Output String : " + outputString);
        }
    }
