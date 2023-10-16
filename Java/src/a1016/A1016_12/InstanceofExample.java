package a1016.A1016_12;


import a1016.A1016_11.Vehicle;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus =new Bus();

        //ride() 호출 시 구현 객체를 매개값으로 전달
        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride(Vehicle vehicle){
        if(vehicle instanceof Bus){
            Bus bus = (Bus)vehicle;
            bus.chekFare();
        }
        vehicle.run();
    }
}
