package a1020.math;

@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}
public class MathRam8 {
    public static void main(String[] args) {
        MathOperation add = (a, b)-> a + b;
        MathOperation subtract = (a, b)-> a - b;

        int result1 = add.operate(5, 3);
        int result2 = subtract.operate(5, 3);

        System.out.println("Addition Result : "+ result1);
        System.out.println("Subtraction : "+ result2);
    }
}
