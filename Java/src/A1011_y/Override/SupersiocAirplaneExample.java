package A1011_y.Override;

public class SupersiocAirplaneExample{
    public static void main(String[] args) {
        SupersiocAirplane sa = new SupersiocAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersiocAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersiocAirplane.NORMAL;
        sa.fly();
        sa.land();
    }


}
