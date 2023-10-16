package a1016.Object1;

public class Object1 {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 =new Car();

        System.out.println(car01.toString());
        System.out.println(car02.toString());
        System.out.println(car01.toString().equals(car02.toString()));
    }
}
