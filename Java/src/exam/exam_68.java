package exam;

import java.util.Scanner;

public class exam_68 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int a = scan.nextInt();
        for (int i = 0; i <= a; i++){
            System.out.println(i);
        }

    }
}