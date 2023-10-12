package a1012.A1012_2;

public class SmartPhoneExample{

    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone myPhone =new SmartPhone("갤럭시", "은색");
        //Phone으로 부터 상속받은 필드 읽기
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : "+ myPhone.color);
    }
}
