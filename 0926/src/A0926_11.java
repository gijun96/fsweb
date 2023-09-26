
public class A0926_11 {
  public static void main(String[] args) {

    int apple = 1;
    double pieceUnit = 0.1;
    int number = 7;

    double result = apple - number * pieceUnit;
    System.out.println("사과 1개에서 남은 양 : "+ result);
    //부등소수점연산으로 정확한 값이 나오지 않는다.
    

  }
}
