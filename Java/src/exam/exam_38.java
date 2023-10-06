package exam;

import java.util.Scanner;

public class exam_38 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("밑변의 길이 입력하세요.");
        int n = scanner.nextInt();
        System.out.println("높이를 입력하세요");
        int m = scanner.nextInt();

        System.out.printf("삼각형의 넓이 : "+"%.1f",(float) n *m /2);

    }
}
