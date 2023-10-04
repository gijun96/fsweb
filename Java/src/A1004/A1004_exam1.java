package A1004;

import java.util.Scanner;

public class A1004_exam1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("값을 입력하세요.");
            int inputVal = scanner.nextInt();
            if (inputVal % 2 == 0) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
        }
    }
}
