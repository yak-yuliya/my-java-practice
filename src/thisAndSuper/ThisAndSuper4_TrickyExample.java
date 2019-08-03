package thisAndSuper;

public class ThisAndSuper4_TrickyExample {

    // Java program to illustrate
// the usage of this keyword

        int first = 11;
        int second = 22;
        static int third = 33;

        void garcia(int a, int b, int c) //instance variables
        {
            a = this.first; //the values of instance variables a and b are assigned to method´s local variables
            b = this.second;
            c = this.third;
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }

        void louis(int m, int n, int o)
        {
            this.first = m; //the values of local variables are assigned to instance variales a and b
            this.second = n;
            this.third = o;

            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println(m);
            System.out.println(n);
            System.out.println(o);
        }

        public static void main(String[] args)
        {
            new ThisAndSuper4_TrickyExample().garcia(100, 200, 300);
            new ThisAndSuper4_TrickyExample().louis(1000, 2000, 3000);

        }
    }
