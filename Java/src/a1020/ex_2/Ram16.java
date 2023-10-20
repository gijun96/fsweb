package a1020.ex_2;

@FunctionalInterface
interface MyFactory<T> {
//    제네릭 타입의 T를 받고 create를 가지며 문자열 name을 받아 T 객체 생성
    T create(String name);
}

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Ram16 {
    public static void main(String[] args) {
        // 람다식 메소드 참조
        MyFactory<Product> factory = Product::new;
        // Product 생성자를 MyFactory<Product> 인터페이스에 연결
        // create 메소드에서 문자열을 인자로 받아 Product 객체를 생성
        Product product = factory.create("Smartphone");
        String productName = product.getName(); // 결과: "Smartphone"

        System.out.println("제품 이름: " + productName);
    }
}