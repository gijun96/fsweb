package a1013.shopService;

public class ShopService {
    // 정적변수를 사용하여 유일한 인스턴스를 저장
    private static ShopService shopService=new ShopService();

    // 생성자를 private를 선언하여 외부에서 객체생성을 막음
    private ShopService(){

    }

    // 정적 메소드를 사용하여 유일한 인스턴스를 반환
    public static ShopService getInstance(){

        return shopService;
    }
}
