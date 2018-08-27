import java.util.Scanner;

public class MainStringTokens_RegularExpressions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();
        String[] tokens = input.split("[^\\p{Alpha}]+");

        //http://www.vogella.com/tutorials/JavaRegularExpressions/article.html

        //A regular expression defines a search pattern for strings.
        // The abbreviation for regular expression is regex.
        // The search pattern can be anything from a simple character,
        // a fixed string or a complex expression containing special
        // characters describing the pattern. The pattern defined by
        // the regex may match one or several times or not at all for a given string.

        int size = (input.isEmpty()) ? 0 : tokens.length; //minVal = (a < b) ? a : b;
        System.out.println(size);

        for(String s : tokens) {
            System.out.println(s);
        }
    }
}

//    This challenge requires three basic steps:
//
//        Read the string sentence, . Replace non-alphabetic characters with whitespace and trim any leading/trailing whitespace.
//        Tokenize , splitting it into some number of components.
// Observe that simply splitting the string on spaces and punctuation will leave you with empty strings
// in situations where there are no letters between two non-letters.
// We are getting around this by replacing the non-alphabetic characters,
// trimming the string, and then splitting the string on whitespace like so: s.split("\\p{Space}+");
//        The second  at the end of the RegEx accounts for situations
// where you may have more than one consecutive non-alphabetic character
// that would otherwise split around an empty string token.
//        Print the number of tokens, followed by each (ordered) token in .
//        You will not pass some of the test cases without trimming string .
//
//        Still a little confused about tokens and regular expressions?
// Check out Oracle's Pattern documentation.



//    Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
//
//        Note: You may find the String.split method helpful in completing this challenge.

//    On the first line, print an integer, , denoting the number of tokens in string
//  (they do not need to be unique).
// Next, print each of the  tokens on a new line in the same order as they appear in input string .