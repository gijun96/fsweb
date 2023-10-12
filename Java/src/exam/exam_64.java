package exam;

import java.util.Scanner;

public class exam_64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = a % b;

        System.out.printf("%d % %d = %d", a, b, result);
    }
}
