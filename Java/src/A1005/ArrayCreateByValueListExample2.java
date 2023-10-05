package A1005;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        // 배열 변수 선언
        int[] scores;
        // 배열 변수에 배열을 대입
        scores = new int[] { 83, 90, 87 };
        // 배열 항목의 총합을 구하고 출력
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합: " + sum1);

        // 배열을 매개값으로 주고, printItem() 메소드 호출
        ArrayCreateByValueListExample2 obj = new ArrayCreateByValueListExample2();
        obj.printItem(new int[] { 83, 90, 87 });
    }

    /*


    `static` 키워드를 메소드나 변수에 붙일 때는 다음 상황에서 사용합니다:

            1. **클래스 메소드 (Static 메소드)**:
            - 메소드를 객체의 인스턴스에 종속되지 않고, 클래스 자체에 속한 메소드로 만들고 싶을 때 사용합니다.
            - 클래스 메소드는 클래스 이름을 통해 직접 호출할 수 있습니다.
   - 주로 유틸리티 메소드나 프로그램의 진입점인 `main` 메소드와 같은 메소드를 `static`으로 선언합니다.
            - 예시: `public static void main(String[] args) { ... }`

            2. **클래스 변수 (Static 변수)**:
            - 모든 객체 인스턴스가 공유하는 변수로 만들고 싶을 때 사용합니다.
   - 클래스 변수는 모든 객체가 동일한 값을 공유하며, 객체 인스턴스 간에 데이터 공유에 유용합니다.
            - 예시: `private static int count = 0;`

            3. **상수 (Static 상수)**:
            - 변경되지 않는 값으로 사용되는 상수를 표현하기 위해 `static` 키워드와 `final` 키워드를 함께 사용합니다.
   - 상수는 주로 대문자로 작성하며, 여러 객체에서 공유되는 상수 값을 나타냅니다.
   - 예시: `public static final double PI = 3.14159;`

    일반적으로 클래스 레벨에서 데이터를 공유하거나, 객체 인스턴스와 관계 없이 독립적인 작업을 수행하는 경우에 `static` 키워드를 사용합니다.
     객체 인스턴스와 관련된 데이터는 객체 변수와 인스턴스 메소드를 사용하여 처리하는 반면,
      클래스 전체에 관련된 데이터는 클래스 변수와 클래스 메소드로 처리합니다.

    */
    // printItem() 메소드 선언 (객체 인스턴스 메소드로 변경)
    public void printItem(int[] scores) {
        // 매개변수가 참조하는 배열의 항목을 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }
}