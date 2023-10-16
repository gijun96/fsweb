
package a1016.A1016_9;

public class CastingExample{
    public static void main(String[] args) {
        //인터페이스 변수 선언과 구현 객체 대입
        Vehicle vehicle =new Bus();

        // 인터페이스를 통해서 호츌
        vehicle.run();

        //강제 타입 변환 후 호출
        Bus bus =(Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
