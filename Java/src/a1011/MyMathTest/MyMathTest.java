package a1011.MyMathTest;


public class MyMathTest {
    public static void main(String[] args) {
        System.out.println(MyMath.max(1, 2));
        System.out.println(MyMath.min(5, 3));
    }
}

class MyMath{
    static double max(double a, double b){
        return (a > b)? a : b;
    }
    static double min(double a, double b){
        return (a < b)? a : b;
    }

}
