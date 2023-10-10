package A1010.sec05.exam05;

public class CarExample {
    public static void main(String[] args) {


        Car car1 = new Car("자가용");
        System.out.println("car2.company: " +car1.company);
        System.out.println("car2.model : " + car1.model );
        System.out.println("car.color : " + car1.color);
        System.out.println("car.maxSpeed : " +car1.maxSpeed);

        Car car2 = new Car("자가용", "빨강");
        System.out.println("car.company : " + car2.company);
        System.out.println("car.model : " + car2.model);
        System.out.println("car.color : " + car2.color);
        System.out.println("car.maxSpeed : " +car2.maxSpeed);

        Car car3 =new Car("택시", "검정", 200);
        System.out.println("car.company : " + car3.company);
        System.out.println("car.model : " + car3.model);
        System.out.println("car.color : " + car3.color);
        System.out.println("car.maxSpeed : " +car3.maxSpeed);

    }

}
