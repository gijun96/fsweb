package exam;

import java.util.Scanner;

public class exam_72 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int max =0;
        while(true){
            System.out.println("숫자를 입력하세요.");
            int n =scanner.nextInt();
            if (max <n){
                max = n;
            }else if(n ==0){
                System.out.println("시스템을 종료합니다.");
                break;
            }
            System.out.println(max);
        }



    }
}
