package exam;

import java.util.Scanner;

public class exam_33 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("원하시는 달을 입력하세요.");
        int month = scanner.nextInt();
        if (3<= month && month<6){
            System.out.println("Spring");
        }else if(6 <= month && month<9){
            System.out.println("Summer");
        } else if (9<= month && month <12 ) {
            System.out.println("Fall");
        }else{
            System.out.println("Winter");
        }

    }
}
