package a1012.A1012_2;

public class SmartPhone extends Phone {
    //필드 선언


    //생성자 선언
    public SmartPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color)생성자 실행됨.)");
    }
}