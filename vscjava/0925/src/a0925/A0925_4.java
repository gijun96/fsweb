package a0925;

public class A0925_4 {
  public static void main(String[] args) {
    int x = 3;
    int y = 5;

    System.out.println("x :"+ x + ", y: " + y);
    int temp = x ; /* 3 */
    x= y; /* 5 */
    y = temp; /* 3 */
    System.out.println("x :"+ x + ", y: " + y);
  }
  
}
