
// x != y
public class Float {
    public static void main(String[] args) {
        double x = 1.0 / 10; // 0.1
        double y = 1 - 9.0 / 10; // 0.09999999999999998
        double z = 9.0 / 10; // 0.9

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        compareTwoFloat(1.0 / 10, 1 - 9.0 / 10);

    }

//    compare two float type
    public static void compareTwoFloat(double x, double y){
        double r = Math.abs(x-y);
        if (r < 0.0001){
            System.out.println("x is equal to y");
        }else{
            System.out.println("x is not equal to y");
        }

    }

}
