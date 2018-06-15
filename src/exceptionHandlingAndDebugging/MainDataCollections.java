package exceptionHandlingAndDebugging;

public class MainDataCollections {

    public static void main(String[] args) {
        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();
        try {

            if (chars.length <10) {
                throw (new Exception("My custom message!"));
            }
            char lastChar = chars[chars.length-1];
            System.out.println(lastChar);

            String sub = welcome.substring(10);

        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Array Index problem!");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("String Index problem!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        String welcome2 = "Welcome!";
        char[] chars2 = welcome2.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            System.out.println(chars2[i]);
        }
    }
}
