package a1020.anonymous;

interface Greeting{
    void greet();
}
public class main {
    public static void main(String[] args) {
        // 익명 클래스를 사용하여 Greeting 인터페이스의 구현체를 생성
        Greeting lambdaGreeting = ()->{
            System.out.println("익명객체로 생성된개체입니다. 람다식 적용");
        };
//        익명 클래스로 생성된 객체의 메서드 호출
        lambdaGreeting.greet();
    }
}
