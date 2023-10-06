package exam;

import java.util.Scanner;

public class exam_41 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        공이 날아간 거리 n을 입력받는다.
        int n = scanner.nextInt();
        if(n >=30 && n <=40){
            System.out.println("win");
        } else if (n >=60 && n<=70) {
            System.out.println("win");
        }else {
            System.out.println("lose");
        }


    }
}
