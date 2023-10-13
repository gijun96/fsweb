package a1013.Driver;

public class Taxi extends Vehicle{
    // 메소드 선언(오버라이딩)
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }
}
