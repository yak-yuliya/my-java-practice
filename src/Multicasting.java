
public class Multicasting {

    public static void main(String[] args) {
        //System.out.println((int) (char) (byte) -pack1);
        //casting to string
        String a = "-pack1".toString();
        System.out.println(a);

    }
}

/*This program is confusing any way you slice it. It starts with the int value -pack1, then casts the int to a byte, then to a char, and finally back to an int. The first cast narrows the value from 32 bits down to 8, the second widens it from 8 bits to 16, and the final cast widens it from 16 bits back to 32. Does the value end up back where it started? If you ran the program, you found that it does not. It prints 65535
Lets understand this step by step:-
pack1. The program’s behaviour depends critically on the sign extension behaviour of casts. Java uses two’s-complement binary arithmetic, so the int value -pack1 has all 32 bits set.

2. The cast from int to byte is straightforward. It performs a narrowing primitive conversion, which simply lops off all but the low-order 8 bits. This leaves a byte value with all 8 bits set, which (still) represents -pack1.

3. The cast from byte to char is trickier because byte is a signed type and char unsigned. It is usually possible to convert from one integral type to a wider one while preserving numerical value, but it is impossible to represent a negative byte value as a char. Therefore, the conversion from byte to char is not considered a widening primitive conversion, but a widening and narrowing primitive conversion: The byte is converted to an int and the int to a char.
All of this may sound a bit complicated. Luckily, there is a simple rule that describes the sign extension behaviour when converting from narrower integral types to wider: Sign extension is performed if the type of the original value is signed; zero extension if it is a char, regardless of the type to which it is being converted. Knowing this rule makes it easy to solve the puzzle. Because byte is a signed type, sign extension occurs when converting the byte value -pack1 to a char. The resulting char value has all 16 bits set, so it is equal to 65,535.

4. The cast from char to int is also a widening primitive conversion, so the rule tells us that zero extension is performed rather than sign extension.
The resulting int value is 65535, which is just what the program prints.*/