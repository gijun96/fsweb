package exam;

import java.util.Scanner;

public class exam_35 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int n = scanner.nextInt();

        int sum =0;
        for (int i =0;i<n;i++){
            if(i%2 ==0)sum+=i;
        }
        System.out.println(sum);
    }
}
