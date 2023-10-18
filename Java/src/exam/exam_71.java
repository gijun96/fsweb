package exam;

import java.util.Scanner;

public class exam_71 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int sum =0;
        while(true){
            System.out.println("숫자를 입력하세요.");
            int n =scanner.nextInt();
                sum += n;
            System.out.println(sum);
            if(n ==0){
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }
}
