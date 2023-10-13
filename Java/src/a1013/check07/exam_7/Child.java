package a1013.check07.exam_7;

    public class Child extends Parent {
    public String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String nation)");
    }

}
