package a1012.airplane;

public class SupersonicAirPlaneExample{
    public static void main(String[] args) {
        SupersonicAirPlane sa =new SupersonicAirPlane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirPlane.SUPERSONIC;
        sa.fly();
        sa.flyMode =SupersonicAirPlane.NOMAL;
        sa.fly();
        sa.land();
    }
}
