package a1020.nestedClass.exam1;

public class Example {

    public static void main(String[] args) {
        // A객체 생성
        A a = new A();
        //B 객체 생성
        A.B b = a .new B();
    }
}
