package exam;

import java.util.Scanner;

public class exam_6 {
    public static void main(String[] args) {
//      실수 한 개를 입력받아 소수점 이하 3째 자리에서 반올림 하여 2째 자리까지 출력하시오
//        1.59254 => 1.59
        Scanner scanner =new Scanner(System.in);
        while (true) {
            System.out.println("실수를 입력하세요.");
            float fsc = scanner.nextFloat();
//            System.out.printf("%.2f", fsc);
            System.out.println(Math.floor(fsc*100)/100);
            System.out.println();
        }
    }
}
