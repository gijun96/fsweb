package a1020.ex_2;

@FunctionalInterface
interface JavaCoding {
    void nowCoding();
}


public class Ram10 {
//    매개변수가 없고, 리턴값이 없는 람다식
    public static void main(String[] args) {
        //객체 선언
        JavaCoding jc;

        //{} 실행코드 뒤에 세미콜론(;)을 붙여야한다
        jc = () -> {
            System.out.println("Rollin' Rollin' Rollin' Rollin'");
        };
        jc.nowCoding();

        // {} 실행코드가 1줄인경우 {} 생략가능
        jc = () -> System.out.println("Rollin' Rollin' Rollin' Rollin'");
        jc.nowCoding();

    }
}