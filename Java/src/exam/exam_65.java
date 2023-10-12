package exam;

import java.util.Scanner;

public class exam_65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("정수a를 입력하세요.");
            int a = scanner.nextInt();
            if (a > 0 && a <= 10) {
                for (int i = 1; i <= a; i++) {
                    if ((i % 10) % 3 == 0 && i % 10 != 0) System.out.printf("%s ", "X");
                    else System.out.printf("%d ", i);
                }
            }else {
                System.out.println("정수a는 1~10까지의 수 입니다.");
                continue;
            }
            break;
        }
    }
}
