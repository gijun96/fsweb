package a1018.Generic.ex1_1;

public class GenericExample2 {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setValue("안녕하세요.");

        Box<Integer> box2 =new Box<>();
        box2.setValue(100);

        System.out.println(box1.getValue());

        System.out.println(box2.getValue());
    }
}
