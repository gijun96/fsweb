package exam;

import java.util.Scanner;

public class exam_11 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
     while(true){
         System.out.println("숫자를 입력해주세요.");
         int a = scanner.nextInt();
         if (a ==0){
             System.out.println(a +"\n종료");
             break;
         }
         System.out.println(a);
     }
    }
}
