package A1010.sec05.exam04;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car car1 = new Car();
        System.out.println("car1.company :" + car1.company);
        System.out.println();

        Car car2 = new Car("자가용");
        System.out.println("car2.company: " +car2.company);
        System.out.println("car2.model : " + car2.model );

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car.company : " + car3.company);
        System.out.println("car.model : " + car3.model);
        System.out.println("car.color : " + car3.color);

        Car car4 =new Car("택시", "color", 200);
        System.out.println("car.company : " + car4.company);
        System.out.println("car.model : " + car4.model);
        System.out.println("car.color : " + car4.color);
        System.out.println("car.maxSpeed : " +car4.maxSpeed);

    }

}
