package A1010.sec05.exam06;

public class CarExample {

    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar =new Car();

        myCar.setGas(5);

        if (myCar.isLeftGas()){
            System.out.println("출발합니다.");

            myCar.run();
        }
        System.out.println("gas를 주입하세요.");
    }
}
