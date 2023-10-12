package a1012.airplane;

public class SupersonicAirPlane extends AirPlane {
//상수 선언
    public static final int NOMAL = 1;
    public static final  int SUPERSONIC = 2;
    // 상태 필드 선언
    public int flyMode = NOMAL;

    //메소드 재정의
    @Override
    public void fly(){
        if (flyMode ==SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        }else{
            super.fly();
        }
    }

}
