public class StringComparison {

    public static void StringComparisonNotTheBest(String str1, String str2) {
//        String str1 = "Hello";
//        String str2= "Hello";

        if (str1 == str2) {
            System.out.println("They match!");
        } else {
            System.out.println("They don´t match!");
        }
    }

    public static void StringComparisonBetter(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don´t match!");
        }
    }

    public static void ParsingStrings(String str1, String str2) {
        System.out.println("Length of string: " + str1.length());
        System.out.println(str1.contains(str2));
    }

    public static void IndexOf(String str6, String str1) {
        int position = str6.indexOf(str1);
        System.out.println("Position of substring: " + position);
    }

    public static void Substring(String str1, int substringStartsFromPosition){
        String substring = str1.substring(substringStartsFromPosition);
        System.out.println("Beginning of a substring: " + substring);
    }

    public static void Trim(String str1){
        System.out.println(str1.trim());
    }



}
