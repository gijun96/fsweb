package a1018.Generic.ex1;

public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent(){
        return new Car();
    }

}
