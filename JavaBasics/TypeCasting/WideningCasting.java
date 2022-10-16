/**
 * Widening Casting (automatically) - converting a smaller type to a larger type size
 * byte -> short -> char -> int -> long -> float -> double
 */


public class WideningCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDoubleTwo = myInt;

        System.out.println(myInt);
        System.out.println((double) myInt);
        System.out.println(myDoubleTwo);

    }
}
