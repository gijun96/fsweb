package exam;

import java.util.Scanner;

public class exam_8 {
    public static void main(String[] args) {
    // 영문자 한 개를 입력받아 아스키코드 10진수 값으로 출력하는 프로그램을 작성해보자
        Scanner scanner =new Scanner(System.in);
        while(true) {
            char a = scanner.nextLine().charAt(0);
            int n = (a);
            System.out.println(n);
        }
    }
}
