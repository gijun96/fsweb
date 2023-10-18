package a1018.Generic.ex1;

public class GenericExample {
    public static void main(String[] args) {
//        Product<Tv, String> product1 = new Product<>();
//
//        //Setter 매개값은 반드시 Tv와 String을 제공
//        product1.setKind(new Tv());
//        product1.setModel("스마트Tv");
//
//        // Getter 리턴값은 Tv와 String이 된다.
//        Tv tv= product1.getKind();
//        String tvModel = product1.getModel();
//
//        Product<Car, String> product2 = new Product<>();
//
//        product2.setKind(new Car());
//        product2.setModel("SUV자동차");
//
//        Car car = product2.getKind();
//        String carModel = product2.getModel();
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();


    }
}
