package exam;

import java.util.Scanner;

public class exam_37 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("정수n를 입력하세요.");
        int n = scanner.nextInt();
       for (int i = 0; i<n;i++){
           for(int j=0; j<n;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
