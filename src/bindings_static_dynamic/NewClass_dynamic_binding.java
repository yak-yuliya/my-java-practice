package bindings_static_dynamic;

/** Dynamic Binding: In Dynamic binding compiler doesn’t decide the method to be called.
 * Overriding is a perfect example of dynamic binding.
 * In overriding both parent and child classes have same method .
 * Let’s see by an example
 * */

public class NewClass_dynamic_binding
{
    public static class superclass
    {
        void print()
        {
            System.out.println("print in superclass.");
        }
    }

    public static class subclass extends superclass
    {
        @Override
        void print()
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

   // print in superclass.
   // print in subclass.