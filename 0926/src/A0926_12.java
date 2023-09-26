
public class A0926_12{
  public static void main(String[] args) {

    int apple = 1;
    int totalPieces = apple *10;
    int number = 7;

    double result = totalPieces - number;

    System.out.println("사과 10개에서 남은 양 : "+ result);
    System.out.println("사과 1개에서 남은 양 : "+ result/10.0);
    //부등소수점연산으로 정확한 값이 나오지 않는다.
    

  }
}
