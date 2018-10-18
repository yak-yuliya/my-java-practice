package bindings_static_dynamic;

/** Static Binding: The binding which can be resolved at compile time by compiler
 * is known as static or early binding. Binding of all the static,
 * private and final methods is done at compile-time .

   Why binding of static, final and private methods is always a static binding?
   Static binding is better performance wise (no extra overhead is required).
 Compiler knows that all such methods cannot be overridden and will always be accessed
 by object of local class. Hence compiler doesn’t have any difficulty
 to determine object of class (local class for sure).
 That’s the reason binding for such methods is static.
*/

public class NewClass_static_binding {
        public static class superclass
        {
            static void print()
            {
                System.out.println("print in superclass.");
            }
        }
        public static class subclass extends superclass
        {
            static void print()
            {
                System.out.println("print in subclass.");
            }
        }

        public static void main(String[] args)
        {
            superclass A = new superclass();
            superclass B = new subclass();
            A.print();
            B.print();
        }
    }

    //print in superclass.
    //print in superclass.

    /** We have created one object of subclass and one object of superclass with the reference of the superclass.
     Since the print method of superclass is static,
     compiler knows that it will not be overridden in subclasses
     and hence compiler knows during compile time which print method
     to call and hence no ambiguity. */
