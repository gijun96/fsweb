package a1013.abs;

// 추상 클래스
abstract class Shape{
    // 추상 메소드 (하위 클래스에서 구현해야함)
    public abstract double getArea();
}

// Shape 추상 클래스를 상속받는 구체 클래스(하위 클래스)
class Circle extends Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
class Ractanle extends Shape{
    private int width;
    private int height;

    public Ractanle(int wh){
        this.width =wh;
        this.height =wh;
    }
    public Ractanle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.printf("원의 넓이 : %.2f\n",circle.getArea());
        Ractanle ractanle1 =new Ractanle(4);
        System.out.printf("정사각형의 넓이 : %.0f\n", ractanle1.getArea());
        Ractanle ractanle2 =new Ractanle(3, 4);
        System.out.printf("사각형의 넓이 : %.0f\n", ractanle2.getArea());
    }
}
