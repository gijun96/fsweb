package exam;

import java.util.Scanner;

public class exam_70 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        // 초기 값 a
        int a = scan.nextInt();
        // 등차의 값 d
        int d =scan.nextInt();
        // 몇번째 숫자인지 나타내는 수 ,n
        int n = scan.nextInt();
        int result=0;
        for (int i = 1; i < n;i++){
            result = a * d;
            a= result;
        }
        System.out.println(result);
    }
}