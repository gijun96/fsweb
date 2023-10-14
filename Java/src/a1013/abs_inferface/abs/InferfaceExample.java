package a1013.abs_inferface.abs;

// 추상 클래스
interface Shape{
    // 추상 메소드 (하위 클래스에서 구현해야함)
    public abstract double getArea();
    void display();
}
    class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius =radius;
    }

    @Override
    public double getArea() {
        return radius *radius *Math.PI;
    }
    @Override
    public void display() {
    System.out.println("원의 면적 : " + getArea());
    }


}

public class InferfaceExample {
    public static void main(String[] args) {
    Circle circle =new Circle(5.0);
        circle.getArea();
        circle.display();

    }
}
