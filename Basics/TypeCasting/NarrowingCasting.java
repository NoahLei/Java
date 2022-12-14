/**
 * Narrowing Casting (manually) - converting a larger type to a smaller size type
 * double -> float -> long -> int -> char -> short -> byte
 */

public class NarrowingCasting {
    public static void main(String[] args){
        double myDouble = 9.78d;
        int myInt = (int)myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);
    }
}
