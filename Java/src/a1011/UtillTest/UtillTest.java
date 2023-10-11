package a1011.UtillTest;

public class UtillTest {
    public static void main(String[] args) {
        Utill.m1();
        Utill utill =new Utill();
        utill.m2();;
    }
}

class Utill{
    static void m1(){
        System.out.println("클래스 매소드 m1()가 호출되었습니다.");
    }
     void m2(){
         System.out.println("클래스 메소드 m2()가 호출되었습니다.");
     }
}
