package exam;

import java.util.Scanner;

public class exam_5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true) {
            System.out.println("A를 입력하세요.");
            String A = scanner.next();
            System.out.println("b를 입력하세요.");
            String b = scanner.next();
            System.out.println("b: "+b + "\tA : " + A);
        }
    }
}
