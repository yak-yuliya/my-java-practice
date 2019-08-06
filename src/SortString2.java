import java.util.Arrays;
import java.util.Comparator;

/*
Sort a mixed string(containing uppercase and lowercase characters) :

Method 2(custom sorting):

Arrays.sort(char c[]) method sort characters based on their ASCII value, we can define our custom Comparator to sort a string.

Convert input string to Character array. There is no direct method to do it. We will use for loop to fill the array.
Use Arrays.sort(T [ ], Comparator c) method to sort Character array. For this, we must have to implement compare() method based on our custom sorting behavior.
Now we can use StringBuilder to convert Character array to String.
Sort a mixed string(containing uppercase and lowercase characters) :*/

public class SortString2
{
    // Method to sort a mixed string
    public static String sortString(String inputString)
    {
        // convert input string to Character array
        Character tempArray[] = new Character[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            tempArray[i] = inputString.charAt(i);
        }


        // Sort, ignoring case during sorting
        Arrays.sort(tempArray, new Comparator<Character>(){

            @Override
            public int compare(Character c1, Character c2)
            {
                // ignoring case
                return Character.compare(Character.toLowerCase(c1),
                        Character.toLowerCase(c2));
            }
        });

        // using StringBuilder to convert Character array to String
        StringBuilder sb = new StringBuilder(tempArray.length);
        for (Character c : tempArray)
            sb.append(c.charValue());

        return sb.toString();
    }

    // Driver method
    public static void main(String[] args)
    {
        String inputString = "GeeksforGeeks";
        String outputString = sortString(inputString);

        System.out.println("Input String : " + inputString);
        System.out.println("Output String : " + outputString);
    }

}