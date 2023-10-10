package A1010.sec05.exam03;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar = new Car("그랜져", "검정", 160);
        Car myCar1 = new Car("K5", "sliver", 150);

        // Car 객체의 필드값 읽기
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색상 : " + myCar.color);
        System.out.println("최고 속도 : " + myCar.maxSpeed);

        System.out.println("모델명 : " + myCar1.model);
        System.out.println("색상 : " + myCar1.color);
        System.out.println("최고 속도 : " + myCar1.maxSpeed);
    }
}
