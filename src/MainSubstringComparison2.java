import java.util.Scanner;

public class MainSubstringComparison2 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String outmin = "",outmax = "";
        int k = in.nextInt();
        for(int i=0;i<s.length()-k+1;i++){
            String w = "";
            for(int j=i;j<i+k;j++)
                w+=s.charAt(j); //The String object's charAt() method returns a new string consisting of the single UTF-16 code unit located at the specified offset into the string.
            if(i==0){                   //what does it mean?!!!!!!
                outmin=w;outmax=w;      //what does it mean?!!!!
            }
            else{
                if(w.compareTo(outmin)<0)
                    outmin=w;
                if(w.compareTo(outmax)>0)
                    outmax=w;
            }

        }
        System.out.println(outmin);
        System.out.println(outmax);
    }
}
