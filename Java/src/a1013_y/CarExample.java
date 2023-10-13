package a1013_y;

public class CarExample {
    public static void main(String[] args) {
        //객체 생성
        Car mycar = new Car();

        //잘못된 속도 변경
        mycar.setSpeed(-50);
        System.out.println("현재 속도 : "+ mycar.getSpeed());

        // 올바른 속도 변경
        mycar.setSpeed(60);
        System.out.println("현재 속도 : "+ mycar.getSpeed());

        // 멈춤
        if(!mycar.isStop()){
            mycar.setStop(true);
        }
        System.out.println("현재 속도 : "+mycar.getSpeed());
    }
}
