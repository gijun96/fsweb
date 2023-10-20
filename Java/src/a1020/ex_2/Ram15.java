package a1020.ex_2;

import java.util.function.Supplier;

class Person1 {
    private String name;
    public Person1(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class Ram15 {
    public static void main(String[] args) {
        // 람다식 메소드 참조
        Person1 person = new Person1("Alice");
        Supplier<String> getNameSupplier = person::getName;
        String name = getNameSupplier.get(); // 결과: "Alice"
        System.out.println("이름: " + name);
    }
}

