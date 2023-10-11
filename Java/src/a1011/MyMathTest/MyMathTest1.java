package a1011.MyMathTest;

public class MyMathTest1 {
    public static void main(String[] args) {
        MyMathT mm = new MyMathT();
        System.out.println(mm.max(2, 3));
        System.out.println(mm.min(5, 7));
        
    }
}
class MyMathT{
    double max(double a, double b){
        return (a > b)? a: b;
    }
    double min(double a, double b){
        return (a < b)? a: b;
    }
}
