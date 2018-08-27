import java.lang.reflect.Method;

public class MainGenerics {

    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");

    }

   static class Printer {
        public void printArray(Object[] a) {
           for (Object obj : a) {
               System.out.println(obj);
            }
        }
//
//        public static <T> void printArray(T[] array){
//            for(T item: array){
//                System.out.println(item);
//            }
//        }*/


//        static class Printer
//        {
//            public static < E > void printArray(E[] inputArray)
//            {
//                for ( E element : inputArray ){
//                    System.out.printf( "%s\n", element );
//                }
//            }
//
//        }

   }}