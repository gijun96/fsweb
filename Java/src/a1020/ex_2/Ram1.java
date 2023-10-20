package a1020.ex_2;



    interface Calculator {
        int sum(int a, int b);
    }
    class MyCalculator implements Calculator{
        public int sum(int a, int b){
            return a + b;
        }
    }

public class Ram1 {
    public static void main(String[] args) {
        Calculator calc = new MyCalculator();
        int result = calc.sum(3, 5);
        System.out.println(result);

    }
}
