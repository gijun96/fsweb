package exam;

import java.util.Scanner;

public class exam_4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while(true) {
            System.out.println("정수 a를 입력하세요");
            int a = scanner.nextInt();
            System.out.println("정수 b를 입력하세요");
            int b = scanner.nextInt();
            System.out.println("정수 a : " +a+ "\t정수 b : " +b);
            System.out.println("-----------------------------");
        }
    }
}
