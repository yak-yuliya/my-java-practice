package lambda.comparator;

import java.util.*;

public class mainComparator {

        public static void main(String args[]){

            List<String> strings = new ArrayList<String>();
            strings.add("AAA");
            strings.add("bbb");
            strings.add("CCC");
            strings.add("ddd");
            strings.add("EEE");

            Collections.sort(strings);
            System.out.println("Simple sort");

            // Traverse with for:each
            for(String str: strings){
                System.out.println(str);
            }

            Comparator<String> comp = (str1, str2) ->
            {
                return str1.compareToIgnoreCase(str2);
            };
            Collections.sort(strings, comp);

            System.out.println("Sort with comparator");

            //Traverse with iterator
            Iterator<String> i = strings.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }

        }
    }

