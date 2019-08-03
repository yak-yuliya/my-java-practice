package immutableObjectsAndSynchronizesClass;

public class MainImmutableOrSynchronizes {

    public static void main(String[] args) {
        SynchronizedRGB color =
                new SynchronizedRGB(0, 0, 0, "Pitch Black");

        //SynchronizedRGB must be used carefully to avoid being seen in an inconsistent state. Suppose, for example, a thread executes the following code:
        //If another thread invokes color.set after Statement 1 but before Statement 2, the value of myColorInt won't match the value of myColorName. To avoid this outcome, the two statements must be bound together:
        //This kind of inconsistency is only possible for mutable objects — it will not be an issue for the immutable version of SynchronizedRGB.
        int myColorInt = color.getRGB();      //Statement 1
        color.set(10, 10, 10, "Some Color");
        String myColorName = color.getName(); //Statement 2

        System.out.println(myColorInt + " " + myColorName);




        SynchronizedRGB color2 =
                new SynchronizedRGB(0, 0, 0, "Pitch Black");

        synchronized (color2) {
            int myColorInt2 = color2.getRGB();
            String myColorName2 = color2.getName();
            System.out.println(myColorInt2 + " " + myColorName2);
        }

/*Synchronization
Threads communicate primarily by sharing access to fields and the objects reference fields refer to. This form of communication is extremely efficient, but makes two kinds of errors possible: thread interference and memory consistency errors. The tool needed to prevent these errors is synchronization.

However, synchronization can introduce thread contention, which occurs when two or more threads try to access the same resource simultaneously and cause the Java runtime to execute one or more threads more slowly, or even suspend their execution. Starvation and livelock are forms of thread contention. See the section Liveness for more information.*/

    }
}
