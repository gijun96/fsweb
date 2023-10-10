package A1010.sec05.exam02;

public class CarExampel {
    public static void main(String[] args) {
        //Car 객체 생성
        Car mycar = new Car();

        // Car 객체의 필드값 읽기
        System.out.println("제작회사 : " + mycar.company);
        System.out.println("모델명 : " + mycar.model);
        System.out.println("색상 : " + mycar.color);
        System.out.println("최고 속도 : " + mycar.maxSpeed);
        System.out.println("현재 속도 : " + mycar.speed);
        //Car 객체의 필드값 변경
        mycar.speed =60;
        System.out.println("수정된 속도 : " + mycar.speed );
    }
}
