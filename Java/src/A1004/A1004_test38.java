package A1004;

import java.util.Scanner;

public class A1004_test38 {
    public static void main(String[] args) {

       Scanner scanner =new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();

       float width = (a*b)/2f;
        System.out.println("가로a와 높이b를 가진 삼각형의 넓이 : " + width);

    }
}
