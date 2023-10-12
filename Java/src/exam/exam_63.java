package exam;

import java.util.Scanner;

public class exam_63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("일수를 입력하세요.");
        int hour = a * 24;
        System.out.printf("%d일 ==> %d", a, hour);
    }
}
