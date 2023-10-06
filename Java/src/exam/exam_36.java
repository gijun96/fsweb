package exam;

import java.util.Scanner;

public class exam_36 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("정수n를 입력하세요.");
        int n = scanner.nextInt();
        System.out.println("정수m를 입력하세요.");
        int m = scanner.nextInt();
        for (int i = 1; i<=n;i++){
            for(int j =1; j<=m;j++){
                System.out.println(i +","+ j);
            }
        }
    }
}
