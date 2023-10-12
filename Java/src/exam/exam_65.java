package exam;

import java.util.Scanner;

public class exam_65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("정수를 입력하세요.");
            int a = scanner.nextInt();
            for (int i=1; i<a;i++){
                int res = i;
                if ((i%10)%3==0 && i%10 !=0){
                    System.out.printf("%s ", "X");
                }else{
                    System.out.printf("%d ", res);
                }
            }
    }
}
