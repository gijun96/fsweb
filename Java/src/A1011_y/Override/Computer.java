package A1011_y.Override;

public class Computer extends Calculator{
    //메소드 오버 라이딩
    @Override
    public double areaCircle(double r){
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI *r *r;
    }
}
