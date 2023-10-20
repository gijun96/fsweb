package a1020.ex_2;




public class Ram3 {
    public static void main(String[] args) {
//        Calculator calc = (a, b) -> a + b;
//        Calculator calc = Integer.sum(int a, int b);
        Calculator calc = Integer::sum;
        int result = calc.sum(3, 4);
        System.out.println(result);
    }
}
