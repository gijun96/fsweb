package a1016.Object1;

public class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;


    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    Car(){
        this("아반떼",2016,  "흰색", 200);
    }
    public String getModel() {
        return this.modelYear+"년식"+ this.modelName+" "+this.color;
    }

    @Override
    public String toString() {
        return this.modelYear+"년식 "+ this.modelName+" "+this.color +" 최고속력 : "+ this.maxSpeed+"km/h";
    }
}