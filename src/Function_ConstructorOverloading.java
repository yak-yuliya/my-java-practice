public class Function_ConstructorOverloading {

        private Function_ConstructorOverloading(Object o) {
            System.out.println("Object");
        }
        private Function_ConstructorOverloading(double[] d) {
            System.out.println("double array");
        }
        public static void main(String[] args) {
            new Function_ConstructorOverloading(null);
        }
    }

/* Solution:
The parameter passed to the constructor is the null
object reference and arrays are reference types too.
If we try running the program, we get following.
The program prints double array.

We can notice that the compiler doesn’t cause ambiguous
call error. Java’s overload resolution process operates
in two phases.
The first phase selects all the methods or constructors
that are accessible and applicable.
The second phase selects the most specific of the
methods or constructors selected in the first phase.
One method or constructor is less specific than another
if it can accept any parameters passed to the other.
In our program, both constructors are accessible and
applicable. The constructor GFG(Object) accepts any
parameter passed to GFG(double[]), so GFG(Object) is
less specific. (Every double array is an Object, but
not every Object is a double array.) */