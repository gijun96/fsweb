package a1013.Phone;

public class Phone {
    // 필드 선언
    String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    //메소드 선언
    void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }

}
