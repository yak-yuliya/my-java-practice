public class LongValues {
    public static void main(String[] args) {
        //incorrect
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

        //correct
        final long MICROS_PER_DAY2 = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY2 = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY2 / MILLIS_PER_DAY2);
    }
}
/*Solution:

Both the divisor and the dividend are of type long, which is easily large enough to hold either product without overflow. It seems, then, that the program must print 1000. Unfortunately, it prints 5. What exactly is going on here? The problem is that the computation of the constant MICROS_PER_DAY does overflow. Although the result of the computation fits in a long with room to spare, it doesn’t fit in an int. The computation is performed entirely in int arithmetic, and only after the computation completes is the result promoted to a long. By then, it’s too late: The computation has already overflowed.
The promotion from int to long is a widening primitive conversion, which preserves the (incorrect) numerical value. This value is then divided by MILLIS_PER_DAY, which was computed correctly because it does fit in an int. The result of this division is 5. So why is the computation performed in int arithmetic? Because all the factors that are multiplied together are int values.
When you multiply two int values, you get another int value. Java does not have target typing, a language feature wherein the type of the variable in which a result is to be stored influences the type of the computation. It’s easy to fix the program by using a long literal in place of an int as the first factor in each product. This forces all subsequent computations in the expression to be done with long arithmetic. Although it is necessary to do this only in the expression for MICROS_PER_DAY, it is good form to do it in both products.
Similarly, it isn’t always necessary to use a long as the first value in a product, but it is good form to do so. Beginning both computations with long values makes it clear that they won’t overflow. This program prints 1000 as expected:*/