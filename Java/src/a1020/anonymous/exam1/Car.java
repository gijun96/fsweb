package a1020.anonymous.exam1;

public class Car {
    private Tire tire1 =new Tire();

    // 필드에 익명 자식 객체 대입
    private Tire tire2 = new Tire(){
        @Override
        public void roll(){
            System.out.println("익명 자식 Tire 객체1이 굴러갑니다.");
        }
    };
}
