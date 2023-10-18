package a1018.Generic.ex1;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent(){
        return new Home();
    }

}
